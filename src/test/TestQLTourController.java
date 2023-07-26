package test;
import view.FrmQLKhachHang;
public class TestQLTourController {
	public static void main(String[] args){
		FrmQLKhachHang frm = new FrmQLKhachHang();
		frm.setVisible(true);
		frm.txtHo.setText("Luu");
		frm.txtTen.setText("Long");
		frm.txtSDT.setText("0944713415") ;
		frm.txtDiachi.setText("25/5 duong 6") ;
		frm.txtemail.setText("thmnh113@gmail.com");
		
	}
}