package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.KhachHangModel;
import view.FrmQLKhachHang;

public class KhachHangController implements ActionListener{
	FrmQLKhachHang view;
	KhachHangModel model;
	public KhachHangController(FrmQLKhachHang view) {
		// TODO Auto-generated constructor stub
		this.view = view;
		model = new KhachHangModel();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		System.out.println(src);
		if (src.equals("Thêm")) {
			checkVaild();
		}
		
	}
	public boolean checkVaild() {
		String ho = view.txtHo.getText();
		if (ho.equals("")) {
			showMsg(view.txtHo, "Ho khong duoc de trong");
			return false;
		}
		String ten = view.txtTen.getText();
		if (ten.equals("")) {
			showMsg(view.txtTen, "Ten khong duoc de trong");
			return false;
		}
		String email = view.txtemail.getText();
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z]{2,10}\\.com");
		if (!pattern.matcher(email).matches()) {
			showMsg(view.txtemail, "Email khong dung dinh dang");
			return false;
		}
		String diaChi = view.txtDiachi.getText();
		pattern =Pattern.compile("^\\d+ .*");
		if (!pattern.matcher(diaChi).matches()) {
			showMsg(view.txtemail, "Dia chi phai co so nha dau tien");
			return false;
		}
		String sdt = view.txtSDT.getText();
		pattern = Pattern.compile("^\\+?\\d{10,12}$");
		if (!pattern.matcher(sdt).matches()) {
			showMsg(view.txtSDT, "So dien thoai phai khoang 9-11so");
			return false;
		}
		return true;
		
	}
	private void showMsg(JTextField txt,String s) {
		JOptionPane.showMessageDialog(view, s);
		txt.requestFocus();
	}
}
