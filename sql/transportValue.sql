use QLDuLich
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


