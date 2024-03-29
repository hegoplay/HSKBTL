package controller;
import entity.Tour;
import view.PnlDatVe;
import view.FrmDatTour;
import entity.KhachHang;
import view.PnlChonTour;
import model.DsTinhThanh;
import connectDB.ConnectDB;
import java.sql.Connection;
import entity.VePhuongTien;
import model.KhachHangModel;
import java.sql.SQLException;
import javax.swing.RowFilter;
import javax.swing.JptionPane;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
public class DatTourController implements ActionListener {
	FrmDatTour view;
	DsTinhThanh dsTT;
	KhachHangModel khModel;
	PnlChonTour viewChonTour;
	PnlDatVe viewDatVe;
	public KhachHang kh;
	public Tour tour;
	VePhuongTien ve;
	public DatTourController(FrmDatTour view){
		// TODO Auto-generated constructor stub
		this.view = view;
		dsTT = new DsTinhThanh();
		khModel = new KhachHangModel();
		viewChonTour = new PnlChonTour(view);
		view.tabbedPane.addTab("Chọn Tour", viewChonTour);
		viewChonTour.setVisible(false);
	}
	public void fillCb(){
		String ds[] = dsTT.getDsTinhThanh();
		view.cbTinhThanh.removeAllItems();
		view.cbTinhThanh.addItem("");
		for(String s : ds){
			view.cbTinhThanh.addItem(s);
		}
	}
	public void fillTable(){
		((DefaultTableModel)view.tblKhachHang.getModel()).setRowCount(0);
		for(KhachHang s : khModel.getDs()){
			((DefaultTableModel)view.tblKhachHang.getModel()).addRow(s.getObject());
		}
	}
	@Override
	public void actionPerformed(ActionEvent e){
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		Object o = e.getSource();
		if(src.equals("Lọc Khách hàng")){
			((DefaultTableModel)view.tblKhachHang.getModel()).setRowCount(0);
			for(KhachHang s : khModel.filterDs(view.txtHo.getText(), view.txtTen.getText(), view.txtEmail.getText(), view.txtSDT.getText())){
				((DefaultTableModel)view.tblKhachHang.getModel()).addRow(s.getObject());
			}
		}
		if(src.equals("Chọn Khách hàng")){
			int row = view.tblKhachHang.getSelectedRow();
			if(row >=0){
				view.tabbedPane.remove(1);
				view.tabbedPane.addTab("Chọn Tour", viewChonTour);
				viewChonTour.txtMaKH.setText((String)((DefaultTableModel)view.tblKhachHang.getModel()).getValueAt(row, 0));
				viewChonTour.txtHo.setText((String)((DefaultTableModel)view.tblKhachHang.getModel()).getValueAt(row, 1));
				viewChonTour.txtTen.setText((String)((DefaultTableModel)view.tblKhachHang.getModel()).getValueAt(row, 2));
				viewChonTour.txtDiaChi.setText((String)((DefaultTableModel)view.tblKhachHang.getModel()).getValueAt(row, 3));
				viewChonTour.txtSDT.setText((String)((DefaultTableModel)view.tblKhachHang.getModel()).getValueAt(row, 4));
				viewChonTour.txtEmail.setText((String)((DefaultTableModel)view.tblKhachHang.getModel()).getValueAt(row, 5));
				kh = khModel.getDs().get(row);
				view.tabbedPane.setSelectedIndex(1);
				viewChonTour.controller.fillTable();
			}
		}
		if(src.equals("Chọn tour")){
			int row = viewChonTour.table.getSelectedRow();
			if(row >=0 && !viewChonTour.txtMaKH.equals(" ")){
				tour = viewChonTour.controller.getTour();
				viewChonTour.controller.fillTable();
			}
		}
	}
}