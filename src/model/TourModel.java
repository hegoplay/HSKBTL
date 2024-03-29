package model;
import entity.Tour;
import entity.KhachHang;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Connection;
import java.util.ArrayList;
import connectDB.ConnectDB;
import java.sql.SQLException;
import controller.ControllerTour;
import java.sql.PreparedStatement;
public class TourModel implements ControllerTour {
	private ArrayList<Tour> ds;
	DsTinhThanh dsTT = new DsTinhThanh();
	public TourModel(){
		// TODO Auto-generated constructor stub
		fillDs();
	}
	@Override
	public ArrayList<Tour> getDs(){
		// TODO Auto-generated method stub
		return ds;
	}
	@Override
	public void fillDs(){
		// TODO Auto-generated method stub
		ds= new ArrayList<Tour>();
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
			ds = new ArrayList<Tour>();
			String sql = "Select * from Tour";
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				String maTPDi = rs.getNString(5);
				String maTPDen = rs.getNString(6);
				Tour tour = new Tour(rs.getString(1), rs.getNString(2), rs.getTimestamp(3).toLocalDateTime(), rs.getTimestamp(4).toLocalDateTime(), dsTT.getTTTheoMa(maTPDi), dsTT.getTTTheoMa(maTPDen));
				ds.add(tour);
			}
		} 
        catch(SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public boolean xoaTour(Tour tour){
		// TODO Auto-generated method stub
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
			String sql = "delete from Tour where maTour = ?";
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1,tour.getMaTour());
			int row = st.executeUpdate();
			cdb.disconnect();
			if(row >=1) 
                return true;
			else return false;
		} 
        catch(SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean suaTour(Tour tour){
		// TODO Auto-generated method stub
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
			String sql = "Update Tour set tenTour= ?,tgBatDau = ? , tgKetThuc = ?,maTPDiemDi = ?, maTPDiemDen = ? where maTour = ?";
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(6, tour.getMaTour());
			st.setNString(1, tour.getTenTour());
			st.setTimestamp(2, Timestamp.valueOf(tour.getTgBatDau()));
			st.setTimestamp(3, Timestamp.valueOf(tour.getTgKetThuc()));
			st.setNString(4, tour.getTpDiemDi().getTenTinhThanh());
			st.setNString(5, tour.getTpDiemDen().getMaTinhThanh());
			int row = st.executeUpdate();
			cdb.disconnect();
			if (row >=1) return true;
			else return false;
		} 
        catch(SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean themTour(Tour tour){
		// TODO Auto-generated method stub
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
			String sql = "Insert into Tour(maTour,tenTour,tgBatDau,tgKetThuc,maTPDiemDi,maTPDiemDen) values(?,?,?,?,?,?)";
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, tour.getMaTour());
			st.setNString(2, tour.getTenTour());
			st.setTimestamp(3, Timestamp.valueOf(tour.getTgBatDau()));
			st.setTimestamp(4, Timestamp.valueOf(tour.getTgKetThuc()));
			st.setNString(5, tour.getTpDiemDi().getMaTinhThanh());
			st.setNString(6, tour.getTpDiemDen().getMaTinhThanh());
			int row = st.executeUpdate();
			cdb.disconnect();
			if(row >=1) return true;
			else return false;
		} 
        catch(SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	public void getDsKhongCoKH(String maKH){
		ConnectDB cdb = ConnectDB.getInstance();
		try {
			cdb.connect();
			Connection c = cdb.getConnection();
			ds = new ArrayList<Tour>();
			String sql = "Select * from Tour where maTour not in (select maTour from KHTour where maKH = '" + maKH+ "')";
			System.out.println(sql);
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				String maTPDi = rs.getNString(5);
				String maTPDen = rs.getNString(6);
				Tour tour = new Tour(rs.getString(1), rs.getNString(2), rs.getTimestamp(3).toLocalDateTime(), rs.getTimestamp(4).toLocalDateTime(), dsTT.getTTTheoMa(maTPDi), dsTT.getTTTheoMa(maTPDen));
				ds.add(tour);
			}
		} 
        catch(SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}