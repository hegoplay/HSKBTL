package controller;

import model.QuanLyVeModel;
import view.FrmDatTour;
import view.PnlDatVe;

public class DatVeController {
	PnlDatVe view;
	FrmDatTour frm;
	QuanLyVeModel model = new QuanLyVeModel(null);
	public DatVeController(PnlDatVe view,FrmDatTour frm) {
		// TODO Auto-generated constructor stub
		this.view  = view;
		this.frm = frm;
	}
}
