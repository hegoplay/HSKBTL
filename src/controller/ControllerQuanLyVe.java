package controller;
import entity.VePhuongTien;
import java.util.ArrayList;
import javax.swing.JComboBox;
public interface ControllerQuanLyVe {
	public void fillCbTT(JComboBox<String> cbBox);
	public int getMaVe(String kieuVe);
	public String getKieuVe(int maVe);
	public String[] getDsLoaiVe();
	public ArrayList<String> getDSCongTy();
	public int getMaCT(String tenCT);
	public ArrayList<VePhuongTien> getDsVePhuongTien();
	public String getCongTyPTTheoMa(int maCTPT);
	public boolean themVe(VePhuongTien v);
}