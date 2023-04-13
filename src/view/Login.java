package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import test.PlaceholderTextField;

import javax.swing.JPanel;
import java.awt.Font;
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
import java.awt.Toolkit;

public class Login {

	private JFrame frame;
	private PlaceholderTextField txtUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/view/img/background.jpg")));
		JPanel pnlTitle = new JPanel();
		pnlTitle.setBackground(new Color(175, 238, 238));
		frame.getContentPane().add(pnlTitle, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		pnlTitle.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel pnlCenter = new JPanel();
		frame.getContentPane().add(pnlCenter, BorderLayout.CENTER);
		pnlCenter.setLayout(new GridLayout(4, 1, 10, 10));
		
		JPanel panel = new JPanel();
		pnlCenter.add(panel);
		
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
		
		PlaceholderTextField txtPassword = new PlaceholderTextField();
		txtPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtPassword.setPlaceholder("Mat Khau");
		txtPassword.setColumns(10);
		password.add(txtPassword);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.setIcon(new ImageIcon(Login.class.getResource("/view/img/login.png")));
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnNewButton.setForeground(new Color(47, 79, 79));
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pnlCenter.add(btnNewButton);
		
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
	}

}
