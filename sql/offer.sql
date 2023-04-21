
go
create table Tour(
	maTour varchar(8) primary key,
	tenTour nvarchar(50),
	tgBatDau datetime,
	tgKetThuc datetime,
	maTPDiemDi nvarchar(20),
	maTPDiemDen nvarchar(20)
);
create table KHTour(
	maTour varchar(8),
	maKH varchar(7)
	primary key (maTour,maKH)
)
alter table KHTour drop constraint maKH_KhachHang_fkey
alter table KHTour add constraint maTour_Tour_fkey foreign key (maTour) references Tour(maTour)
alter table KHTour add constraint maKH_KhachHang_fkey foreign key (maKH) references KhachHang(maKH)
go

create table TourKhachSan(
	maKS int primary key,
	maTour varchar(8) ,
	
	giamGia float,
	moTa text
	unique (maTour,maKS)
)
alter table TourKhachSan add constraint maTour_TourPhongKhachSan_pkey foreign key (maTour) references Tour(maTour)
go
create table VePhuongTien(
	maDiChuyen int identity(1,1) primary key,
	maTour varchar(8),
	maVe int,
	gia money,
	giamGia float,
	moTa text,
	unique(maTour,maVe)
)
alter table VePhuongTien add constraint maPT_VePhuongTien foreign key (maTour) references Tour(maTour)