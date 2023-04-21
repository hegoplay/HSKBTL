package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import component.MainMenuBar;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;

public class FrmQuanLyTour extends JFrame {

	private JPanel contentPane;
	private JTextField txtTenTour;

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
		setSize(1000,600);
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
		
		JDateChooser dcNgayBatDau = new JDateChooser();
		dcNgayBatDau.setDateFormatString("d MMM, YYYY");
		pnlTgBatDau.add(dcNgayBatDau);
		
		JPanel pnlTgKetThuc = new JPanel();
		pnlField.add(pnlTgKetThuc);
		
		JLabel lblTgKetThuc = new JLabel("tg Kết thúc");
		pnlTgKetThuc.add(lblTgKetThuc);
		
		JDateChooser dcNgayKetThuc = new JDateChooser();
		dcNgayKetThuc.setDateFormatString("d MMM, YYYY");
		pnlTgKetThuc.add(dcNgayKetThuc);
		
		JLabel lblTemp = new JLabel("");
		pnlField.add(lblTemp);
		
		JLabel lblTemp1 = new JLabel("");
		pnlField.add(lblTemp1);
		
		JPanel panel = new JPanel();
		pnlField.add(panel);
		
		JButton btnThem = new JButton("Thêm");
		panel.add(btnThem);
		
		JButton btnXoa = new JButton("Xóa");
		panel.add(btnXoa);
		
		JButton btnSua = new JButton("Sửa");
		panel.add(btnSua);
	}

}
