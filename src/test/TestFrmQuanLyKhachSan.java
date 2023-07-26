package test;
import view.AboutUs;
import entity.KhachHang;
import java.time.LocalDate;
import model.KhachHangModel;
import view.FrmQuanLyKhachSan;
public class TestFrmQuanLyKhachSan {
	public static void main(String[] args){
		KhachHangModel model = new KhachHangModel();
		model.themKH(new KhachHang("xxx", "abfsfsc", "sfsdsdfdsd", "adfads", "0944713015", "thmnh113@gmail.com", LocalDate.now()));
        //	model.suaKH(new KhachHang("xx", "abc", "abc", "adfads", "0944713015", "asdasd@gmail.com", LocalDate.now()));
        //	model.xoaKH(new KhachHang("xx"));
	}
}