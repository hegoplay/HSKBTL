package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;

import entity.KhachHang;
import model.DsTinhThanh;
import model.KhachHangModel;
import view.FrmDatTour;

public class DatTourController implements ActionListener {
	FrmDatTour frm;
	DsTinhThanh dsTT;
	KhachHangModel khModel;
	public DatTourController(FrmDatTour frm) {
		// TODO Auto-generated constructor stub
		this.frm = frm;
		dsTT = new DsTinhThanh();
		khModel = new KhachHangModel();
	}
	public void fillCb() {
		String ds[] = dsTT.getDsTinhThanh();
		frm.cbTinhThanh.removeAllItems();
		frm.cbTinhThanh.addItem("");
		for (String s : ds) {
			frm.cbTinhThanh.addItem(s);
		}
	}
	public void fillTable() {
		((DefaultTableModel)frm.tblKhachHang.getModel()).setRowCount(0);
		for (KhachHang s : khModel.getDs()) {
			((DefaultTableModel)frm.tblKhachHang.getModel()).addRow(s.getObject());
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if (src.equals("Lọc")) {
			((DefaultTableModel)frm.tblKhachHang.getModel()).setRowCount(0);
			for (KhachHang s : khModel.filterDs(frm.txtHo.getText(), frm.txtTen.getText(), frm.txtEmail.getText(), frm.txtSDT.getText())) {
				((DefaultTableModel)frm.tblKhachHang.getModel()).addRow(s.getObject());
			}
		}
	}
	
}
