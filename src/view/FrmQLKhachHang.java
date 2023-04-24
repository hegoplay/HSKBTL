 package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.MenuBar;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import component.KhachHangTable;
import component.MainMenuBar;
import controller.KhachHangController;
import entity.KhachHang;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTabbedPane;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class FrmQLKhachHang extends JFrame{

	private JPanel contentPane;
	public JTable table;
	public JTextField txtHo;
	public JTextField txtTen;
	public JTextField txtDiachi;
	public JTextField txtemail;
	private JButton btnThem;
	private JButton btnXoa;
	private JButton btnSua;
	public JTextField txtSDT;
	private KhachHangController controller;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmQLKhachHang frame = new FrmQLKhachHang();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmQLKhachHang() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,600);
		setLocationRelativeTo(null); 
		setTitle("Quản lý khách hàng");
		JMenuBar menuBar = new MainMenuBar(this);
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		Image img = new ImageIcon(this.getClass().getResource("img/new.png")).getImage();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel pnlTable = new JPanel();
		tabbedPane.addTab("Danh sách bảng", null, pnlTable, null);
		pnlTable.setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 122, 971, 339);
		pnlTable.add(scrollPane);
		
		table = new KhachHangTable();
		scrollPane.setViewportView(table);
		
		JPanel pnlFiled = new JPanel();
		pnlFiled.setBounds(0, 0, 971, 83);
		pnlTable.add(pnlFiled);
		pnlFiled.setLayout(null);
		
		JLabel lblho = new JLabel("ho");
		lblho.setHorizontalAlignment(SwingConstants.LEFT);
		lblho.setBounds(10, 10, 45, 13);
		pnlFiled.add(lblho);
		
		txtHo = new JTextField();
		txtHo.setBounds(60, 7, 435, 19);
		pnlFiled.add(txtHo);
		txtHo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ten");
		lblNewLabel.setBounds(505, 10, 45, 13);
		pnlFiled.add(lblNewLabel);
		
		txtTen = new JTextField();
		txtTen.setBounds(531, 7, 409, 19);
		pnlFiled.add(txtTen);
		txtTen.setColumns(10);
		
		JLabel lbldiachi = new JLabel("diachi");
		lbldiachi.setHorizontalAlignment(SwingConstants.LEFT);
		lbldiachi.setBounds(10, 33, 45, 13);
		pnlFiled.add(lbldiachi);
		
		txtDiachi = new JTextField();
		txtDiachi.setBounds(60, 30, 435, 19);
		pnlFiled.add(txtDiachi);
		txtDiachi.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setBounds(10, 56, 45, 13);
		pnlFiled.add(lblEmail);
		
		txtemail = new JTextField();
		txtemail.setBounds(60, 53, 880, 19);
		pnlFiled.add(txtemail);
		txtemail.setColumns(10);
		
		txtSDT = new JTextField();
		txtSDT.setBounds(531, 29, 409, 20);
		pnlFiled.add(txtSDT);
		txtSDT.setColumns(10);
		
		JLabel lblSDT = new JLabel("SDT");
		lblSDT.setBounds(505, 32, 46, 14);
		pnlFiled.add(lblSDT);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 81, 971, 31);
		pnlTable.add(panel);
		
		btnThem = new JButton("Thêm");
		panel.add(btnThem);
		
		btnXoa = new JButton("Xoa");
		panel.add(btnXoa);
		
		btnSua = new JButton("Sua");
		panel.add(btnSua);
		
		JPanel pnlTitle = new JPanel();
		pnlTitle.setBackground(new Color(218, 112, 214));
		contentPane.add(pnlTitle, BorderLayout.NORTH);
		
		JLabel lblTitle = new JLabel("Hệ thống quản lý");
		lblTitle.setForeground(new Color(224, 255, 255));
		lblTitle.setFont(new Font("Source Code Pro", Font.PLAIN, 28));
		lblTitle.setBackground(SystemColor.activeCaption);
		pnlTitle.add(lblTitle);
		
		controller = new KhachHangController(this);
		btnThem.addActionListener(controller);
		controller.fillTable();
		table.addMouseListener(controller);
		btnXoa.addActionListener(controller);
		btnSua.addActionListener(controller);
	}
}
