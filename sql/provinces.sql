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