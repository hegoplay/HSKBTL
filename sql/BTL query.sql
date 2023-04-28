create database QLDuLich
go
use QLDuLich
CREATE TABLE TinhThanh (
	maTinhThanh nvarchar(20) NOT NULL,
	tenTinhThanh nvarchar(255) NOT NULL,
	tenTinhThanh_en nvarchar(255) NULL,
	tenDayDu nvarchar(255) NOT NULL,
	tenDayDu_en nvarchar(255) NULL,
	tenMa nvarchar(255) NULL,
	administrative_unit_id int,
	administrative_region_id int,
	CONSTRAINT provinces_pkey PRIMARY KEY (maTinhThanh)
);
go
use QLDuLich
INSERT INTO TinhThanh (maTinhThanh,tenTinhThanh,tenTinhThanh_en,tenDayDu,tenDayDu_en,tenMa,administrative_unit_id,administrative_region_id) VALUES
	 ('01',N'Hà Nội',N'Ha Noi',N'Thành phố Hà Nội',N'Ha Noi City',N'ha_noi',1,3),
	 ('26',N'Vĩnh Phúc',N'Vinh Phuc',N'Tỉnh Vĩnh Phúc',N'Vinh Phuc Province',N'vinh_phuc',2,3),
	 ('27',N'Bắc Ninh',N'Bac Ninh',N'Tỉnh Bắc Ninh',N'Bac Ninh Province',N'bac_ninh',2,3),
	 ('30',N'Hải Dương',N'Hai Duong',N'Tỉnh Hải Dương',N'Hai Duong Province',N'hai_duong',2,3),
	 ('31',N'Hải Phòng',N'Hai Phong',N'Thành phố Hải Phòng',N'Hai Phong City',N'hai_phong',1,3),
	 ('33',N'Hưng Yên',N'Hung Yen',N'Tỉnh Hưng Yên',N'Hung Yen Province',N'hung_yen',2,3),
	 ('34',N'Thái Bình',N'Thai Binh',N'Tỉnh Thái Bình',N'Thai Binh Province',N'thai_binh',2,3),
	 ('35',N'Hà Nam',N'Ha Nam',N'Tỉnh Hà Nam',N'Ha Nam Province',N'ha_nam',2,3),
	 ('96',N'Cà Mau',N'Ca Mau',N'Tỉnh Cà Mau',N'Ca Mau Province',N'ca_mau',2,8),
	 ('02',N'Hà Giang',N'Ha Giang',N'Tỉnh Hà Giang',N'Ha Giang Province',N'ha_giang',2,1);
INSERT INTO TinhThanh (maTinhThanh,tenTinhThanh,tenTinhThanh_en,tenDayDu,tenDayDu_en,tenMa,administrative_unit_id,administrative_region_id) VALUES
	 ('04',N'Cao Bằng',N'Cao Bang',N'Tỉnh Cao Bằng',N'Cao Bang Province',N'cao_bang',2,1),
	 ('06',N'Bắc Kạn',N'Bac Kan',N'Tỉnh Bắc Kạn',N'Bac Kan Province',N'bac_kan',2,1),
	 ('08',N'Tuyên Quang',N'Tuyen Quang',N'Tỉnh Tuyên Quang',N'Tuyen Quang Province',N'tuyen_quang',2,1),
	 ('19',N'Thái Nguyên',N'Thai Nguyen',N'Tỉnh Thái Nguyên',N'Thai Nguyen Province',N'thai_nguyen',2,1),
	 ('20',N'Lạng Sơn',N'Lang Son',N'Tỉnh Lạng Sơn',N'Lang Son Province',N'lang_son',2,1),
	 ('22',N'Quảng Ninh',N'Quang Ninh',N'Tỉnh Quảng Ninh',N'Quang Ninh Province',N'quang_ninh',2,1),
	 ('24',N'Bắc Giang',N'Bac Giang',N'Tỉnh Bắc Giang',N'Bac Giang Province',N'bac_giang',2,1),
	 ('25',N'Phú Thọ',N'Phu Tho',N'Tỉnh Phú Thọ',N'Phu Tho Province',N'phu_tho',2,1),
	 ('10',N'Lào Cai',N'Lao Cai',N'Tỉnh Lào Cai',N'Lao Cai Province',N'lao_cai',2,2),
	 ('11',N'Điện Biên',N'Dien Bien',N'Tỉnh Điện Biên',N'Dien Bien Province',N'dien_bien',2,2);
