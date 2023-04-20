package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import component.MainMenuBar;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.FlowLayout;

public class FrmTrangChu {

	public JFrame frmTourDuLch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTrangChu window = new FrmTrangChu();
					window.frmTourDuLch.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmTrangChu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTourDuLch = new JFrame();
		frmTourDuLch.setTitle("Tour Du Lịch");
		frmTourDuLch.setSize(1000,600);
		frmTourDuLch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frmTourDuLch.setJMenuBar(new MainMenuBar(frmTourDuLch));
		frmTourDuLch.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(138, 43, 226));
		frmTourDuLch.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Trang Chủ  Tour Du lịch");
		lblNewLabel.setBackground(new Color(123, 104, 238));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Documents\\Workspace\\Java.workspace\\BTL\\src\\view\\img\\menuImg.jpg"));
		frmTourDuLch.getContentPane().add(lblNewLabel_1);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
