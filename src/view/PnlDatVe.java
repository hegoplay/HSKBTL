package view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JScrollPane;

import component.VeDiChuyenTable;
import controller.DatVeController;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PnlDatVe extends JPanel {
	private JTextField txtMaVe;
	private JTextField txtLoaiVe;
	private JTextField txtGiaVe;
	private DatVeController controller;
	/**
	 * Create the panel.
	 */
	public PnlDatVe(FrmDatTour frm) {
		setLayout(new BorderLayout(0, 0));
		
		controller = new DatVeController(this, frm);
		
		JPanel pnlNorth = new JPanel();
		add(pnlNorth, BorderLayout.NORTH);
		pnlNorth.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlField = new JPanel();
		pnlNorth.add(pnlField, BorderLayout.CENTER);
		pnlField.setLayout(new GridLayout(1, 3, 10, 10));
		

		
		JPanel pnlMaVe = new JPanel();
		pnlField.add(pnlMaVe);
		
		JLabel lblMaVe = new JLabel("Mã Vé");
		pnlMaVe.add(lblMaVe);
		
		txtMaVe = new JTextField();
		txtMaVe.setEnabled(false);
		pnlMaVe.add(txtMaVe);
		txtMaVe.setColumns(15);
		
		JPanel pnlLoaiVe = new JPanel();
		pnlField.add(pnlLoaiVe);
		
		JLabel lblLoaiVe = new JLabel("Loại Vé");
		pnlLoaiVe.add(lblLoaiVe);
		
		txtLoaiVe = new JTextField();
		txtLoaiVe.setEnabled(false);
		lblLoaiVe.setLabelFor(txtLoaiVe);
		txtLoaiVe.setColumns(15);
		pnlLoaiVe.add(txtLoaiVe);
		
		JPanel pnlGiaVe = new JPanel();
		pnlField.add(pnlGiaVe);
		
		JLabel lblGiVe = new JLabel("Giá Ve");
		pnlGiaVe.add(lblGiVe);
		
		txtGiaVe = new JTextField();
		txtGiaVe.setEnabled(false);
		lblGiVe.setLabelFor(txtGiaVe);
		txtGiaVe.setColumns(15);
		pnlGiaVe.add(txtGiaVe);
		
		JPanel pnlChucNang = new JPanel();
		pnlNorth.add(pnlChucNang, BorderLayout.SOUTH);
		
		JButton btnChonVe = new JButton("Chọn Vé");
		pnlChucNang.add(btnChonVe);
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		VeDiChuyenTable table = new VeDiChuyenTable();
		scrollPane.setViewportView(table);
	}

}