INSERT INTO TinhThanh (maTinhThanh,tenTinhThanh,tenTinhThanh_en,tenDayDu,tenDayDu_en,tenMa,administrative_unit_id,administrative_region_id) VALUES
	 ('12',N'Lai Châu',N'Lai Chau',N'Tỉnh Lai Châu',N'Lai Chau Province',N'lai_chau',2,2),
	 ('14',N'Sơn La',N'Son La',N'Tỉnh Sơn La',N'Son La Province',N'son_la',2,2),
	 ('15',N'Yên Bái',N'Yen Bai',N'Tỉnh Yên Bái',N'Yen Bai Province',N'yen_bai',2,2),
	 ('17',N'Hoà Bình',N'Hoa Binh',N'Tỉnh Hoà Bình',N'Hoa Binh Province',N'hoa_binh',2,2),
	 ('70',N'Bình Phước',N'Binh Phuoc',N'Tỉnh Bình Phước',N'Binh Phuoc Province',N'binh_phuoc',2,7),
	 ('72',N'Tây Ninh',N'Tay Ninh',N'Tỉnh Tây Ninh',N'Tay Ninh Province',N'tay_ninh',2,7),
	 ('74',N'Bình Dương',N'Binh Duong',N'Tỉnh Bình Dương',N'Binh Duong Province',N'binh_duong',2,7),
	 ('75',N'Đồng Nai',N'Dong Nai',N'Tỉnh Đồng Nai',N'Dong Nai Province',N'dong_nai',2,7),
	 ('79',N'Hồ Chí Minh',N'Ho Chi Minh',N'Thành phố Hồ Chí Minh',N'Ho Chi Minh City',N'ho_chi_minh',1,7),
	 ('77',N'Bà Rịa - Vũng Tàu',N'Ba Ria - Vung Tau',N'Tỉnh Bà Rịa - Vũng Tàu',N'Ba Ria - Vung Tau Province',N'ba_ria_vung_tau',2,7);
INSERT INTO TinhThanh (maTinhThanh,tenTinhThanh,tenTinhThanh_en,tenDayDu,tenDayDu_en,tenMa,administrative_unit_id,administrative_region_id) VALUES
	 ('36',N'Nam Định',N'Nam Dinh',N'Tỉnh Nam Định',N'Nam Dinh Province',N'nam_dinh',2,3),
	 ('37',N'Ninh Bình',N'Ninh Binh',N'Tỉnh Ninh Bình',N'Ninh Binh Province',N'ninh_binh',2,3),
	 ('38',N'Thanh Hóa',N'Thanh Hoa',N'Tỉnh Thanh Hóa',N'Thanh Hoa Province',N'thanh_hoa',2,4),
	 ('40',N'Nghệ An',N'Nghe An',N'Tỉnh Nghệ An',N'Nghe An Province',N'nghe_an',2,4),
	 ('42',N'Hà Tĩnh',N'Ha Tinh',N'Tỉnh Hà Tĩnh',N'Ha Tinh Province',N'ha_tinh',2,4),
	 ('44',N'Quảng Bình',N'Quang Binh',N'Tỉnh Quảng Bình',N'Quang Binh Province',N'quang_binh',2,4),
	 ('45',N'Quảng Trị',N'Quang Tri',N'Tỉnh Quảng Trị',N'Quang Tri Province',N'quang_tri',2,4),
	 ('46',N'Thừa Thiên Huế',N'Thua Thien Hue',N'Tỉnh Thừa Thiên Huế',N'Thua Thien Hue Province',N'thua_thien_hue',2,4),
	 ('48',N'Đà Nẵng',N'Da Nang',N'Thành phố Đà Nẵng',N'Da Nang City',N'da_nang',1,5),
	 ('49',N'Quảng Nam',N'Quang Nam',N'Tỉnh Quảng Nam',N'Quang Nam Province',N'quang_nam',2,5);
