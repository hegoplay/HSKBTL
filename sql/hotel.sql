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
alter table KhachSan add constraint maTinhThanh_fkey foreign key (maTinhThanh) references TinhThanh(maTinhThanh) on delete cascade
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
insert into LoaiPhong(tenLoai) values ('Phòng đơn'),('Phòng đôi'),('Phòng 4'),('Phòng 6'),('Phòng đơn có hành lang')
insert into KhachSan(tenKhachSan,maTinhThanh,diaChiKhachSan,moTa,laThanhVien,conHoatDong) values
	('Hanoi Prime Center Hotel','01','36 Hang Huong, Quận Hoàn Kiếm, Hà Nội, Việt Nam','Tọa lạc tại một vị trí thuận tiện ở thành phố Hà Nội, Hanoi Prime Center Hotel cung cấp phòng nghỉ gắn máy điều hòa với WiFi miễn phí, chỗ đỗ xe riêng và dịch vụ phòng. Khách sạn 3 sao này có lễ tân 24 giờ, dịch vụ tiền sảnh, dịch vụ đưa đón sân bay và dịch vụ cho thuê xe đạp.',1,1),
	('22Land Residence Hotel & Spa Cau Giay HaNoi','01','02 Nguyen Dinh Hoan, Cau Giay, Hà Nội, Việt Nam','Nằm ở thành phố Hà Nội, cách Bảo tàng Dân tộc học Việt Nam 1,5 km, 22Land Residence Hotel & Spa Cau Giay HaNoi cung cấp chỗ nghỉ 4 sao và có sân hiên, nhà hàng cũng như quầy bar. Khách sạn 4 sao này cung cấp WiFi miễn phí, dịch vụ phòng và dịch vụ lễ tân 24 giờ. Chỗ nghỉ có hồ bơi ngoài trời mở cửa quanh năm, trung tâm thể dục, phòng xông hơi khô và sảnh khách chung.',1,1),
	('Khách sạn Dana Marina','48','47 - 49 Đường Võ Văn Kiệt, Phước Mỹ, Phước Mỹ, Da Nang, Việt Nam','Nằm ở vị trí trung tâm tại Phước Mỹ của Da Nang, chỗ nghỉ này đặt quý khách ở gần các điểm thu hút và tùy chọn ăn uống thú vị. Hãy nhớ dành một chút thời gian để thăm thú Ngũ Hành Sơn cũng như Biển Mỹ Khê gần đó. Được xếp hạng 4 sao, chỗ nghỉ chất lượng cao này cho phép khách nghỉ sử dụng bể bơi trong nhà, bể bơi ngoài trời và phòng tập ngay trong khuôn viên.',1,1)