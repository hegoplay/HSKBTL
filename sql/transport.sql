go
use QLDuLich

create table LoaiVe (
	maLoaiVe int identity(1,1) primary key,
	tenLoaiVe nvarchar(20)
)

go
use QLDuLich
create table LoaiPhuongTien(
	maLoai int identity(1,1) primary key,
	tenLoai nvarchar(20)
)

go
use QLDuLich
create table CongTyPhuongTien (
	maCongTy int identity(1,1) primary key,
	tenCongTy nvarchar(50),
	maTinhThanh nvarchar(20) not null,
	diaChiLienHe nvarchar(255) unique,
	maLoaiPhuongTien int not null,
	moTa text,
	laThanhVien bit,
	conHoatDong bit
)

alter table CongTyPhuongTien add constraint maTinhThanh_CTPT_fkey foreign key (maTinhThanh) references TinhThanh(maTinhThanh) on delete cascade
alter table CongTyPhuongTien add constraint maLoaiPhuongTien_CTPT_fkey foreign key (maLoaiPhuongTien) references LoaiPhuongTien(maLoai)

go
use QLDuLich
create table VeDiChuyen(
	maVe int identity(1,1) primary key,
	maCongTy int not null,
	maLoaiVe int not null,
	maTinhDiemDi nvarchar(20) not null,
	maTinhDiemDen nvarchar (20) not null,
	giaVe money not null,
	conHoatDong bit
)

alter table VeDiChuyen add constraint maTinhDiemDi_VDC_fkey foreign key (maTinhDiemDi) references TinhThanh(maTinhThanh) on delete cascade
alter table VeDiChuyen add constraint maTinhDiemDen_VDC_fkey foreign key (maTinhDiemDen) references TinhThanh(maTinhThanh)
alter table VeDiChuyen add constraint maLoaiVe_VDC_fkey foreign key (maLoaiVe) references LoaiVe(maLoaiVe)
alter table VeDiChuyen add constraint maCongTy_VDC_fkey foreign key (maCongTy) references CongTyPhuongTien(maCongTy)