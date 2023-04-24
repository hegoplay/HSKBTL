package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import connectDB.ConnectDB;
import controller.ControllerKhachHang;
import entity.KhachHang;
import entity.KhachSan;

public class KhachHangModel implements ControllerKhachHang{
	ArrayList<KhachHang> ds = new ArrayList<KhachHang>();
	public KhachHangModel() {
		// TODO Auto-generated constructor stub
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
		
			String sql = "Select * from KhachHang";
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				String maTT = rs.getNString(3);
				DsTinhThanh dsTT = new DsTinhThanh();
//				Blob bMoTa = rs.getBlob(5);
//				String moTa = new String(bMoTa.getBytes(1L, (int)bMoTa.length()));
				KhachHang ks = new KhachHang(rs.getString(1),rs.getNString(2), rs.getNString(3), rs.getNString(4), rs.getString(5),rs.getNString(6) , rs.getTimestamp(7).toLocalDateTime().toLocalDate());
				ds.add(ks);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ArrayList<KhachHang> getDs(){
		return ds;
	}
	@Override
	public boolean themKH(KhachHang kh) {
		// TODO Auto-generated method stub
		if (ds.contains(kh)) {
			return false;
		}
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			
			cdb.connect();
			Connection c = cdb.getConnection();
		
			String sql = "Insert into KhachHang(maKH,ho,ten,diaChi,SDT,email,ngayDK) values(?,?,?,?,?,?,?)";
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, kh.getMaKH());
			st.setNString(2, kh.getHo());
			st.setNString(3, kh.getTen());
			st.setNString(4, kh.getDiaChi());
			st.setTimestamp(7, Timestamp.valueOf(kh.getNgayDk().atStartOfDay()) );
			st.setString(5, kh.getSDT()+"");
			st.setString(6, kh.getEmail());
			int row = st.executeUpdate();
			cdb.disconnect();
			if (row >=1) return true;
			else return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public void getTable() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean xoaKH(KhachHang kh) {
		// TODO Auto-generated method stub
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
		
			String sql = "delete from KhachHang where maKH = ?";
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1,kh.getMaKH());
			int row = st.executeUpdate();
			cdb.disconnect();
			if (row >=1) return true;
			else return false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean suaKH(KhachHang kh) {
		// TODO Auto-generated method stub
				ConnectDB cdb = ConnectDB.getInstance();
				try {
					cdb.connect();
					Connection c = cdb.getConnection();
				
					String sql = "Update KhachHang set ho= ?,ten = ? , diaChi = ?,SDT = ?, email = ?,ngayDK = ? where maKH = ?";
					PreparedStatement st = c.prepareStatement(sql);
					st.setNString(7, kh.getMaKH());
					st.setNString(1, kh.getHo());
					st.setNString(2, kh.getTen());
					st.setNString(3, kh.getDiaChi());
					st.setTimestamp(6, Timestamp.valueOf(kh.getNgayDk().atStartOfDay()) );
					
					st.setString(4, kh.getSDT());
					st.setString(5, kh.getEmail());
					
					int row = st.executeUpdate();
					cdb.disconnect();
					if (row >=1) return true;
					else return false;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				}
	}
	public ArrayList<KhachHang> filterDs(String ho, String ten, String email, String SDT) {
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
			ds = new ArrayList<KhachHang>();
			String sql = "Select * from KhachHang where ho like '" + ho + "%' and ten like '"+ ten + "%' and email like '"+ email + "%' and SDT like '" + SDT +"%'";
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				String maTT = rs.getNString(3);
				DsTinhThanh dsTT = new DsTinhThanh();
//				Blob bMoTa = rs.getBlob(5);
//				String moTa = new String(bMoTa.getBytes(1L, (int)bMoTa.length()));
				KhachHang ks = new KhachHang(rs.getString(1),rs.getNString(2), rs.getNString(3), rs.getNString(4), rs.getString(5),rs.getNString(6) , rs.getTimestamp(7).toLocalDateTime().toLocalDate());
				ds.add(ks);
			}
			return ds;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
}
