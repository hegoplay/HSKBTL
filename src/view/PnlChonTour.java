package view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import component.TourTable;
import controller.ChonTourController;
import controller.DatTourController;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JFrame;

public class PnlChonTour extends JPanel {
	public JTextField txtMaKH;
	public JTextField txtHo;
	public JTextField txtTen;
	public JTextField txtDiaChi;
	public JTextField txtSDT;
	public JTextField txtEmail;
	public JTextField txtMaTour;
	public JTextField txtTenTour;
	public ChonTourController controller;
	public TourTable table;
	public FrmDatTour frm;
	/**
	 * Create the panel.
	 */
	public PnlChonTour(FrmDatTour frm) {
		this.frm = frm;
		setLayout(new BorderLayout(0, 0));
		controller = new ChonTourController(this);
		JPanel pnlField = new JPanel();
		add(pnlField, BorderLayout.NORTH);
		pnlField.setLayout(new GridLayout(3, 3, 10, 10));
		
		JPanel pnlMaKH = new JPanel();
		pnlField.add(pnlMaKH);
		
		JLabel lblMaKH = new JLabel("Mã khách hàng");
		pnlMaKH.add(lblMaKH);
		
		txtMaKH = new JTextField();
		txtMaKH.setEnabled(false);
		lblMaKH.setLabelFor(txtMaKH);
		pnlMaKH.add(txtMaKH);
		txtMaKH.setColumns(15);
		
		JPanel pnlHo = new JPanel();
		pnlField.add(pnlHo);
		
		JLabel lblHKhchHng = new JLabel("Họ Khách hàng");
		pnlHo.add(lblHKhchHng);
		
		txtHo = new JTextField();
		txtHo.setEnabled(false);
		txtHo.setColumns(15);
		pnlHo.add(txtHo);
		
		JPanel pnlTen = new JPanel();
		pnlField.add(pnlTen);
		
		JLabel lblTen = new JLabel("Tên");
		lblTen.setHorizontalAlignment(SwingConstants.CENTER);
		pnlTen.add(lblTen);
		
		txtTen = new JTextField();
		txtTen.setEnabled(false);
		txtTen.setColumns(15);
		pnlTen.add(txtTen);
		
		JPanel pnlDiaChi = new JPanel();
		pnlField.add(pnlDiaChi);
		
		JLabel lblDiaChi = new JLabel("Địa chỉ");
		lblDiaChi.setHorizontalAlignment(SwingConstants.CENTER);
		pnlDiaChi.add(lblDiaChi);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setEnabled(false);
		txtDiaChi.setColumns(15);
		pnlDiaChi.add(txtDiaChi);
		
		JPanel pnlSDT = new JPanel();
		pnlField.add(pnlSDT);
		
		JLabel lblSdt = new JLabel("SDT");
		lblSdt.setHorizontalAlignment(SwingConstants.CENTER);
		pnlSDT.add(lblSdt);
		
		txtSDT = new JTextField();
		txtSDT.setEnabled(false);
		txtSDT.setColumns(15);
		pnlSDT.add(txtSDT);
		
		JPanel pnlEmail = new JPanel();
		pnlField.add(pnlEmail);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		pnlEmail.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setEnabled(false);
		txtEmail.setColumns(15);
		pnlEmail.add(txtEmail);
		
		
		
		JPanel pnlMaTour = new JPanel();
		pnlField.add(pnlMaTour);
		
		JLabel lblMaTour = new JLabel("Mã Tour");
		lblMaTour.setHorizontalAlignment(SwingConstants.CENTER);
		pnlMaTour.add(lblMaTour);
		
		txtMaTour = new JTextField();
		lblMaTour.setLabelFor(txtMaTour);
		pnlMaTour.add(txtMaTour);
		txtMaTour.setColumns(15);
		
		JPanel pnlTenTour = new JPanel();
		pnlField.add(pnlTenTour);
		
		JLabel lblTnTour = new JLabel("Tên Tour");
		lblTnTour.setHorizontalAlignment(SwingConstants.CENTER);
		pnlTenTour.add(lblTnTour);
		
		txtTenTour = new JTextField();
		lblTnTour.setLabelFor(txtTenTour);
		txtTenTour.setColumns(15);
		pnlTenTour.add(txtTenTour);
		
		JPanel pnlTable = new JPanel();
		add(pnlTable, BorderLayout.CENTER);
		pnlTable.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		pnlTable.add(scrollPane);
		
		table = new TourTable();
		
		scrollPane.setViewportView(table);
		
		lblDiaChi.setPreferredSize(lblMaKH.getPreferredSize());
		lblEmail.setPreferredSize(lblMaKH.getPreferredSize());
		lblHKhchHng.setPreferredSize(lblMaKH.getPreferredSize());
		lblSdt.setPreferredSize(lblMaKH.getPreferredSize());
		lblTen.setPreferredSize(lblMaKH.getPreferredSize());
		lblMaTour.setPreferredSize(lblMaKH.getPreferredSize());
		lblTnTour.setPreferredSize(lblMaKH.getPreferredSize());
		
		JPanel pnlChucNang = new JPanel();
		pnlField.add(pnlChucNang);
		
		JButton btnChonTour = new JButton("Chọn Tour");
		pnlChucNang.add(btnChonTour);
		

		table.addMouseListener(controller);
		btnChonTour.addActionListener(controller);
	}

}
