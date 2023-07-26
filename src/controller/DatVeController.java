package controller;
import view.PnlDatVe;
import view.FrmDatTour;
import model.QuanLyVeModel;
public class DatVeController {
	PnlDatVe view;
	FrmDatTour frm;
	QuanLyVeModel model = new QuanLyVeModel(null);
	public DatVeController(PnlDatVe view,FrmDatTour frm){
		// TODO Auto-generated constructor stub
		this.view  = view;
		this.frm = frm;
	}
}