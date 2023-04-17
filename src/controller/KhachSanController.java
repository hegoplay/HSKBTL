package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import entity.KhachSan;
import model.DsTinhThanh;
import model.KhachSanModel;
import view.FrmQuanLyKhachSan;

public class KhachSanController implements ControllerTinhThanh,ActionListener,ControllerKhachSan,MouseListener {

	DsTinhThanh dsTT = new DsTinhThanh();
	FrmQuanLyKhachSan view;
	KhachSanModel model = new KhachSanModel();
	
	public KhachSanController(FrmQuanLyKhachSan qlKS) {
		// TODO Auto-generated constructor stub
		this.view = qlKS;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = e.getActionCommand();
		if (s.equals("Xoá Rỗng")) {
			clearFill();
		}
	}

	@Override
	public String[] getDsTinhThanh() {
		// TODO Auto-generated method stub
//		System.out.println(dsTT.getDsTinhThanh()[0]);
		return dsTT.getDsTinhThanh();
	}


	@Override
	public String getTenTTTheoMa(String maTT) {
		// TODO Auto-generated method stub
		return dsTT.getTenTTTheoMa(maTT);
	}


	@Override
	public void fillTable() {
		// TODO Auto-generated method stub
		ArrayList<KhachSan> ds = model.getDS();
		for (KhachSan x : ds) {
			((DefaultTableModel)view.table.getModel()).addRow(x.getObject());
		}
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		view.getValueFromTable();
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getClickCount()==2) {
			
		}
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void clearFill() {
		// TODO Auto-generated method stub
		view.txtTenKS.setText("");
		view.txtDiaChi.setText("");
		view.txtMoTa.setText("");
		view.chkboxIsTV.setSelected(false);
		view.chkbxDgHoatDong.setSelected(false);
		view.cbMaTinhThanh.setSelectedIndex(0);
		view.table.clearSelection();
		
	}
}