INSERT INTO TinhThanh (maTinhThanh,tenTinhThanh,tenTinhThanh_en,tenDayDu,tenDayDu_en,tenMa,administrative_unit_id,administrative_region_id) VALUES
	 ('51',N'Quảng Ngãi',N'Quang Ngai',N'Tỉnh Quảng Ngãi',N'Quang Ngai Province',N'quang_ngai',2,5),
	 ('52',N'Bình Định',N'Binh Dinh',N'Tỉnh Bình Định',N'Binh Dinh Province',N'binh_dinh',2,5),
	 ('54',N'Phú Yên',N'Phu Yen',N'Tỉnh Phú Yên',N'Phu Yen Province',N'phu_yen',2,5),
	 ('56',N'Khánh Hòa',N'Khanh Hoa',N'Tỉnh Khánh Hòa',N'Khanh Hoa Province',N'khanh_hoa',2,5),
	 ('58',N'Ninh Thuận',N'Ninh Thuan',N'Tỉnh Ninh Thuận',N'Ninh Thuan Province',N'ninh_thuan',2,5),
	 ('60',N'Bình Thuận',N'Binh Thuan',N'Tỉnh Bình Thuận',N'Binh Thuan Province',N'binh_thuan',2,5),
	 ('62',N'Kon Tum',N'Kon Tum',N'Tỉnh Kon Tum',N'Kon Tum Province',N'kon_tum',2,6),
	 ('64',N'Gia Lai',N'Gia Lai',N'Tỉnh Gia Lai',N'Gia Lai Province',N'gia_lai',2,6),
	 ('66',N'Đắk Lắk',N'Dak Lak',N'Tỉnh Đắk Lắk',N'Dak Lak Province',N'dak_lak',2,6),
	 ('67',N'Đắk Nông',N'Dak Nong',N'Tỉnh Đắk Nông',N'Dak Nong Province',N'dak_nong',2,6);
INSERT INTO TinhThanh (maTinhThanh,tenTinhThanh,tenTinhThanh_en,tenDayDu,tenDayDu_en,tenMa,administrative_unit_id,administrative_region_id) VALUES
	 ('68',N'Lâm Đồng',N'Lam Dong',N'Tỉnh Lâm Đồng',N'Lam Dong Province',N'lam_dong',2,6),
	 ('80',N'Long An',N'Long An',N'Tỉnh Long An',N'Long An Province',N'long_an',2,8),
	 ('82',N'Tiền Giang',N'Tien Giang',N'Tỉnh Tiền Giang',N'Tien Giang Province',N'tien_giang',2,8),
	 ('83',N'Bến Tre',N'Ben Tre',N'Tỉnh Bến Tre',N'Ben Tre Province',N'ben_tre',2,8),
	 ('84',N'Trà Vinh',N'Tra Vinh',N'Tỉnh Trà Vinh',N'Tra Vinh Province',N'tra_vinh',2,8),
	 ('86',N'Vĩnh Long',N'Vinh Long',N'Tỉnh Vĩnh Long',N'Vinh Long Province',N'vinh_long',2,8),
	 ('87',N'Đồng Tháp',N'Dong Thap',N'Tỉnh Đồng Tháp',N'Dong Thap Province',N'dong_thap',2,8),
	 ('89',N'An Giang',N'An Giang',N'Tỉnh An Giang',N'An Giang Province',N'an_giang',2,8),
	 ('91',N'Kiên Giang',N'Kien Giang',N'Tỉnh Kiên Giang',N'Kien Giang Province',N'kien_giang',2,8),
	 ('92',N'Cần Thơ',N'Can Tho',N'Thành phố Cần Thơ',N'Can Tho City',N'can_tho',1,8);
