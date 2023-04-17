package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.KhachSanController;

import javax.swing.JTabbedPane;
import javax.swing.JMenuItem;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class FrmQuanLyKhachSan extends JFrame {

	private JPanel contentPane;
	private KhachSanController controller;
	public JTextField txtTenKS;
	public JTextField txtDiaChi;
	public JComboBox<String> cbMaTinhThanh;
	public JTable table;
	public JTextPane txtMoTa;
	public JCheckBox chkboxIsTV;
	public JCheckBox chkbxDgHoatDong;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmQuanLyKhachSan frame = new FrmQuanLyKhachSan();
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
	public FrmQuanLyKhachSan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,800);
		setLocationRelativeTo(null); 
		setTitle("Quan ly khach san");
		controller = new KhachSanController(this);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnChucNang = new JMenu("Chuc Nang");
		menuBar.add(mnChucNang);
		
		JMenuItem mntmTrangChu = new JMenuItem("TrangChu");
		mntmTrangChu.setIcon(new ImageIcon(FrmQuanLyKhachSan.class.getResource("/view/img/TrangChu.png")));
		mnChucNang.add(mntmTrangChu);
		
		JSeparator separator = new JSeparator();
		mnChucNang.add(separator);
		
		JMenuItem mntmExit = new JMenuItem("Thoat Chuong Trinh");
		mntmExit.setIcon(new ImageIcon(FrmQuanLyKhachSan.class.getResource("/view/img/exit.png")));
		mnChucNang.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		JPanel pnlThemXoaSua = new JPanel();
		tabbedPane.addTab("Danh Sach Bang", null, pnlThemXoaSua, null);
		pnlThemXoaSua.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlTitle = new JPanel();
		pnlTitle.setBorder(new TitledBorder(new LineBorder(new Color(238, 130, 238), 1, true), "Ch\u1EE9c n\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(221, 160, 221)));
		pnlThemXoaSua.add(pnlTitle, BorderLayout.SOUTH);
		pnlTitle.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlValues = new JPanel();
		pnlTitle.add(pnlValues, BorderLayout.NORTH);
		pnlValues.setLayout(new GridLayout(2, 2, 10, 10));
		
		JPanel pnlTenKS = new JPanel();
		pnlValues.add(pnlTenKS);
		pnlTenKS.setLayout(new BoxLayout(pnlTenKS, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel = new JLabel("Tên khách sạn");
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
		pnlTenKS.add(lblNewLabel);
		
		txtTenKS = new JTextField();
		txtTenKS.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
		txtTenKS.setColumns(10);
		pnlTenKS.add(txtTenKS);
		
		JPanel pnlTinhThanh = new JPanel();
		pnlValues.add(pnlTinhThanh);
		pnlTinhThanh.setLayout(new BoxLayout(pnlTinhThanh, BoxLayout.X_AXIS));
		
		JLabel lblMaTinhThanh = new JLabel("Mã tỉnh thành");
		lblMaTinhThanh.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
		pnlTinhThanh.add(lblMaTinhThanh);
		
		cbMaTinhThanh = new JComboBox<String>();
		fillCb();
		cbMaTinhThanh.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
		pnlTinhThanh.add(cbMaTinhThanh);
		
		JPanel pnlDiaChi = new JPanel();
		pnlValues.add(pnlDiaChi);
		pnlDiaChi.setLayout(new BoxLayout(pnlDiaChi, BoxLayout.X_AXIS));
		
		JLabel lblDiaChi = new JLabel("Địa chỉ");
		lblDiaChi.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
		pnlDiaChi.add(lblDiaChi);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
		txtDiaChi.setColumns(10);
		pnlDiaChi.add(txtDiaChi);
		
		JPanel pnlChkBox = new JPanel();
		pnlValues.add(pnlChkBox);
		pnlChkBox.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		chkboxIsTV = new JCheckBox("Là Thành Viên");
		chkboxIsTV.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
		pnlChkBox.add(chkboxIsTV);
		
		chkbxDgHoatDong = new JCheckBox("Đang Hoạt Động");
		chkbxDgHoatDong.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
		pnlChkBox.add(chkbxDgHoatDong);
		
		JPanel pnlMoTa = new JPanel();
		pnlMoTa.setBackground(Color.WHITE);
		pnlMoTa.setBorder(new LineBorder(SystemColor.control, 6));
		pnlTitle.add(pnlMoTa, BorderLayout.CENTER);
		pnlMoTa.setLayout(new BoxLayout(pnlMoTa, BoxLayout.X_AXIS));
		
		JLabel lblMoTa = new JLabel("Mô tả ");
		lblMoTa.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		pnlMoTa.add(lblMoTa);
		
		txtMoTa = new JTextPane();
		lblMoTa.setLabelFor(txtMoTa);
		txtMoTa.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		pnlMoTa.add(txtMoTa);
		
		JPanel pnlChucNang = new JPanel();
		pnlTitle.add(pnlChucNang, BorderLayout.SOUTH);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.setSelectedIcon(new ImageIcon(FrmQuanLyKhachSan.class.getResource("/view/img/add.png")));
		btnThem.setFont(new Font("SansSerif", Font.PLAIN, 18));
		pnlChucNang.add(btnThem);
		
		JButton btnXóa = new JButton("Xóa");
		btnXóa.setFont(new Font("SansSerif", Font.PLAIN, 18));
		pnlChucNang.add(btnXóa);
		
		JButton btnXoaRong = new JButton("Xoá Rỗng");
		btnXoaRong.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnXoaRong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pnlChucNang.add(btnXoaRong);
		
		JButton btnSua = new JButton("Sửa");
		btnSua.setFont(new Font("SansSerif", Font.PLAIN, 18));
		pnlChucNang.add(btnSua);
		
		JScrollPane scrollPane = new JScrollPane();
		pnlThemXoaSua.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"maKS", "tenKS", "tenTinhThanh", "diaChi", "moTa", "laThanhVien", "dangHoatDong"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class, Boolean.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JPanel pnlLoc = new JPanel();
		tabbedPane.addTab("New tab", null, pnlLoc, null);
		table.addMouseListener(controller);
		btnXoaRong.addActionListener(controller);
		fillTable();
	}
	private void fillCb() {
		String[] temp = controller.getDsTinhThanh();
		for (String x : temp) {
			cbMaTinhThanh.addItem(x);
		}
	}
	private void fillTable() {
		controller.fillTable();
	}
	public void getValueFromTable() {
		int row = table.getSelectedRow();
		txtTenKS.setText((String) table.getValueAt(row, 1));
		txtDiaChi.setText((String) table.getValueAt(row, 3));
		cbMaTinhThanh.setSelectedItem((String) table.getValueAt(row, 2));
		txtMoTa.setText((String) table.getValueAt(row, 4));
		chkbxDgHoatDong.setSelected((boolean) table.getValueAt(row, 5));
		chkboxIsTV.setSelected((boolean) table.getValueAt(row, 6));
	}


}


