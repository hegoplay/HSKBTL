package model;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import controller.ControllerKhachSan;
import entity.KhachSan;

public class KhachSanModel implements ControllerKhachSan {
	private ArrayList<KhachSan> ds = new ArrayList<KhachSan>();
	public KhachSanModel() {
		// TODO Auto-generated constructor stub
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
			String sql = "Select * from KhachSan";
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				String maTT = rs.getNString(3);
				DsTinhThanh dsTT = new DsTinhThanh();
//				Blob bMoTa = rs.getBlob(5);
//				String moTa = new String(bMoTa.getBytes(1L, (int)bMoTa.length()));
				KhachSan ks = new KhachSan(rs.getInt(1), rs.getNString(2), dsTT.getTenTTTheoMa(maTT), rs.getNString(4), rs.getString(5), rs.getBoolean(6), rs.getBoolean(7));
				ds.add(ks);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void fillTable() {
		// TODO Auto-generated method stub
		
	}
	public ArrayList<KhachSan> getDS() {
		return ds;
	}
}
