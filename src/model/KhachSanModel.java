package model;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import controller.ControllerKhachSan;
import entity.KhachSan;

public class KhachSanModel implements ControllerKhachSan {
	private ArrayList<KhachSan> ds = new ArrayList<KhachSan>();
	private ArrayList<KhachSan> dsLoc;
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
	@Override
	public void locTable(String tenTinhThanh, boolean isThanhVien,boolean dangHoatDong,boolean isGiam) {
		dsLoc = new ArrayList<KhachSan>();
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
			DsTinhThanh dsTT = new DsTinhThanh();
			String sql = "Select * from KhachSan where maTinhThanh = '" + dsTT.getMaTinhThanh(tenTinhThanh) + "' and laThanhVien = '" + (isThanhVien ? "True" : "False")+"' and conHoatDong = '" + (dangHoatDong ? "True" : "False")+
					"' order by maKhachSan " + (isGiam ? "desc" : "asc");
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				String maTT = rs.getNString(3);
				KhachSan ks = new KhachSan(rs.getInt(1), rs.getNString(2), dsTT.getTenTTTheoMa(maTT), rs.getNString(4), rs.getString(5), rs.getBoolean(6), rs.getBoolean(7));
				dsLoc.add(ks);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cdb.disconnect();
	}
	public ArrayList<KhachSan> getDSLoc(){
		return dsLoc;
	}
	@Override
	public void addRow(KhachSan temp) {
		// TODO Auto-generated method stub
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
			DsTinhThanh dsTT = new DsTinhThanh();
			String sql = "insert into KhachSan(tenKhachSan,maTinhThanh,diaChiKhachSan,moTa,laThanhVien,conHoatDong) values(?,?,?,?,?,?)";	
			PreparedStatement st = c.prepareStatement(sql);
			st.setNString(1, temp.getTenKS());
			st.setString(2, dsTT.getMaTinhThanh(temp.getTenTinhThanh()));
			st.setNString(3, temp.getDiaChi());
			st.setString(4, temp.getMoTa());
			st.setBoolean(5, temp.isLaThanhVien());
			st.setBoolean(6, temp.isConHoatDong());
			int i = st.executeUpdate();
			cdb.disconnect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void fixRow(KhachSan temp) {
		// TODO Auto-generated method stub
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
			DsTinhThanh dsTT = new DsTinhThanh();
			String sql = "update KhachSan set tenKhachSan = ?, maTinhThanh = ?, diaChiKhachSan = ?, moTa = ?, laThanhVien = ?, conHoatDong = ? where maKhachSan = ?";	
			PreparedStatement st = c.prepareStatement(sql);
			st.setNString(1, temp.getTenKS());
			st.setString(2, dsTT.getMaTinhThanh(temp.getTenTinhThanh()));
			st.setNString(3, temp.getDiaChi());
			st.setString(4, temp.getMoTa());
			st.setBoolean(5, temp.isLaThanhVien());
			st.setBoolean(6, temp.isConHoatDong());
			st.setInt(7, temp.getMaKS());
			int i = st.executeUpdate();
			System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cdb.disconnect();
	}
	@Override
	public void deleteRow(KhachSan temp) {
		// TODO Auto-generated method stub
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
			DsTinhThanh dsTT = new DsTinhThanh();
			String sql = "delete from KhachSan where maKhachSan = ?";	
			PreparedStatement st = c.prepareStatement(sql);
			st.setInt(1, temp.getMaKS());
			int i = st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cdb.disconnect();
	}
}
