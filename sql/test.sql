create database QLDuLich

use QLDuLich
drop table KhachHang
create table KhachHang(
	maKH varchar(7) primary key,
	ho nvarchar(50) not null, 
	ten nvarchar(50) not null,
	diaChi nvarchar(50),
	SDT varchar(12) not null,
	email nvarchar(50),
	ngayDK datetime
);
go

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
Select tenLoaiVe from LoaiVe

Select * from KhachHang where ho like '%' and ten like '%' and email like '%' and SDT like '%'