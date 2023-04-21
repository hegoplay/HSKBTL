package controller;

import java.util.ArrayList;

import javax.swing.JComboBox;

public interface ControllerQuanLyVe {
	public void fillCbTT(JComboBox<String> cbBox);
	public int maVe(String kieuVe);
	public String[] getDsLoaiVe();
	public ArrayList<String> getDSCongTy();
	public int getMaCT(String tenCT);
}
