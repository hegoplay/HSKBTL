package view;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Color;
import javax.swing.Box;
import java.awt.Button;
import javax.swing.JMenu;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JTable;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JSpinner;
import java.awt.SystemColor;
import javax.swing.JMenuItem;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import component.MainMenuBar;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import controller.KhachSanController;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
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
	public JTable tblLoc;
	public JComboBox<String> cbTinhThanh;
	public JRadioButton rdbtnGiam;
	public JCheckBox chkThanhVien1;
	public JCheckBox chckbxangHotng;
	public JLabel lblSort;
	/**
	 * Launch the application.
	*/
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					FrmQuanLyKhachSan frame = new FrmQuanLyKhachSan();
					frame.setVisible(true);
				} 
                catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	*/
	public FrmQuanLyKhachSan(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,600);
		setLocationRelativeTo(null); 
		setTitle("Quản lý khách sạn");
		controller = new KhachSanController(this);
		MainMenuBar menuBar = new MainMenuBar(this);
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(255, 192, 203));
		contentPane.add(tabbedPane);
		JPanel pnlThemXoaSua = new JPanel();
		tabbedPane.addTab("Danh Sach Bang", null, pnlThemXoaSua, null);
		pnlThemXoaSua.setLayout(new BorderLayout(0, 0));
		JPanel pnlTitle = new JPanel();
		pnlTitle.setBorder(new TitledBorder(new LineBorder(new Color(238, 130, 238), 1, true), "Ch\u1EE9c n\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(221, 160, 221)));
		pnlThemXoaSua.add(pnlTitle, BorderLayout.NORTH);
		pnlTitle.setLayout(new BorderLayout(0, 0));
		JPanel pnlValues = new JPanel();
		pnlTitle.add(pnlValues, BorderLayout.NORTH);
		pnlValues.setLayout(new GridLayout(2, 2, 10, 10));
		JPanel pnlTenKS = new JPanel();
		pnlValues.add(pnlTenKS);
		pnlTenKS.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JLabel lblNewLabel = new JLabel("Tên khách sạn");
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
		pnlTenKS.add(lblNewLabel);
		txtTenKS = new JTextField();
		txtTenKS.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
		txtTenKS.setColumns(10);
		pnlTenKS.add(txtTenKS);
		JPanel pnlTinhThanh = new JPanel();
		pnlValues.add(pnlTinhThanh);
		pnlTinhThanh.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JLabel lblMaTinhThanh = new JLabel("Mã tỉnh thành");
		lblMaTinhThanh.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
		pnlTinhThanh.add(lblMaTinhThanh);
		cbMaTinhThanh = new JComboBox<String>();
		cbMaTinhThanh.setFont(new Font("Segoe UI Variable", Font.PLAIN, 18));
		pnlTinhThanh.add(cbMaTinhThanh);
		JPanel pnlDiaChi = new JPanel();
		pnlValues.add(pnlDiaChi);
		pnlDiaChi.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
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
		JLabel lblMoTa = new JLabel("Mô tả: ");
		lblMoTa.setBackground(new Color(255, 182, 193));
		lblMoTa.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		pnlMoTa.add(lblMoTa);
		txtMoTa = new JTextPane();
		lblMoTa.setLabelFor(txtMoTa);
		txtMoTa.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		pnlMoTa.add(txtMoTa);
		JPanel pnlChucNang = new JPanel();
		pnlTitle.add(pnlChucNang, BorderLayout.SOUTH);
		// pnlChucNang.add(Box.createRigidArea(new Dimension(500, 50)) );
		JButton btnThem = new JButton("Thêm");
		btnThem.setSelectedIcon(new ImageIcon(FrmQuanLyKhachSan.class.getResource("/view/img/add.png")));
		btnThem.setFont(new Font("SansSerif", Font.PLAIN, 18));
		pnlChucNang.add(btnThem);
		JButton btnXoa = new JButton("Xóa");
		btnXoa.setFont(new Font("SansSerif", Font.PLAIN, 18));
		pnlChucNang.add(btnXoa);
		JButton btnXoaRong = new JButton("Xoá Rỗng");
		btnXoaRong.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnXoaRong.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
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
            new Object[][]{},
            new String[]{
                "maKS", "tenKS", "tenTinhThanh", "diaChi", "moTa", "laThanhVien", "dangHoatDong"
            }
        ){
            Class[] columnTypes = new Class[]{
                Integer.class, String.class, String.class, String.class, String.class, Boolean.class, Boolean.class
            };
            public Class getColumnClass(int columnIndex){
                return columnTypes[columnIndex];
            }
        });
		scrollPane.setViewportView(table);
		JPanel pnlLoc = new JPanel();
		tabbedPane.addTab("Lọc dữ liệu", null, pnlLoc, null);
		pnlLoc.setLayout(null);
		JScrollPane sclPaneLoc = new JScrollPane();
		sclPaneLoc.setBounds(0, 207, 969, 248);
		pnlLoc.add(sclPaneLoc);
		tblLoc = new JTable();
        tblLoc.setModel(new DefaultTableModel(
            new Object[][]{},
            new String[]{
                "maKS", "tenKS", "tenTinhThanh", "diaChi", "moTa", "laThanhVien", "dangHoatDong"
            }
        ){
            Class[] columnTypes = new Class[] {
                Integer.class, String.class, String.class, String.class, String.class, Boolean.class, Boolean.class
            };
            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        });
		sclPaneLoc.setViewportView(tblLoc);
		JPanel pnlChucNang1 = new JPanel();
		pnlChucNang1.setBounds(0, 0, 969, 207);
		pnlLoc.add(pnlChucNang1);
		pnlChucNang1.setLayout(new BorderLayout(0, 0));
		Panel pnlLocDuLieu = new Panel();
		pnlChucNang1.add(pnlLocDuLieu, BorderLayout.SOUTH);
		JButton btnLoc = new JButton("Lọc");
		btnLoc.setToolTipText("Lọc danh sách");
		pnlLocDuLieu.add(btnLoc);
		JButton btnCancel = new JButton("Hủy");
		pnlLocDuLieu.add(btnCancel);
		JPanel pnlDuLieuLoc = new JPanel();
		pnlDuLieuLoc.setBorder(new TitledBorder(new LineBorder(new Color(255, 182, 193), 2), "D\u1EEF li\u1EC7u", TitledBorder.RIGHT, TitledBorder.TOP, null, null));
		pnlChucNang1.add(pnlDuLieuLoc, BorderLayout.CENTER);
		pnlDuLieuLoc.setLayout(new GridLayout(3, 2, 10, 10));
		JLabel lblTenTinhThanh = new JLabel("Tên tỉnh thành");
		lblTenTinhThanh.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblTenTinhThanh.setHorizontalAlignment(SwingConstants.CENTER);
		pnlDuLieuLoc.add(lblTenTinhThanh);
		cbTinhThanh = new JComboBox<String>();
		lblTenTinhThanh.setLabelFor(cbTinhThanh);
		pnlDuLieuLoc.add(cbTinhThanh);
		chkThanhVien1 = new JCheckBox("là thành viên");
		chkThanhVien1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		chkThanhVien1.setHorizontalAlignment(SwingConstants.CENTER);
		pnlDuLieuLoc.add(chkThanhVien1);
		chckbxangHotng = new JCheckBox("Đang hoạt động");
		chckbxangHotng.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		chckbxangHotng.setHorizontalAlignment(SwingConstants.CENTER);
		pnlDuLieuLoc.add(chckbxangHotng);
		lblSort = new JLabel("Sort maKS");
		lblSort.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblSort.setHorizontalAlignment(SwingConstants.CENTER);
		pnlDuLieuLoc.add(lblSort);
		JPanel panel_1 = new JPanel();
		pnlDuLieuLoc.add(panel_1);
		rdbtnGiam = new JRadioButton("Giảm");
		rdbtnGiam.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		panel_1.add(rdbtnGiam);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(218, 112, 214));
		contentPane.add(panel, BorderLayout.NORTH);
		JLabel lblTitle = new JLabel("Hệ thống quản lý");
		lblTitle.setForeground(new Color(224, 255, 255));
		lblTitle.setBackground(SystemColor.activeCaption);
		lblTitle.setFont(new Font("Source Code Pro", Font.PLAIN, 28));
		//xu ly su kien
		panel.add(lblTitle);
		table.addMouseListener(controller);
		btnXoaRong.addActionListener(controller);
		btnLoc.addActionListener(controller);
		btnThem.addActionListener(controller);
		btnSua.addActionListener(controller);
		btnXoa.addActionListener(controller);
		fillTable();
		fillCb();
	}
	private void fillCb(){
		String[] temp = controller.getDsTinhThanh();
		cbTinhThanh.addItem("");
		for(String x : temp){
			cbMaTinhThanh.addItem(x);
			cbTinhThanh.addItem(x);
		}
	}
	private void fillTable(){
		controller.fillTable();
	}
	public void getValueFromTable(){
		int row = table.getSelectedRow();
		txtTenKS.setText((String) table.getValueAt(row, 1));
		txtDiaChi.setText((String) table.getValueAt(row, 3));
		cbMaTinhThanh.setSelectedItem((String) table.getValueAt(row, 2));
		txtMoTa.setText((String) table.getValueAt(row, 4));
		chkbxDgHoatDong.setSelected((Boolean) table.getValueAt(row, 5));
		chkboxIsTV.setSelected((Boolean) table.getValueAt(row, 6));
	}
}