package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.RowFilter;

import model.DsTinhThanh;
import view.FrmDatTour;

public class DatTourController implements ActionListener {
	FrmDatTour frm;
	DsTinhThanh dsTT;
	public DatTourController(FrmDatTour frm) {
		// TODO Auto-generated constructor stub
		this.frm = frm;
		dsTT = new DsTinhThanh();
	}
	public void fillCb() {
		String ds[] = dsTT.getDsTinhThanh();
		frm.cbTinhThanh.removeAllItems();
		frm.cbTinhThanh.addItem("");
		for (String s : ds) {
			frm.cbTinhThanh.addItem(s);
		}
	}
	public void fillTable() {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if (src.equals("Lọc")) {
			frm.sorter.setRowFilter(new RowFilter<Object, Object>() {

				@Override
				public boolean include(Entry entry) {
					// TODO Auto-generated method stub
					String Fname  = entry.getValue(0).toString();
					String search0 = frm.txtHo.getText();
					String Lname  = entry.getValue(1).toString();
					String search1 = frm.txtTen.getText();
					String SDT  = entry.getValue(2).toString();
					String search2 = frm.txtSDT.getText();
					String email  = entry.getValue(3).toString();
					String search3 = frm.txtEmail.getText();
					String tinhThanh = entry.getValue(4).toString();
					String search4 = (String) frm.cbTinhThanh.getSelectedItem();
					return Fname.startsWith(search0) && Lname.startsWith(search1)&&SDT.startsWith(search2) && email.startsWith(search3)&&tinhThanh.startsWith(search4);
//					if (entry.getStringValue(i).startsWith("a")) {
//				         // The value starts with "a", include it
//				         return true;
//				       }
				}
				
			});
		}
	}
	
}
