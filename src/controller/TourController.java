package controller;
import entity.Tour;
import java.util.Date;
import model.TourModel;
import java.time.ZoneId;
import entity.TinhThanh;
import java.time.Instant;
import model.DsTinhThanh;
import java.util.Calendar;
import java.util.TimeZone;
import view.FrmQuanLyTour;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.table.DefaultTableModel;
public class TourController implements ActionListener,ControllerTour,MouseListener {
	DsTinhThanh dsTT= new DsTinhThanh();
	FrmQuanLyTour view;
	TourModel model = new TourModel();
	public TourController(FrmQuanLyTour view){
		// TODO Auto-generated constructor stub
		this.view= view;
	}
	@Override
	public void actionPerformed(ActionEvent e){
		// TODO Auto-generated method stub
		String src =  e.getActionCommand();
		if(src.equals("Thêm")){
			if(checkVaild()){
				themTour(getTourFromField());
			}
		}
		if(src.equals("Xóa")){
			int row = view.table.getSelectedRow();
			System.out.println(row);
			if(row !=-1){
				String maTour = (String)((DefaultTableModel)view.table.getModel()).getValueAt(row, 0);
				model.xoaTour(new Tour(maTour));
			}
		}
		if(src.equals("Sửa")){
			int row = view.table.getSelectedRow();
			if (row !=-1){}
		}
	}
	public void fillCbTT(JComboBox<String> cb){
		cb.removeAllItems();
		for(String s : dsTT.getDsTinhThanh()){
			cb.addItem(s);
		}
	}
	@Override
	public ArrayList<Tour> getDs(){
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void fillDs(){
		// TODO Auto-generated method stub
		((DefaultTableModel)view.table.getModel()).setRowCount(0);
		for(Tour x : model.getDs()){
			((DefaultTableModel)view.table.getModel()).addRow(x.getObject());
		}
	}
	@Override
	public boolean xoaTour(Tour tour){
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean suaTour(Tour tour){
		// TODO Auto-generated method stub
		return false;
	}
	public String generateID(){
		String ans = "";
		ans+=dsTT.getTTTheoMa(dsTT.getMaTinhThanh((String)view.cbTPDiemDi.getSelectedItem())).get2TenTinhThanh();
		ans+=dsTT.getTTTheoMa(dsTT.getMaTinhThanh((String)view.cbTPDiemDen.getSelectedItem())).get2TenTinhThanh();
		//Tao 2 LocalDateTime tu Filed roi tim cach tinh do bien thien giua 2 cai localdatetime r chuyen ve gio lam tron xuong => thay doi sql id tu varchar(6) sang varchar(7) de keo dai thoi gian di chuyen
		Calendar ngayDi = getDate(view.dcNgayBatDau, view.spinGioDi, view.spinPhutDi);
		Calendar ngayVe = getDate(view.dcNgayKetThuc, view.spinGioVe, view.spinPhutVe);
		System.out.println(view.spinGioDi.getValue());
		if(ngayVe.getTime().before(ngayDi.getTime())){
			return null;
		}
		ans+= ngayDi.get(Calendar.DAY_OF_MONTH) + "";
		ans+= (ngayDi.get(Calendar.MONTH)+1 <10 ? "0" : "") + (ngayDi.get(Calendar.MONTH)+1);
		ans+= ngayVe.get(Calendar.DAY_OF_MONTH) + "";
		ans+= (ngayVe.get(Calendar.MONTH)+1 <10 ? "0" : "") + (ngayVe.get(Calendar.MONTH)+1);
		System.out.println(ans);
		return ans;
	}
	@Override
	public boolean themTour(Tour tour){
		// TODO Auto-generated method stub
		model.themTour(tour);
		((DefaultTableModel)view.table.getModel()).setRowCount(0);
		for(Tour x : model.getDs()){
			((DefaultTableModel)view.table.getModel()).addRow(x.getObject());
		}
		
		
		return true;
	}
	private Calendar getDate(JDateChooser cal,JSpinner spinGio,JSpinner spinPhut){
		Calendar cald = Calendar.getInstance();
		cald.setTime(cal.getDate());
		cald.set(Calendar.HOUR,(Integer) spinGio.getValue());
		cald.set(Calendar.MINUTE, (Integer)spinPhut.getValue());
		cald.set(Calendar.SECOND, 0);
		return cald;
	}
	public Tour getTourFromField(){
		String maTour = generateID();
		String tenTour = view.txtTenTour.getText();
		Calendar calBatDau = getDate(view.dcNgayBatDau,view.spinGioDi,view.spinPhutDi);
		ZoneId zid = calBatDau.getTimeZone().toZoneId();
		LocalDateTime tgBatDau = LocalDateTime.ofInstant(calBatDau.toInstant(), zid);
		Calendar calKetThuc = getDate(view.dcNgayKetThuc,view.spinGioVe,view.spinPhutVe);
		zid = calKetThuc.getTimeZone().toZoneId();
		LocalDateTime tgKetThuc = LocalDateTime.ofInstant(calKetThuc.toInstant(), zid);
		TinhThanh tpDiemDi = dsTT.getTTTheoMa(dsTT.getMaTinhThanh((String)view.cbTPDiemDi.getSelectedItem()));
		TinhThanh tpKetThuc = dsTT.getTTTheoMa(dsTT.getMaTinhThanh((String)view.cbTPDiemDen.getSelectedItem()));
		return new Tour(maTour, tenTour, tgBatDau, tgKetThuc, tpDiemDi, tpKetThuc) ;
	}
	private boolean checkVaild(){
		if(view.txtTenTour.getText().trim().equals("")){
			JOptionPane.showMessageDialog(view, "ten tour ko duoc de trong");
			return false;
		}
		Date batDau = getDate(view.dcNgayBatDau,view.spinGioDi,view.spinPhutDi).getTime();
		Date ketThuc = getDate(view.dcNgayKetThuc,view.spinGioVe,view.spinPhutVe).getTime();
		if(ketThuc.before(batDau)){
			JOptionPane.showMessageDialog(view, "ngay di phai truoc ngay ve");
			return false;
		}
		return true;
	}
	@Override
	public void mouseClicked(MouseEvent e){
		// TODO Auto-generated method stub
		int row = view.table.getSelectedRow();
		view.txtTenTour.setText((String)((DefaultTableModel)view.table.getModel()).getValueAt(row, 1));
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}