package test;

import java.time.LocalDate;

import entity.KhachHang;
import model.KhachHangModel;
import view.AboutUs;
import view.FrmQuanLyKhachSan;

public class TestFrmQuanLyKhachSan {
	public static void main(String[] args) {
		KhachHangModel model = new KhachHangModel();
		model.themKH(new KhachHang("xxx", "abfsfsc", "sfsdsdfdsd", "adfads", "0944713015", "thmnh113@gmail.com", LocalDate.now()));
//		model.suaKH(new KhachHang("xx", "abc", "abc", "adfads", "0944713015", "asdasd@gmail.com", LocalDate.now()));
//		model.xoaKH(new KhachHang("xx"));
	}
}
