package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import controller.ControllerTinhThanh;
import entity.TinhThanh;

public class DsTinhThanh implements ControllerTinhThanh {
	private ArrayList<TinhThanh> ds = new ArrayList<TinhThanh>();
	public DsTinhThanh() {
		// TODO Auto-generated constructor stub
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
			String sql = "Select * from TinhThanh";
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				TinhThanh tt = new TinhThanh(rs.getNString(1), rs.getNString(2), rs.getNString(3), rs.getNString(4), rs.getNString(5), rs.getNString(6));
				ds.add(tt);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public int size() {
		return ds.size();
	}
	@Override
	public String[] getDsTinhThanh() {
		// TODO Auto-generated method stub
		String s = "";
		for (TinhThanh x : ds) {
			s+=x.getTenTinhThanh()+";";
		}
		return s.split(";");
	}
	@Override
	public String getTenTTTheoMa(String maTT) {
		// TODO Auto-generated method stub
		TinhThanh tt = new TinhThanh(maTT);
		return ds.get(ds.indexOf(tt)).getTenTinhThanh();
	}
//	@Override
//	public void fillTable() {
//		// TODO Auto-generated method stub
//		
//	}
	@Override
	public String getMaTinhThanh(String tenTinhThanh) {
		// TODO Auto-generated method stub
		for (int i = 0 ; i < ds.size();i++) {
			if (tenTinhThanh.equals(ds.get(i).getTenTinhThanh())) {
				return ds.get(i).getMaTinhThanh() ;
			}
		}
		return null;
	}
	@Override
	public TinhThanh getTTTheoMa(String maTT) {
		// TODO Auto-generated method stub
		return ds.get(ds.indexOf(new TinhThanh(maTT)));
	}
	
}
