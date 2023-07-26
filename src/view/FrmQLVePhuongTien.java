package view;
import java.awt.Font;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JFrame;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.EventQueue;
import javax.swing.JMenuBar;
import java.awt.SystemColor;
import component.MainMenuBar;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import component.KhachHangTable;
import component.VeDiChuyenTable;
import javax.swing.SwingConstants;
import controller.QuanLyVeController;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.table.DefaultTableModel;
public class FrmQLVePhuongTien {
	public JFrame frame;
	public JComboBox<String> cbLoaiVe;
	public JComboBox<String> cbTPDiemdi;
	public JTextField txtGia;
	private JTable tblVePT;
	public JTable table;
	private QuanLyVeController controller;
	public JComboBox<String> cbTPDiemDen;
	public JComboBox<String> cbTenCongTy;
	public JRadioButton rdbtnNewRadioButton;
	/**
	 * Launch the application.
	*/
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					FrmQLVePhuongTien window = new FrmQLVePhuongTien();
					window.frame.setVisible(true);
				} 
                catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	*/
	public FrmQLVePhuongTien(){
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	*/
	private void initialize(){
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setTitle("Vé phương tiện");
		frame.setJMenuBar(new MainMenuBar(frame));
		frame.setBounds(100, 100, 921, 609);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		JPanel pnlVePT = new JPanel();
		tabbedPane.addTab("New tab", null, pnlVePT, null);
		pnlVePT.setLayout(null);
		cbTenCongTy = new JComboBox<String>();
		cbTenCongTy.setBounds(92, 22, 200, 26);
		pnlVePT.add(cbTenCongTy);
		JLabel lblNewLabel_1 = new JLabel("Tên Công Ty");
		lblNewLabel_1.setBounds(10, 29, 155, 13);
		pnlVePT.add(lblNewLabel_1);
		cbLoaiVe = new JComboBox<String>();
		cbLoaiVe.setBounds(92, 59, 200, 26);
		pnlVePT.add(cbLoaiVe);
		JLabel lblNewLabel_1_1 = new JLabel("Loại vé");
		lblNewLabel_1_1.setBounds(12, 66, 155, 13);
		pnlVePT.add(lblNewLabel_1_1);
		JLabel lblNewLabel_1_1_1 = new JLabel("TP Điểm Đi");
		lblNewLabel_1_1_1.setBounds(314, 66, 155, 13);
		pnlVePT.add(lblNewLabel_1_1_1);
		cbTPDiemdi = new JComboBox<String>();
		cbTPDiemdi.setBounds(385, 59, 200, 26);
		pnlVePT.add(cbTPDiemdi);
		JLabel lblNewLabel_1_2 = new JLabel("Giá vé");
		lblNewLabel_1_2.setBounds(314, 29, 155, 13);
		pnlVePT.add(lblNewLabel_1_2);
		txtGia = new JTextField();
		txtGia.setBounds(385, 23, 200, 26);
		pnlVePT.add(txtGia);
		txtGia.setColumns(10);
		JLabel lblNewLabel_1_1_1_1 = new JLabel("TP Điểm Đến");
		lblNewLabel_1_1_1_1.setBounds(595, 66, 70, 13);
		pnlVePT.add(lblNewLabel_1_1_1_1);
		cbTPDiemDen = new JComboBox<String>();
		cbTPDiemDen.setBounds(675, 59, 200, 26);
		pnlVePT.add(cbTPDiemDen);
		rdbtnNewRadioButton = new JRadioButton("Đang hoạt động");
		rdbtnNewRadioButton.setBounds(591, 25, 159, 21);
		pnlVePT.add(rdbtnNewRadioButton);
		JRadioButton rdbtnKhngHotng = new JRadioButton("Không hoạt động");
		rdbtnKhngHotng.setBounds(752, 25, 159, 21);
		pnlVePT.add(rdbtnKhngHotng);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 140, 880, 326);
		pnlVePT.add(scrollPane);
		table = new VeDiChuyenTable();
		scrollPane.setViewportView(table);
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnKhngHotng);
		btnGroup.add(rdbtnNewRadioButton);
		controller = new QuanLyVeController(this);
		controller.fillCbTT(cbTPDiemdi);
		controller.fillCbTT(cbTPDiemDen);
		JPanel panel = new JPanel();
		panel.setBounds(10, 96, 880, 34);
		pnlVePT.add(panel);
		JButton btnThem = new JButton("Thêm");
		panel.add(btnThem);
		JButton btnXoa = new JButton("Xóa");
		panel.add(btnXoa);
		JButton btnSua = new JButton("Sửa");
		panel.add(btnSua);
		JButton btnXoaRong = new JButton("Cancel");
		panel.add(btnXoaRong);
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(218, 112, 214));
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		JLabel lblQunLV = new JLabel("Quản lý vé phương tiện");
		lblQunLV.setForeground(new Color(224, 255, 255));
		lblQunLV.setFont(new Font("Source Code Pro", Font.PLAIN, 28));
		lblQunLV.setBackground(SystemColor.activeCaption);
		panel_1.add(lblQunLV);
		controller.fillLoaiVe();
		controller.fillCongTyPT();
		controller.fillTable();
		btnThem.addActionListener(controller);
		btnXoa.addActionListener(controller);
		btnSua.addActionListener(controller);
		btnXoaRong.addActionListener(controller);
		FrmAboutUs ui = new FrmAboutUs();
		ui.tableUI(table, pnlVePT, scrollPane);
	}
}