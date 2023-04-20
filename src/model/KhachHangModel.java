package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.KhachHang;
import entity.KhachSan;

public class KhachHangModel {
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
				KhachHang ks = new KhachHang(rs.getString(1),rs.getNString(2), rs.getNString(3), rs.getNString(4), rs.getInt(5),rs.getNString(6) , rs.getTimestamp(7).toLocalDateTime().toLocalDate());
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
}