INSERT INTO TinhThanh (maTinhThanh,tenTinhThanh,tenTinhThanh_en,tenDayDu,tenDayDu_en,tenMa,administrative_unit_id,administrative_region_id) VALUES
	 ('93',N'Hậu Giang',N'Hau Giang',N'Tỉnh Hậu Giang',N'Hau Giang Province',N'hau_giang',2,8),
	 ('94',N'Sóc Trăng',N'Soc Trang',N'Tỉnh Sóc Trăng',N'Soc Trang Province',N'soc_trang',2,8),
	 ('95',N'Bạc Liêu',N'Bac Lieu',N'Tỉnh Bạc Liêu',N'Bac Lieu Province',N'bac_lieu',2,8);
alter table TinhThanh
drop column administrative_unit_id
alter table TinhThanh
drop column administrative_region_id
go
--drop table KhachSan
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
insert into KhachSan(tenKhachSan,maTinhThanh,diaChiKhachSan,moTa,laThanhVien,conHoatDong) values
	(N'Hanoi Prime Center Hotel','01',N'36 Hang Huong, Quận Hoàn Kiếm, Hà Nội, Việt Nam',N'Tọa lạc tại một vị trí thuận tiện ở thành phố Hà Nội, Hanoi Prime Center Hotel cung cấp phòng nghỉ gắn máy điều hòa với WiFi miễn phí, chỗ đỗ xe riêng và dịch vụ phòng. Khách sạn 3 sao này có lễ tân 24 giờ, dịch vụ tiền sảnh, dịch vụ đưa đón sân bay và dịch vụ cho thuê xe đạp.',1,1),
	(N'22Land Residence Hotel & Spa Cau Giay HaNoi','01',N'02 Nguyen Dinh Hoan, Cau Giay, Hà Nội, Việt Nam',N'Nằm ở thành phố Hà Nội, cách Bảo tàng Dân tộc học Việt Nam 1,5 km, 22Land Residence Hotel & Spa Cau Giay HaNoi cung cấp chỗ nghỉ 4 sao và có sân hiên, nhà hàng cũng như quầy bar. Khách sạn 4 sao này cung cấp WiFi miễn phí, dịch vụ phòng và dịch vụ lễ tân 24 giờ. Chỗ nghỉ có hồ bơi ngoài trời mở cửa quanh năm, trung tâm thể dục, phòng xông hơi khô và sảnh khách chung.',1,1),
	(N'Khách sạn Dana Marina','48',N'47 - 49 Đường Võ Văn Kiệt, Phước Mỹ, Phước Mỹ, Da Nang, Việt Nam',N'Nằm ở vị trí trung tâm tại Phước Mỹ của Da Nang, chỗ nghỉ này đặt quý khách ở gần các điểm thu hút và tùy chọn ăn uống thú vị. Hãy nhớ dành một chút thời gian để thăm thú Ngũ Hành Sơn cũng như Biển Mỹ Khê gần đó. Được xếp hạng 4 sao, chỗ nghỉ chất lượng cao này cho phép khách nghỉ sử dụng bể bơi trong nhà, bể bơi ngoài trời và phòng tập ngay trong khuôn viên.',1,1)

go
use QLDuLich

