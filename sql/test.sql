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

