package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.swing.JComboBox;

import connectDB.ConnectDB;
import controller.ControllerKhachSan;
import controller.ControllerQuanLyVe;
import controller.QuanLyVeController;

public class QuanLyVeModel implements ControllerQuanLyVe{
	private QuanLyVeController controller;
	
	public QuanLyVeModel(QuanLyVeController controller) {
		// TODO Auto-generated constructor stub
		this.controller=controller;
	}
	
	@Override
	public void fillCbTT(JComboBox<String> cbBox) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int maVe(String kieuVe) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String[] getDsLoaiVe() {
		// TODO Auto-generated method stub
		ArrayList<String> fin = new ArrayList<String>();
		String[] out;
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
		
			String sql = "Select tenLoaiVe from LoaiVe";
			Statement statement = c.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				fin.add(rs.getNString(1));
			}
			out = new String[fin.size()];
			for (int i = 0 ; i < fin.size();i++) {
				out[i] = fin.get(i);
			}
			return out;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return null;
	}
	
	@Override
	public ArrayList<String> getDSCongTy(){
		ArrayList<String> fin = new ArrayList<String>();
	
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
		
			String sql = "Select tenCongTy from CongTyPhuongTien";
			Statement statement = c.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				fin.add(rs.getNString(1));
			}
			
			return fin;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return null;
	}

	@Override
	public int getMaCT(String tenCT) {
		// TODO Auto-generated method stub
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
		
			String sql = "Select maCongTy from CongTyPhuongTien where tenCongTy = '" + tenCT+"'";
			Statement statement = c.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				return rs.getInt(1);
			}
			
			return -1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return -1;
	}
	
}
