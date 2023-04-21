package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import model.DsTinhThanh;
import model.QuanLyVeModel;
import view.FrmQLVePhuongTien;

public class QuanLyVeController implements ActionListener,ControllerQuanLyVe{
	FrmQLVePhuongTien view;
	DsTinhThanh dsTT = new DsTinhThanh();
	QuanLyVeModel model = new QuanLyVeModel(this);
	public QuanLyVeController(FrmQLVePhuongTien view ) {
		// TODO Auto-generated constructor stub
		this.view =view;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fillCbTT(JComboBox<String> cbBox) {
		// TODO Auto-generated method stub
		cbBox.removeAllItems();
		String[] ds = dsTT.getDsTinhThanh();
		for (String s: ds) {
			cbBox.addItem(s);
		}
	}
	@Override
	public int maVe(String kieuVe) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String[] getDsLoaiVe() {
		// TODO Auto-generated method stub
		return model.getDsLoaiVe();
	}
	public void fillLoaiVe() {
		view.cbLoaiVe.removeAllItems();
		for (String s : getDsLoaiVe()) {
			view.cbLoaiVe.addItem(s);
		}
	}
	@Override
	public ArrayList<String> getDSCongTy() {
		// TODO Auto-generated method stub
		return model.getDSCongTy();
	}
	@Override
	public int getMaCT(String tenCT) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void fillCongTyPT() {
		view.cbTenCongTy.removeAllItems();
		for (String x : getDSCongTy()) {
			view.cbTenCongTy.addItem(x);
		}
	}
}
