package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import component.MainMenuBar;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.FlowLayout;

public class FrmTrangChu {

	public JFrame frmTourDuLch;
	private SimpleDateFormat sdf;
	private JLabel lblgio;
	private UpdateTimeThread updateTimeThread;
	private SimpleDateFormat sdd;

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
		frmTourDuLch.setLocationRelativeTo(null);
		
		frmTourDuLch.setJMenuBar(new MainMenuBar(frmTourDuLch));
		frmTourDuLch.getContentPane().setLayout(null);
		
		JLabel lblxinchao = new JLabel("Xin Chào");
		lblxinchao.setBounds(292, 117, 395, 89);
		frmTourDuLch.getContentPane().add(lblxinchao);
		lblxinchao.setFont(new Font("SERIF",Font.PLAIN,100));
		lblxinchao.setForeground(Color.white);
		
		lblgio = new JLabel("");
		lblgio.setBounds(376, 216, 231, 98);
		frmTourDuLch.getContentPane().add(lblgio);
		sdf = new SimpleDateFormat("HH:mm:ss");
		lblgio.setText(sdf.format(new Date()));
		lblgio.setFont(new Font("Tahoma",Font.PLAIN,50));
		lblgio.setForeground(Color.white);
		
		
		JLabel lblngay = new JLabel("ngay");
		lblngay.setBounds(348, 302, 280, 70);
		frmTourDuLch.getContentPane().add(lblngay);
		sdd = new SimpleDateFormat("dd/MM/yyyy");
		lblngay.setText(sdd.format(new Date()));
		lblngay.setFont(new Font("Tahoma",Font.PLAIN,50));
		lblngay.setForeground(Color.white);
		
		updateTimeThread = new UpdateTimeThread();
        updateTimeThread.start();
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 986, 34);
		panel.setBackground(new Color(221, 160, 221));
		frmTourDuLch.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Trang Chủ Tour Du lịch");
		lblNewLabel.setForeground(new Color(255, 250, 240));
		lblNewLabel.setBackground(new Color(123, 104, 238));
		lblNewLabel.setFont(new Font("Source Code Pro", Font.BOLD, 18));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 34, 986, 507);
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setIcon(new ImageIcon("src\\view\\img\\menuImg.jpg"));
		frmTourDuLch.getContentPane().add(lblNewLabel_1);
		
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	private class UpdateTimeThread extends Thread {
        public void run() {
            while(true) {
                try {
                    Thread.sleep(1000); // Nghỉ 1 giây
                    // Cập nhật giá trị cho textfield
                    lblgio.setText(sdf.format(new Date()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
