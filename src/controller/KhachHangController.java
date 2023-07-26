package controller;
import entity.KhachSan;
import entity.KhachHang;
import java.time.LocalDate;
import java.util.ArrayList;
import view.FrmQLKhachHang;
import model.KhachHangModel;
import javax.swing.JTextField;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
public class KhachHangController implements ActionListener,MouseListener{
	FrmQLKhachHang view;
	KhachHangModel model;
	public KhachHangController(FrmQLKhachHang view){
		// TODO Auto-generated constructor stub
		this.view = view;
		model = new KhachHangModel();
	}
	@Override
	public void actionPerformed(ActionEvent e){
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if(src.equals("Thêm")){
			if(checkVaild() == true){
				addKH();
				fillTable();
				clearfill();
			}
		}
        if(src.equals("Xoa")){
			if(checkVaild() == true){
				deleteKH();
				fillTable();
				clearfill();
			}
		}
        if(src.equals("Sua")){
			if(checkVaild() == true){
				KhachHang temp = getKhachHang();
				temp.setMaKH((String)view.table.getModel().getValueAt(view.table.getSelectedRow(), 0));
				model.suaKH(temp);
				fillTable();
				clearfill();
			}
		}
	}
	public boolean checkVaild(){
		String ho = view.txtHo.getText();
		if(ho.equals("")){
			showMsg(view.txtHo, "Ho khong duoc de trong");
			return false;
		}
		String ten = view.txtTen.getText();
		if(ten.equals("")){
			showMsg(view.txtTen, "Ten khong duoc de trong");
			return false;
		}
		String email = view.txtemail.getText();
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z]{2,10}\\.com(\\.[a-z]*)*");
		if(!pattern.matcher(email).matches()){
			showMsg(view.txtemail, "Email khong dung dinh dang");
			return false;
		}
		String diaChi = view.txtDiachi.getText();
		pattern =Pattern.compile("^\\d{2,}.*");
		if(!pattern.matcher(diaChi).matches()){
			showMsg(view.txtemail, "Dia chi phai co 2 so nha dau tien");
			return false;
		}
		String sdt = view.txtSDT.getText();
		pattern = Pattern.compile("^(\\+\\d{1,3}})?\\d{9,11}$");
		if(!pattern.matcher(sdt).matches()){
			showMsg(view.txtSDT, "So dien thoai phai khoang 9-11so");
			return false;
		}
		return true;
	}
	public void addKH(){
		//chu cai dau tien cua ho, chu cai dau tien cua ten + 4 so cuois dien thoaij +2 so dau so nha (neu 1 so them so 0 phia truoc)
		model.themKH(getKhachHang());
	}
	public void deleteKH(){
		String ho = view.txtHo.getText();
		String ten = view.txtTen.getText();
		String diachi = view.txtDiachi.getText();
		String std = view.txtSDT.getText().trim();
		String email = view.txtemail.getText();
		String makh = xulyma(ho, ten, std, diachi);
		KhachHang kh = new KhachHang(makh);
		model.xoaKH(getKhachHang());
	}
	public void showMsg(JTextField txt,String s){
		JOptionPane.showMessageDialog(view, s);
		txt.requestFocus();
	}
	public void clearfill(){
		view.txtHo.setEditable(true);
		view.txtHo.setText("");
		view.txtTen.setEditable(true);
		view.txtTen.setText("");
		view.txtDiachi.setText("");
		view.txtSDT.setText("");
		view.txtemail.setText("");
		view.txtHo.requestFocus();
	}
	public String xulyma(String ho, String ten, String std, String sonha){
		String temp = "";
		temp += ho.charAt(0);
		temp += ten.charAt(0);
		int count = 0;
		String tempstd = "";
		for(int i = std.length() -4; i < std.length(); i++){
			tempstd += std.charAt(i);
		}
		temp+= tempstd;
		String tempsn = "";
        tempsn += sonha.charAt(0);
        if(!Character.isDigit(sonha.charAt(1))){
            tempsn = "0" + tempsn;
        }
        else {
            tempsn += sonha.charAt(1);
        }
        temp += tempsn;
		return temp;
	}
	public KhachHang getKhachHang(){
		String ho = view.txtHo.getText();
		String ten = view.txtTen.getText();
		String diachi = view.txtDiachi.getText();
		String std = view.txtSDT.getText().trim();
		String email = view.txtemail.getText();
		String makh = xulyma(ho, ten, std, diachi);
		KhachHang kh = new KhachHang(makh, ho, ten, diachi, std, email, LocalDate.now());
		return kh;
	}
	public void fillTable(){
		model = new KhachHangModel();
		ArrayList<KhachHang> ds = model.getDs();
		((DefaultTableModel)view.table.getModel()).setRowCount(0);
		for(KhachHang x : ds){
			((DefaultTableModel)view.table.getModel()).addRow(x.getObject());
		}
	}
	@Override
	public void mouseClicked(MouseEvent e){
		// TODO Auto-generated method stub
		int row =  view.table.getSelectedRow();
		view.txtHo.setEditable(false);
		view.txtTen.setEditable(false);
		view.txtHo.setText((String)view.table.getModel().getValueAt(row, 1));
		view.txtTen.setText((String)view.table.getModel().getValueAt(row, 2));
		view.txtDiachi.setText((String)view.table.getModel().getValueAt(row, 3));
		view.txtSDT.setText((String)view.table.getModel().getValueAt(row, 4));
		view.txtemail.setText((String)view.table.getModel().getValueAt(row, 5));
	}
	@Override
	public void mousePressed(MouseEvent e){
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseReleased(MouseEvent e){
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseEntered(MouseEvent e){
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseExited(MouseEvent e){
		// TODO Auto-generated method stub
	}
}