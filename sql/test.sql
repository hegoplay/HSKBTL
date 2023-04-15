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
create table VaiTroNV(
	idVaiTro int identity(1,1) primary key,
	tenVaiTro nvarchar(50) unique
)

insert into VaiTroNV(tenVaiTro) values('Giám đốc'),('Trưởng phòng kinh doanh'),('Nhân viên kinh doanh'),('Trưởng phòng marketing'),('Nhân viên marketing'),('Trưởng tour')

go
create table NhanVien(
	maNV varchar(7) primary key,
	ho nvarchar(50),
	ten nvarchar(50),
	dob Datetime,
	diaChi nvarchar(255),
	SDT int,
	email nvarchar(50),
	idVaiTro int
);

alter table NhanVien add constraint idVaiTroNV_pkey foreign key (idVaiTro) references VaiTroNV(idVaiTro) 

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

