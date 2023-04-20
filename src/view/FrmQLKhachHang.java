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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTabbedPane;

public class FrmQLKhachHang extends JFrame {

	private JPanel contentPane;
	private JTable table;

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
		pnlTable.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		pnlTable.add(scrollPane, BorderLayout.CENTER);
		
		table = new KhachHangTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		pnlTable.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnThem = new JButton("Them");
		panel_1.add(btnThem);
		
		JButton btnXoa = new JButton("Xoa");
		panel_1.add(btnXoa);
		
		JButton btnSua = new JButton("Sua");
		panel_1.add(btnSua);
		
		JPanel pnlTitle = new JPanel();
		pnlTitle.setBackground(new Color(218, 112, 214));
		contentPane.add(pnlTitle, BorderLayout.NORTH);
		
		JLabel lblTitle = new JLabel("Hệ thống quản lý");
		lblTitle.setForeground(new Color(224, 255, 255));
		lblTitle.setFont(new Font("Source Code Pro", Font.PLAIN, 28));
		lblTitle.setBackground(SystemColor.activeCaption);
		pnlTitle.add(lblTitle);
		
		
	}

}
