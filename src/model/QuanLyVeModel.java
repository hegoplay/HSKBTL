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
import entity.VePhuongTien;

public class QuanLyVeModel implements ControllerQuanLyVe{
	private QuanLyVeController controller;
	private ArrayList<VePhuongTien> ds;
	public DsTinhThanh dsTT = new DsTinhThanh();
	public QuanLyVeModel(QuanLyVeController controller) {
		// TODO Auto-generated constructor stub
		this.setController(controller);
		ds = getDsVePhuongTien();
	}
	
	@Override
	public void fillCbTT(JComboBox<String> cbBox) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMaVe(String kieuVe) {
		// TODO Auto-generated method stub
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
		
			String sql = "Select maLoaiVe from LoaiVe where tenLoaiVe = N'" +kieuVe+ "'";
			Statement statement = c.createStatement();
			ResultSet rs = statement.executeQuery(sql);
//			System.out.println(sql);
			int ans = 0;
			while(rs.next()) {
				ans = rs.getInt(1);
			}
			cdb.disconnect();
			return ans;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
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
			cdb.disconnect();
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
	
	@Override
	public boolean themVe(VePhuongTien v) {
		// TODO Auto-generated method stub
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
			DsTinhThanh dsTT = new DsTinhThanh();
			String sql = "insert into VeDiChuyen(maCongTy,maLoaiVe,maTinhDiemDi,maTinhDiemDen,giaVe,conHoatDong) values(?,?,?,?,?,?)";	
			PreparedStatement st = c.prepareStatement(sql);
			st.setInt(1, getMaCT(v.getCtpt()));
			st.setInt(2, getMaVe(v.getLoaiVe()));
			st.setString(3, v.getTpDiemDi().getMaTinhThanh());
			st.setString(4, v.getTpDiemDen().getMaTinhThanh());
			st.setDouble(5, v.getGiaVe());
			st.setBoolean(6, v.isConHoatDong());
			int i = st.executeUpdate();
			cdb.disconnect();
			if (i>0) return true;
			else return false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<VePhuongTien> getDsVePhuongTien() {
		// TODO Auto-generated method stub
		ArrayList<VePhuongTien> ds = new ArrayList<VePhuongTien>();
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
		
			String sql = "Select * from VeDiChuyen";
			Statement statement = c.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				VePhuongTien ve =  new VePhuongTien(rs.getInt(1),getCongTyPTTheoMa(rs.getInt(2)) , getKieuVe(rs.getInt(3)), dsTT.getTTTheoMa(rs.getString(4)), dsTT.getTTTheoMa(rs.getString(5)), rs.getDouble(6), rs.getBoolean(7));
				ds.add(ve);
			}
			cdb.disconnect();
			return ds;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return null;
	}

	@Override
	public String getCongTyPTTheoMa(int maCTPT) {
		// TODO Auto-generated method stub
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
		
			String sql = "Select tenCongTy from CongTyPhuongTien where maCongTy = " + maCTPT;
			Statement statement = c.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			String ans = "";
			while (rs.next()) {
				ans =  rs.getNString(1);
			}
			cdb.disconnect();
			return ans ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return null;
	}

	public QuanLyVeController getController() {
		return controller;
	}

	public void setController(QuanLyVeController controller) {
		this.controller = controller;
	}

	@Override
	public String getKieuVe(int maVe) {
		// TODO Auto-generated method stub
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
		
			String sql = "Select tenLoaiVe from LoaiVe where maLoaiVe = '" +maVe+ "'";
			Statement statement = c.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			String ans = "";
			while (rs.next()) {
				ans =rs.getNString(1);
			}
			return ans;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return null;
	}
	
	
}
