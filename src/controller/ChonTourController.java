package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import connectDB.ConnectDB;
import entity.Tour;
import model.TourModel;
import view.FrmDatTour;
import view.PnlChonTour;

public class ChonTourController implements MouseListener,ActionListener {
	FrmDatTour frm;
	PnlChonTour view;
	TourModel model = new TourModel();
	public ChonTourController(PnlChonTour view) {
		// TODO Auto-generated constructor stub
		this.view = view;
	}
	public void fillTable() {
		
		((DefaultTableModel) view.table.getModel()).setRowCount(0);
		for (Tour x : model.getDs() ) {
			((DefaultTableModel) view.table.getModel()).addRow(x.getObject());
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int row = view.table.getSelectedRow();
		if (row >=0) {
			view.txtMaTour.setText((String)view.table.getModel().getValueAt(row, 0));
			view.txtTenTour.setText((String)view.table.getModel().getValueAt(row, 1));
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if (src.equals("Chọn Tour")) {
			int row = view.table.getSelectedRow();
			if (row >=0 && !view.txtMaKH.equals(" ")) {

				insertDB();
			
			}
		}
	}
	public Tour getTour() {
		int row = view.table.getSelectedRow();
		return model.getDs().get(row);
	}
	private void insertDB() {
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
		
			String sql = "insert into KHTour(maTour,maKH) values (?,?)";
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1,view.txtMaTour.getText());
			st.setString(2, view.txtMaKH.getText());
			int n = st.executeUpdate();
			cdb.disconnect();
			JOptionPane.showMessageDialog(view, "Dat tour thanh Cong");
		} 
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
