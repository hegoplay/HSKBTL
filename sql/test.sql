create database QLDuLich

use QLDuLich
drop table KhachHang
create table KhachHang(
	maKH varchar(7) primary key,
	hoTen nvarchar(50) not null, 
	diaChi nvarchar(50),
	SDT int not null,
	maBuuChinh int not null,
	email nvarchar(50),
	maTruongDoan varchar(7),
	maCD nvarchar(50)
);
drop table ChuyenBay
create table ChuyenBay(
	maCB varchar(6),
	maKH varchar(7) references KhachHang(maKH),
	hangVe  nvarchar(50),
	loaiVe nvarchar(50),
	isNguoiLon bit,
	addOns nvarchar(50),
	tgBatDat datetime not null,
	tgKetThuc datetime not null,
	tenHangMB nvarchar(20) not null
	
);
alter table KhachHang
add constraint FK_TruongDoan
Foreign key (maTruongDoan) references KhachHang(maKH)

--create table Tour(
--	tourID varchar(7) primary key,
--	diadiem nvarchar(50)not null,
--	thoiGian Datetime,
--	moTa nvarchar(255),
--	lichTrinh int,
--);

create table userAccess(
	userName nvarchar(16),
	pass nvarchar(20)
)

insert into userAccess values('abc','123')

