package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import test.PlaceholderTextField;

import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import controller.LoginController;

import java.awt.Toolkit;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	public PlaceholderTextField txtUser;
	private LoginController controller;
	public JPasswordField passwordField;
	public JButton btnLogIn;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 568, 267);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/view/img/background.jpg")));
		JPanel pnlTitle = new JPanel();
		pnlTitle.setBackground(new Color(255, 128, 255));
		frame.getContentPane().add(pnlTitle, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(new Color(224, 255, 255));
		lblNewLabel.setBackground(new Color(255, 182, 193));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		pnlTitle.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel pnlCenter = new JPanel();
		frame.getContentPane().add(pnlCenter, BorderLayout.CENTER);
		pnlCenter.setLayout(new GridLayout(4, 1, 10, 10));
		
		JPanel panel = new JPanel();
		pnlCenter.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Login.class.getResource("/view/img/background.jpg")));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(Login.class.getResource("/view/img/background.jpg")));
		panel.add(lblNewLabel_3_1);
		
		JPanel userName = new JPanel();
		pnlCenter.add(userName);
		userName.setLayout(new BoxLayout(userName, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/view/img/user.png")));
		userName.add(lblNewLabel_2);
		
		txtUser = new PlaceholderTextField();
		txtUser.setForeground(new Color(112, 128, 144));
		txtUser.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtUser.setHorizontalAlignment(SwingConstants.LEFT);
		userName.add(txtUser);
		txtUser.setColumns(10);
		txtUser.setPlaceholder("Tai Khoan");;
		JPanel password = new JPanel();
		pnlCenter.add(password);
		password.setLayout(new BoxLayout(password, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_1 = new JLabel("");
		password.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/view/img/pwd.png")));
		
		passwordField = new JPasswordField();
		password.add(passwordField);
		
		btnLogIn = new JButton("Log In");
		btnLogIn.setIcon(new ImageIcon(Login.class.getResource("/view/img/login.png")));
		btnLogIn.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnLogIn.setForeground(new Color(0, 255, 255));
		btnLogIn.setBackground(new Color(221, 160, 221));
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pnlCenter.add(btnLogIn);
		
		JPanel pnlBottom = new JPanel();
		frame.getContentPane().add(pnlBottom, BorderLayout.SOUTH);
		
		JLabel lblForgotPass = new JLabel("Quên mật khẩu - Liên hệ đội kỹ thuật 0944713015");
		lblForgotPass.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		pnlBottom.add(lblForgotPass);
		
		JPanel pnlLeft = new JPanel();
		frame.getContentPane().add(pnlLeft, BorderLayout.WEST);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		pnlLeft.add(rigidArea_1);
		
		JPanel pnlRight = new JPanel();
		frame.getContentPane().add(pnlRight, BorderLayout.EAST);
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		pnlRight.add(rigidArea);
		controller = new LoginController(this);
		btnLogIn.addActionListener(controller);
	}
	public void access() {
		frame.setVisible(false);
	}
	public void denied() {
		JOptionPane.showMessageDialog(frame, "Mat Khau Sai");
	}
	public JFrame getFrame() {
		return this.frame;
	}
}
