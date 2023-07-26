package controller;
import entity.TinhThanh;
public interface ControllerTinhThanh {
	public String[] getDsTinhThanh();
	public String getTenTTTheoMa(String maTT);
	public String getMaTinhThanh(String tenTinhThanh);
	public TinhThanh getTTTheoMa(String maTT);
}