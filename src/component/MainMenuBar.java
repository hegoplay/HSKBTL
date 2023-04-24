package component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import view.AboutUs;
import view.FrmDatTour;
import view.FrmQLKhachHang;
import view.FrmQLVePhuongTien;
import view.FrmQuanLyKhachSan;
import view.FrmQuanLyTour;
import view.Login;
import view.FrmTrangChu;

public class MainMenuBar extends JMenuBar implements ActionListener{
	private JMenuItem mntmTrangChu;
	private JMenuItem mntmDatTour;
	private JMenuItem mntmKhachSan;
	private JMenuItem mntmQLKhachHang;
	private JMenuItem mntmQLChuyenBay;
	private JMenuItem mntmAboutUs;
	private JFrame frame;
	private JMenuItem mntmExit;
	private JMenuItem mntmDangXuat;
	private JMenuItem mntmQLTour;
	public MainMenuBar(JFrame frame) {
		
		this.frame = frame;
		
		JMenu mnChucNang = new JMenu("Chuc Nang");
		this.add(mnChucNang);
		
		mntmTrangChu = new JMenuItem("TrangChu");
		mntmTrangChu.setIcon(new ImageIcon(FrmQuanLyKhachSan.class.getResource("/view/img/TrangChu.png")));
		mnChucNang.add(mntmTrangChu);
		
		JSeparator separator = new JSeparator();
		mnChucNang.add(separator);
		
		mntmDatTour = new JMenuItem("Đặt tour");
		mntmDatTour.setIcon(new ImageIcon(FrmQuanLyKhachSan.class.getResource("/view/img/datTour.png")));
		mnChucNang.add(mntmDatTour);
		
		mntmDangXuat = new JMenuItem("Đăng xuất");
		mntmDangXuat.setIcon(new ImageIcon(FrmQuanLyKhachSan.class.getResource("/view/img/logOut.png")));
		mnChucNang.add(mntmDangXuat);
		
		mntmExit = new JMenuItem("Thoat Chuong Trinh");
		mntmExit.setIcon(new ImageIcon(FrmQuanLyKhachSan.class.getResource("/view/img/exit.png")));
		mnChucNang.add(mntmExit);
		
		JMenu mnQuanLy = new JMenu("Quản lý");
		this.add(mnQuanLy);
		
		mntmKhachSan = new JMenuItem("Khách sạn");
		mntmKhachSan.setIcon(new ImageIcon(FrmQuanLyKhachSan.class.getResource("/view/img/khachSan.png")));
		mnQuanLy.add(mntmKhachSan);
		
		mntmQLKhachHang = new JMenuItem("Khách hàng");
		mntmQLKhachHang.setIcon(new ImageIcon(FrmQuanLyKhachSan.class.getResource("/view/img/user.png")));
		mnQuanLy.add(mntmQLKhachHang);
		
		mntmQLChuyenBay = new JMenuItem("Chuyến bay");
		mntmQLChuyenBay.setIcon(new ImageIcon(FrmQuanLyKhachSan.class.getResource("/view/img/airplane.png")));
		mnQuanLy.add(mntmQLChuyenBay);
		
		mntmQLTour = new JMenuItem("Tour");
		mntmQLTour.setIcon(new ImageIcon(FrmQuanLyKhachSan.class.getResource("/view/img/tour.png")));
		mnQuanLy.add(mntmQLTour);
		
		JMenu mnHelp = new JMenu("Help"); 
		this.add(mnHelp);
		
		mntmAboutUs = new JMenuItem("About us");
		mntmAboutUs.setIcon(new ImageIcon(FrmQuanLyKhachSan.class.getResource("/view/img/question.png")));
		mnHelp.add(mntmAboutUs);
		mntmTrangChu.addActionListener(this);
		mntmKhachSan.addActionListener(this);
		mntmQLKhachHang.addActionListener(this);
		mntmExit.addActionListener(this);
		mntmDangXuat.addActionListener(this);
		mntmQLChuyenBay.addActionListener(this);
		mntmDatTour.addActionListener(this);
		mntmQLTour.addActionListener(this);
		mntmAboutUs.addActionListener(this);
	}
	public JMenuBar getInstance() {
		return this;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if (o.equals(mntmTrangChu)) {
			frame.setVisible(false);
			new FrmTrangChu().frmTourDuLch.setVisible(true);
		}
		if (o.equals(mntmKhachSan)) {
			frame.setVisible(false);
			new FrmQuanLyKhachSan().setVisible(true);
		}
		if (o.equals(mntmQLKhachHang)) {
			frame.setVisible(false);
			new FrmQLKhachHang().setVisible(true);
		}
		if (o.equals(mntmExit)) {
			System.exit(0);
		}
		if (o.equals(mntmDangXuat)) {
			frame.setVisible(false);
			new Login().frame.setVisible(true);
		}
		if (o.equals(mntmQLChuyenBay)) {
			frame.setVisible(false);
			new FrmQLVePhuongTien().frame.setVisible(true);
		}
		if (o.equals(mntmDatTour)) {
			frame.setVisible(false);
			new FrmDatTour().setVisible(true);
		}
		if (o.equals(mntmQLTour)) {
			frame.setVisible(false);
			new FrmQuanLyTour().setVisible(true);
		}
		if (o.equals(mntmAboutUs)) {
			new AboutUs();
		}
	}
}
