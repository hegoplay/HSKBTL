package component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class KhachHangTable extends JTable{
	private static int maKH = 1;
	private static int ho = 2;
	private static int ten = 3;
	private static int diaChi = 4;
	private static int sdt= 5;
	private static int email = 6;
	private static int ngayDangKi = 7;
	
	private String[] title = new String[] {
			"maKH", "ho", "ten", "diaChi", "SDT" ,"Email", "NgayDangKi"
		};
	public KhachHangTable() {
		// TODO Auto-generated constructor stub
		this.setModel(new DefaultTableModel(title,0) {
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				if (columnIndex == sdt) return Integer.class;
				return String.class;
			}
			
			
		});
	}
	public void fillTable() {
		
	}
}
