package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import entity.VePhuongTien;
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
		String src = e.getActionCommand();
		if (src.equals("Thêm")) {
			if (checkVaild()) {
				themVe(getVeFromField());
				fillTable();
			}
		}
		if (src.equals("Xóa")) {
			int row = view.table.getSelectedRow();
			if (row != -1) {
				model.xoaVe((Integer)view.table.getValueAt(row, 0));
				fillTable();
			}
			
		}
		if (src.equals("Sửa")) {
			int row = view.table.getSelectedRow();
			VePhuongTien ve = getVeFromField();
			if (row != -1) {
				ve.setMaVe((Integer)view.table.getValueAt(row, 0));
				model.suaVe(ve);
				fillTable();
			}
			
			
		}
		if(src.equals("Cancel")) {
			view.table.clearSelection();
			view.txtGia.setText("");
		}
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
	public int getMaVe(String kieuVe){
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
	@Override
	public boolean themVe(VePhuongTien v) {
		// TODO Auto-generated method stub
		return model.themVe(v);
	}
	@Override
	public ArrayList<VePhuongTien> getDsVePhuongTien() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getCongTyPTTheoMa(int maCTPT) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getKieuVe(int maVe) {
		// TODO Auto-generated method stub
		return null;
	}
	public void fillTable() {
		ArrayList<VePhuongTien> ds = model.getDsVePhuongTien();
		((DefaultTableModel)view.table.getModel()).setRowCount(0);
		for (VePhuongTien x : ds) {
			((DefaultTableModel)view.table.getModel()).addRow(x.getObject());
		}
	}
	public VePhuongTien getVeFromField() {
		return new VePhuongTien(0, (String)(view.cbTenCongTy.getSelectedItem()),(String)view.cbLoaiVe.getSelectedItem() , model.dsTT.getTTTheoMa(model.dsTT.getMaTinhThanh((String)view.cbTPDiemdi.getSelectedItem())), 
				model.dsTT.getTTTheoMa(model.dsTT.getMaTinhThanh((String)view.cbTPDiemDen.getSelectedItem())), Double.parseDouble(view.txtGia.getText()) , view.rdbtnNewRadioButton.isSelected());
	}
	public boolean checkVaild() {
		String gia = view.txtGia.getText();
		Pattern p = Pattern.compile("^\\d+(.?\\d+)?$");
		if (!p.matcher(gia).matches()) {
			JOptionPane.showMessageDialog(view.frame, "Tien phai dung dinh dang");
			return false;
		}
		return true;
	}
	
}
