package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import component.KhachHangTable;
import component.MainMenuBar;
import controller.DatTourController;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.RowFilter.Entry;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JComboBox;

public class FrmDatTour extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public KhachHangTable tblKhachHang;
	public JTextField txtHo;
	public JTextField txtTen;
	public JTextField txtSDT;
	public JTextField txtEmail;
	public JComboBox<String> cbTinhThanh;
	public DatTourController controller;
	private JButton btnLoc;
	public JButton btnChon;
	public JTabbedPane tabbedPane;
	public String diemDi = "";
	public String diemDen = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmDatTour frame = new FrmDatTour();
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
	public FrmDatTour() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,600);
		setLocationRelativeTo(null); 
		setTitle("Đặt tour");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(1000,600);
		setLocationRelativeTo(null); 
		setContentPane(contentPane);
		setJMenuBar(new MainMenuBar(this));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlTitle = new JPanel();
		pnlTitle.setBackground(new Color(218, 112, 214));
		contentPane.add(pnlTitle, BorderLayout.NORTH);
		
		
		
		JLabel lblTitle = new JLabel("Hệ thống quản lý");
		lblTitle.setForeground(new Color(224, 255, 255));
		lblTitle.setFont(new Font("Source Code Pro", Font.PLAIN, 28));
		lblTitle.setBackground(SystemColor.activeCaption);
		pnlTitle.add(lblTitle);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel pnlKhachHang = new JPanel();
		tabbedPane.addTab("Khách Hàng", null, pnlKhachHang, null);
		pnlKhachHang.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlFieldSort = new JPanel();
		pnlKhachHang.add(pnlFieldSort, BorderLayout.NORTH);
		pnlFieldSort.setLayout(new GridLayout(3, 2, 0, 0));
		
		JPanel pnlHo = new JPanel();
		pnlFieldSort.add(pnlHo);
		
		JLabel lblHo = new JLabel("Họ:");
		pnlHo.add(lblHo);
		
		txtHo = new JTextField();
		pnlHo.add(txtHo);
		txtHo.setColumns(20);
		
		JPanel pnlTen = new JPanel();
		pnlFieldSort.add(pnlTen);
		
		JLabel lblTen = new JLabel("Tên:");
		pnlTen.add(lblTen);
		
		txtTen = new JTextField();
		pnlTen.add(txtTen);
		txtTen.setColumns(20);
		
		JPanel pnlSDT = new JPanel();
		pnlFieldSort.add(pnlSDT);
		
		JLabel lblSDT = new JLabel("SDT:");
		pnlSDT.add(lblSDT);
		
		txtSDT = new JTextField();
		pnlSDT.add(txtSDT);
		txtSDT.setColumns(20);
		
		JPanel pnlEmail = new JPanel();
		pnlFieldSort.add(pnlEmail);
		
		JLabel lblEmail = new JLabel("Email:");
		pnlEmail.add(lblEmail);
		
		txtEmail = new JTextField();
		pnlEmail.add(txtEmail);
		txtEmail.setColumns(20);
		
		JPanel panel = new JPanel();
		pnlFieldSort.add(panel);
		
		JLabel lblTinhThanh = new JLabel("Tỉnh");
		panel.add(lblTinhThanh);
		
		cbTinhThanh = new JComboBox<String>();
		panel.add(cbTinhThanh);
		
		JPanel pnlChucNang = new JPanel();
		pnlFieldSort.add(pnlChucNang);
		
		btnLoc = new JButton("Lọc Khách hàng");
		
		pnlChucNang.add(btnLoc);
		
		btnChon = new JButton("Chọn Khách hàng");
		pnlChucNang.add(btnChon);
		
		tblKhachHang = new KhachHangTable();
		
		JScrollPane paneKH = new JScrollPane(tblKhachHang);
		pnlKhachHang.add(paneKH, BorderLayout.CENTER);
		
		

		
		
		controller = new DatTourController(this);
		controller.fillCb();
		controller.fillTable();

		
		btnLoc.addActionListener(controller);
		btnChon.addActionListener(controller);
		
		lblHo.setPreferredSize(lblEmail.getPreferredSize());
		lblSDT.setPreferredSize(lblEmail.getPreferredSize());
		lblTen.setPreferredSize(lblEmail.getPreferredSize());
		
		
	}
	
}
