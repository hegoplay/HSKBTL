use QLDuLich
go

insert into loaiPhuongTien(tenLoai) values ('Công ty hàng không'),('Công ty xe Khách'),('Công ty đường sắt'),('Công ty tàu thủy')
insert into LoaiVe(tenLoaiVe) values('thương gia'),('khứ hồi'),('phổ thông')
go
insert into CongTyPhuongTien(tenCongTy,maTinhThanh,diaChiLienHe,maLoaiPhuongTien,moTa,laThanhVien,conHoatDong) values 
('VietJetAir','01','302/3 Phố Kim Mã, Phường Ngọc Khánh, Quận Ba Đình, TP. Hà Nội, Việt Nam',1,'Công ty Cổ phần Hàng không Vietjet, thường được biết đến với các thương hiệu Vietjet Air hay Vietjet, là hãng hàng không tư nhân đầu tiên của Việt Nam.',0,1),
('Tổng Công ty Đường sắt Việt Nam','01','Số 118 Lê Duẩn, Hoàn Kiếm, Hà Nội',3,'Tổng Công ty Đường sắt Việt Nam (VNR) là mô hình Tổng Công ty Nhà nước thuộc sự quản lý của Bộ Giao thông Vận tải, được thành lập theo Quyết định số 34/2003/QĐ-TTg [1] ban hành ngày 4 tháng 3 năm 3 năm 2003 của Thủ tướng Chính phủ trên cơ sở tổ chức lại Liên hiệp Đường sắt Việt Nam, thực hiện nhiệm vụ sản xuất kinh doanh vận tải đường sắt; quản lý, bảo dưỡng, sửa chữa các cơ sở hạ tầng đường sắt cùng nhiều chức năng nhiệm vụ khác.',1,1),
('Bamboo Airways','01','Tòa nhà Bamboo Airways Tower, 265 Cầu Giấy, Phường Dịch Vọng, Quận Cầu Giấy, Hà Nội',1,'Công ty Cổ phần Hàng không Tre Việt, hoạt động dưới tên thương mại Bamboo Airways hay Hãng Hàng không Tre Việt, là một hãng hàng không Việt Nam thuộc Tập đoàn FLC, có trụ sở chính tại Hà Nội và được đăng ký kinh doanh tại Bình Định.',0,1)
