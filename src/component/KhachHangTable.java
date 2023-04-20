package component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class KhachHangTable extends JTable{
	private static int maKH = 1;
	private static int ho = 2;
	private static int ten = 3;
	private static int diaChi = 4;
	private static int email = 5;
	private static int ngayDangKi = 6;
	
	private String[] title = new String[] {
			"maKH", "ho", "ten", "diaChi", "Email", "NgayDangKi"
		};
	public KhachHangTable() {
		// TODO Auto-generated constructor stub
		this.setModel(new DefaultTableModel(title,0) {
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return String.class;
			}
			
			
		});
	}
	public void fillTable() {
		
	}
}
