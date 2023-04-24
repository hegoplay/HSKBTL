package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import component.MainMenuBar;
import component.TourTable;
import controller.TourController;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.util.Calendar;
import java.util.Date;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JCalendar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import com.toedter.components.JSpinField;
import javax.swing.SpinnerNumberModel;

public class FrmQuanLyTour extends JFrame {

	private JPanel contentPane;
	public JTextField txtTenTour;
	public JTable table;
	public JComboBox cbTPDiemDen;
	public JComboBox cbTPDiemDi;
	private TourController controller;
	public JSpinner spinGioVe;
	public JSpinner spinPhutVe;
	public JSpinner spinPhutDi;
	public JDateChooser dcNgayKetThuc;
	public JSpinner spinGioDi;
	public JDateChooser dcNgayBatDau;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmQuanLyTour frame = new FrmQuanLyTour();
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
	public FrmQuanLyTour() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200,600);
		setLocationRelativeTo(null); 
		setJMenuBar(new MainMenuBar(this));
		setTitle("Hệ thống quản lý du lịch");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlTitle = new JPanel();
		pnlTitle.setBackground(new Color(218, 112, 214));
		contentPane.add(pnlTitle, BorderLayout.NORTH);
		
		JLabel lblTitle = new JLabel("Hệ thống quản lý");
		lblTitle.setForeground(new Color(224, 255, 255));
		lblTitle.setFont(new Font("Source Code Pro", Font.PLAIN, 28));
		lblTitle.setBackground(SystemColor.activeCaption);
		pnlTitle.add(lblTitle);
		
		JPanel pnlQL = new JPanel();
		contentPane.add(pnlQL, BorderLayout.CENTER);
		pnlQL.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlField = new JPanel();
		pnlQL.add(pnlField, BorderLayout.NORTH);
		pnlField.setLayout(new GridLayout(2, 3, 0, 0));
		
		JPanel pnlTenTour = new JPanel();
		pnlField.add(pnlTenTour);
		
		JLabel lblTenTour = new JLabel("Tên Tour");
		pnlTenTour.add(lblTenTour);
		
		txtTenTour = new JTextField();
		pnlTenTour.add(txtTenTour);
		txtTenTour.setColumns(20);
		
		JPanel pnlTgBatDau = new JPanel();
		pnlField.add(pnlTgBatDau);
		
		JLabel lblTgBatDau = new JLabel("Tg Bắt đầu");
		pnlTgBatDau.add(lblTgBatDau);
		
		dcNgayBatDau = new JDateChooser();
		pnlTgBatDau.add(dcNgayBatDau);
		
		JLabel lblGioDi = new JLabel("Giờ");
		pnlTgBatDau.add(lblGioDi);
		
		spinGioDi = new JSpinner();
		spinGioDi.setModel(new SpinnerNumberModel(0, 0, 23, 1));
		pnlTgBatDau.add(spinGioDi);
		
		JLabel lblPhutDi = new JLabel("Phút");
		pnlTgBatDau.add(lblPhutDi);
		
		spinPhutDi = new JSpinner();
		spinPhutDi.setModel(new SpinnerNumberModel(0, 0, 59, 1));
		pnlTgBatDau.add(spinPhutDi);
		
		JPanel pnlTgKetThuc = new JPanel();
		pnlField.add(pnlTgKetThuc);
		
		JLabel lblTgKetThuc = new JLabel("tg Kết thúc");
		pnlTgKetThuc.add(lblTgKetThuc);
		
		dcNgayKetThuc = new JDateChooser();
		pnlTgKetThuc.add(dcNgayKetThuc);
		
		JLabel lblGioVe = new JLabel("Giờ");
		pnlTgKetThuc.add(lblGioVe);
		
		spinGioVe = new JSpinner();
		spinGioVe.setModel(new SpinnerNumberModel(0, 0, 23, 1));
		pnlTgKetThuc.add(spinGioVe);
		
		JLabel lblPhutVe = new JLabel("Phút");
		pnlTgKetThuc.add(lblPhutVe);
		
		spinPhutVe = new JSpinner();
		spinPhutVe.setModel(new SpinnerNumberModel(0, 0, 59, 1));
		pnlTgKetThuc.add(spinPhutVe);
		
		JPanel pnlTPDiemDi = new JPanel();
		pnlField.add(pnlTPDiemDi);
		
		JLabel lblTPDiemDi = new JLabel("TP Điểm Đi");
		pnlTPDiemDi.add(lblTPDiemDi);
		
		cbTPDiemDi = new JComboBox();
		pnlTPDiemDi.add(cbTPDiemDi);
		
		JPanel pnlTPDiemDen = new JPanel();
		pnlField.add(pnlTPDiemDen);
		
		JLabel lblTPDiemDen = new JLabel("TP Điểm Đen");
		pnlTPDiemDen.add(lblTPDiemDen);
		
		cbTPDiemDen = new JComboBox();
		pnlTPDiemDen.add(cbTPDiemDen);
		
		JPanel panel = new JPanel();
		pnlField.add(panel);
		
		JButton btnThem = new JButton("Thêm");
		panel.add(btnThem);
		
		JButton btnXoa = new JButton("Xóa");
		panel.add(btnXoa);
		
		JButton btnSua = new JButton("Sửa");
		panel.add(btnSua);
		
		JScrollPane scrollPane = new JScrollPane();
		pnlQL.add(scrollPane, BorderLayout.CENTER);
		
		
		table = new TourTable();
		scrollPane.setViewportView(table);
		
		controller = new TourController(this);
		
		controller.fillCbTT(cbTPDiemDen);
		controller.fillCbTT(cbTPDiemDi);
		
		dcNgayBatDau.setDate(new Date());
		Calendar now = Calendar.getInstance();
		spinGioDi.setValue(now.get(Calendar.HOUR));
		dcNgayKetThuc.setDate(new Date());
		spinGioVe.setValue(now.get(Calendar.HOUR)+1);
		btnThem.addActionListener(controller);
		controller.fillDs();
	}

}
