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
import entity.TinhThanh;
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
		else if (s.equals("Lọc")) {
			locTable((String)view.cbTinhThanh.getSelectedItem(), view.chkThanhVien1.isSelected(), view.chckbxangHotng.isSelected(), view.rdbtnGiam.isSelected());
		}
		else if (s.equals("Thêm")) {
			addRow(getKSFromFill());
			fillTable();
			clearFill();
		}
		else if (s.equals("Sửa")) {
			KhachSan temp = getKSFromFill();
			temp.setMaKS((int)((DefaultTableModel)view.table.getModel()).getValueAt((int)view.table.getSelectedRow(), 0));
			fixRow(temp);
			fillTable();
		}
		else if (s.equals("Xóa")) {
			if (view.table.getSelectedRow()!=-1) {
				KhachSan temp = getKSFromFill();
				temp.setMaKS((int)((DefaultTableModel)view.table.getModel()).getValueAt((int)view.table.getSelectedRow(), 0));
				deleteRow(temp);
				fillTable();
				clearFill();
			}
			
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
		model = new KhachSanModel();
		ArrayList<KhachSan> ds = model.getDS();
		((DefaultTableModel)view.table.getModel()).setRowCount(0);
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


	@Override
	public void locTable(String tenTinhThanh, boolean isThanhVien, boolean dangHoatDong, boolean isGiam) {
		// TODO Auto-generated method stub
		model.locTable(tenTinhThanh, isThanhVien, dangHoatDong, isGiam);
		ArrayList<KhachSan> dsKS =  model.getDSLoc();
		((DefaultTableModel)view.tblLoc.getModel()).setRowCount(0);
		for (KhachSan x : dsKS) {
			
			((DefaultTableModel)view.tblLoc.getModel()).addRow(x.getObject());
		}
	}


	@Override
	public String getMaTinhThanh(String tenTinhThanh) {
		// TODO Auto-generated method stub
		return dsTT.getMaTinhThanh(tenTinhThanh);
	}


	@Override
	public void addRow(KhachSan temp) {
		// TODO Auto-generated method stub
		model.addRow(temp);
	}
	public KhachSan getKSFromFill() {
		return new KhachSan(0,view.txtTenKS.getText(),(String)view.cbMaTinhThanh.getSelectedItem(),view.txtDiaChi.getText(),view.txtMoTa.getText(), view.chkboxIsTV.isSelected(),view.chkbxDgHoatDong.isSelected());
	}


	@Override
	public void fixRow(KhachSan temp) {
		// TODO Auto-generated method stub
		model.fixRow(temp);
		
	}


	@Override
	public void deleteRow(KhachSan temp) {
		// TODO Auto-generated method stub
		model.deleteRow(temp);
	}


	@Override
	public TinhThanh getTTTheoMa(String maTT) {
		// TODO Auto-generated method stub
		return null;
	}
}
