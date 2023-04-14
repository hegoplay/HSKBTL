create table KhachSan (
	maKhachSan int identity(1,1) primary key,
	tenKhachSan nvarchar(255),
	maTinhThanh nvarchar(20),
	diaChiKhachSan nvarchar(255),
	moTa text,
	laThanhVien bit,
	conHoatDong bit
)
go
alter table KhachSan add constraint maTinhThanh_fkey foreign key (maTinhThanh) references TinhThanh(maTinhThanh)
go
create table LoaiPhong(
	maLoaiPhong int identity(1,1) primary key,
	tenLoai varchar(64)
)
go

create table DichVuKhachSan(
	maKhachSan int,
	maLoaiPhong int,
	giaDichVu money,
	hoatDong bit,
	primary key(maKhachSan,maLoaiPhong)
)
go
alter table DichVuKhachSan add constraint maKhachSan_fkey foreign key (maKhachSan) references KhachSan(maKhachSan)
alter table DichVuKhachSan add constraint maLoaiPhong_fkey foreign key (maLoaiPHong) references LoaiPhong(maLoaiPhong)