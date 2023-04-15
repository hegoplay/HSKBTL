go
create table HopDong(
	id int identity(1,1) primary key,
	maHopDong nvarchar(10) unique,
	maNV varchar(7),
	maKH varchar(7),
	maTour varchar(8),
	ngayDk date,
	ngayGiaoDich date,
	daTra bit,
	tgTra Datetime,
	giaHopDong money,
	hoanTien bit,
	tgHoanTien datetime,
	soTienHoan money
)
alter table HopDong add constraint maNV_HopDong_fkey foreign key (maNV) references NhanVien(maNV)
alter table HopDong add constraint maKH_HopDong_fkey foreign key (maKH) references KhachHang(maKH)


go

create table Tour(
	id int identity(1,1) primary key,
	maTour varchar(8),
	tenGD nvarchar(50),
	tgTaoTour DateTime,
	tgBatDau datetime,
	tgKetThuc datetime,
	soLuong int,
	maKH varchar(7),
	maNV varchar(7)
);

alter table Tour add constraint maNV_HopDong_fkey foreign key (maNV) references NhanVien(maNV)
alter table Tour add constraint maKH_HopDong_fkey foreign key (maKH) references KhachHang(maKH)

go

create table TourPhongKhachSan(
	id int identity (1,1) primary key,
	maTour varchar(8) ,
	maKS int,
	giamGia float,
	moTa text
	unique (maTour,maKS)
)
alter table TourPhongKhachSan add constraint maKS_TourPhongKhachSan_pkey foreign key (maKS) references KhachSan(maKhachSan)
go
create table VePhuongTIen(
	maDiChuyen int identity(1,1) primary key,
	maTour varchar(8),
	maVe int,
	gia money,
	giamGia float,
	moTa text,
	unique(maTour,maVe)
)
alter table VePhuongTien add constraint maPT_VePhuongTien foreign key (maVe) references VeDiChuyen(maVe)