package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;

import connectDB.ConnectDB;
import view.FrmQuanLyKhachSan;
import view.FrmTrangChu;
import view.Login;

public class LoginController implements ActionListener{
	
	Login view;
	
	public LoginController(Login view) {
		// TODO Auto-generated constructor stub
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Log In")) {
			ConnectDB cbd = ConnectDB.getInstance();
			try {
				cbd.connect();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Connection c = cbd.getConnection();
			String sql = "Select * from userAccess where userName = '" + view.txtUser.getText() + "' and pass = '" + String.valueOf(view.passwordField.getPassword())+ "'  ";
			try {
				Statement st = c.createStatement();
				ResultSet r = st.executeQuery(sql);
				if (r.next()) {
					view.access();
					new FrmTrangChu().frmTourDuLch.setVisible(true);
				}
				else view.denied();
				c.close();
				cbd.disconnect();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
	}
	
	

}