create table LoaiVe (
	maLoaiVe int primary key,
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
--alter table CongTyPhuongTien drop constraint maLoaiPhuongTien_CTPT_fkey

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
insert into VeDiChuyen(maCongTy,maLoaiVe,maTinhDiemDi,maTinhDiemDen,giaVe,conHoatDong) values (5,1,'01','01',700,1)
alter table VeDiChuyen add constraint maTinhDiemDi_VDC_fkey foreign key (maTinhDiemDi) references TinhThanh(maTinhThanh) on delete cascade
alter table VeDiChuyen add constraint maTinhDiemDen_VDC_fkey foreign key (maTinhDiemDen) references TinhThanh(maTinhThanh)
alter table VeDiChuyen add constraint maLoaiVe_VDC_fkey foreign key (maLoaiVe) references LoaiVe(maLoaiVe)
--alter table VeDiChuyen drop constraint maLoaiVe_VDC_fkey
alter table VeDiChuyen add constraint maCongTy_VDC_fkey foreign key (maCongTy) references CongTyPhuongTien(maCongTy)
go

insert into loaiPhuongTien(tenLoai) values (N'Công ty hàng không'),(N'Công ty xe Khách'),(N'Công ty đường sắt'),(N'Công ty đường biển')
insert into LoaiVe(maLoaiVe,tenLoaiVe) values(1,N'thương gia'),(2,N'khứ hồi'),(3,N'phổ thông')
go
insert into CongTyPhuongTien(tenCongTy,maTinhThanh,diaChiLienHe,maLoaiPhuongTien,moTa,laThanhVien,conHoatDong) values 
(N'VietJetAir','01',N'302/3 Phố Kim Mã, Phường Ngọc Khánh, Quận Ba Đình, TP. Hà Nội, Việt Nam',1,N'Công ty Cổ phần Hàng không Vietjet, thường được biết đến với các thương hiệu Vietjet Air hay Vietjet, là hãng hàng không tư nhân đầu tiên của Việt Nam.',0,1),
(N'Tổng Công ty Đường sắt Việt Nam','01',N'Số 118 Lê Duẩn, Hoàn Kiếm, Hà Nội',3,N'Tổng Công ty Đường sắt Việt Nam (VNR) là mô hình Tổng Công ty Nhà nước thuộc sự quản lý của Bộ Giao thông Vận tải, được thành lập theo Quyết định số 34/2003/QĐ-TTg [1] ban hành ngày 4 tháng 3 năm 3 năm 2003 của Thủ tướng Chính phủ trên cơ sở tổ chức lại Liên hiệp Đường sắt Việt Nam, thực hiện nhiệm vụ sản xuất kinh doanh vận tải đường sắt; quản lý, bảo dưỡng, sửa chữa các cơ sở hạ tầng đường sắt cùng nhiều chức năng nhiệm vụ khác.',1,1),
(N'Bamboo Airways','01',N'Tòa nhà Bamboo Airways Tower, 265 Cầu Giấy, Phường Dịch Vọng, Quận Cầu Giấy, Hà Nội',1,N'Công ty Cổ phần Hàng không Tre Việt, hoạt động dưới tên thương mại Bamboo Airways hay Hãng Hàng không Tre Việt, là một hãng hàng không Việt Nam thuộc Tập đoàn FLC, có trụ sở chính tại Hà Nội và được đăng ký kinh doanh tại Bình Định.',0,1)
insert into CongTyPhuongTien(tenCongTy,maTinhThanh,diaChiLienHe,maLoaiPhuongTien,moTa,laThanhVien,conHoatDong) values 
('Vietnam Airlines','01',N'200 Nguyễn Sơn, P.Bồ Đề, Q.Long Biên, Hà Nội',1,N'Tổng công ty Hàng không Việt Nam - CTCP, thường được biết đến với thương hiệu  Vietnam Airlines JSC, lấy Hãng hàng không Quốc gia Việt Nam làm nòng cốt',1,1),
('Pacific Airlines','79',N'Tầng 3, Tòa nhà điều hành Tổng công ty Hàng không Việt Nam, Sân bay quốc tế Tân Sơn Nhất, phường 2, Quận Tân Bình, TP. Hồ Chí Minh, Việt Nam',1,N'Công ty Cổ phần Hàng không Pacific Airlines, trước đây hoạt động với tên gọi Jetstar Pacific, là hãng hàng không giá rẻ đầu tiên của Việt Nam, có trụ sở tại Sân bay quốc tế Tân Sơn Nhất (SGN), Thành phố Hồ Chí Minh, Việt Nam',1,1),
('Vietravel Airlines','46',N'Số 03 Hùng Vương, Phường Phú Hội, Thành phố Huế, Tỉnh Thừa Thiên Huế',1,N'Công ty Cổ phần Hàng không Lữ hành Việt Nam, thường được biết đến và hoạt động dưới tên thương mại Vietravel Airlines, là một hãng hàng không Việt Nam thuộc Vietravel. Đây là hãng hàng không đầu tiên có trụ sở tại sân bay Phú Bài, Huế',0,1)

insert into CongTyPhuongTien(tenCongTy,maTinhThanh,diaChiLienHe,maLoaiPhuongTien,moTa,laThanhVien,conHoatDong) values 
(N'Xe khách Phương Trang','79',N'468 - 468A Lê Văn Lương, P. Tân Phong, Q. 7, TP. HCM',2,N'Công ty Cổ phần Đầu tư Phương Trang',0,1),
(N'Xe khách Hoàng Long','31',N'Số 05 Phạm Ngũ Lão, P.Lương Khánh Thiện, Ngô Quyền , TP. Hải Phòng',2,N'Công Ty TNHH Vận tải Hoàng Long',0,1),
(N'Mai Linh Express','79',N'292 Đinh Bộ Lĩnh, phường 26, quận Bình Thạnh, TP.HCM (lầu 2 bến xe Miền Đông)',2,N'Công Ty Cổ Phần Vận Tải Tốc Hành Mai Linh - Mai Linh Express',0,1),
(N'Xe khách Thành Bưởi','79',N'266 - 268 Lê Hồng Phong, Phường 4, Quận 5, Tp. Hồ Chí Minh',2,N'Công ty TNHH Thành Bưởi',0,1),
(N'Xe khách Sao Việt','01',N'789 Giải Phóng, P.Giáp Bát, Q.Hoàng Mai, Tp.Hà Nội',2,N'Công Ty TNHH Thương Mại Và Dịch Vụ Minh Thành Phát',0,1),
(N'Xe Văn Minh','40',N'Toà nhà Văn Minh, Số 07 Nguyễn Trãi, Phường Hà Huy Tập, Tp.Vinh, Nghệ An',2,N'Công Ty TNHH Văn Minh',0,1),
(N'Xe khách Phúc Thuận Thảo','54',N'227 Nguyễn Tất Thành, P.8, TP Tuy Hòa, Phú Yên',2,N'Công ty TNHH Vận tải và Thương mại An Thiên Phúc',0,1)

insert into CongTyPhuongTien(tenCongTy,maTinhThanh,diaChiLienHe,maLoaiPhuongTien,moTa,laThanhVien,conHoatDong) values 
(N'La Siesta Ha Long Bay Superyacht La Siesta','22',N'Giếng Đáy, TP. Hạ Long, Quảng Ninh',4,N'Công ty TNHH Một Thành Viên Đóng Tàu Hạ Long',0,1)
go
create table KhachHang(
	maKH varchar(8) primary key,
	ho nvarchar(50) not null, 
	ten nvarchar(50) not null,
	diaChi nvarchar(50),
	SDT varchar(12) not null,
	email nvarchar(50),
	ngayDK datetime
);
select * from KhachHang
update KhachHang set ho = 'Manh',ten = 'PHam',diaChi = '54',SDT = '09445240350',email = 'asdkjfa@yahoo.com',ngayDK = '2023-04-22 00:00:00.0' where maKH = 'LL341525' 
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

go
create table Tour(
	maTour varchar(14) primary key,
	tenTour nvarchar(50),
	tgBatDau datetime,
	tgKetThuc datetime,
	maTPDiemDi nvarchar(20),
	maTPDiemDen nvarchar(20)
);

create table KHTour(
	maTour varchar(14),
	maKH varchar(8)
	primary key (maTour,maKH)
)
alter table KHTour add constraint maTour_Tour_fkey foreign key (maTour) references Tour(maTour)
alter table KHTour add constraint maKH_KhachHang_fkey foreign key (maKH) references KhachHang(maKH)
go

create table TourKhachSan(
	maKS int primary key,
	maTour varchar(14) ,
	
	giamGia float,
	moTa text
	unique (maTour,maKS)
)
alter table TourKhachSan drop constraint maTour_TourPhongKhachSan_pkey
alter table TourKhachSan add constraint maTour_TourPhongKhachSan_pkey foreign key (maTour) references Tour(maTour)
go
create table VePhuongTien(
	maDiChuyen int identity(1,1) primary key,
	maTour varchar(14),
	maVe int,
	gia money,
	giamGia float,
	moTa text,
	unique(maTour,maVe)
)
alter table VePhuongTien drop constraint maPT_VePhuongTien
alter table VePhuongTien add constraint maPT_VePhuongTien foreign key (maTour) references Tour(maTour)

