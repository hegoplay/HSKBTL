package component;

import java.time.LocalDate;

import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.RowFilter.Entry;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class KhachHangTable extends JTable{
	private static int maKH = 1;
	private static int ho = 2;
	private static int ten = 3;
	private static int diaChi = 4;
	private static int sdt= 5;
	private static int email = 6;
	private static int ngayDangKi = 7;
	
	private TableRowSorter<TableModel> sorter;
	
	private String[] title = new String[] {
			"maKH", "ho", "ten", "diaChi", "SDT" ,"Email", "NgayDangKi"
		};
	private DefaultTableModel model;
	public KhachHangTable() {
		model = new DefaultTableModel(title,0) {
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				if (columnIndex == ngayDangKi) return String.class;
				return super.getColumnClass(columnIndex);
			}};
		// TODO Auto-generated constructor stub
		this.setModel(model);
		sorter = new TableRowSorter<TableModel>(model);
	}
	public TableModel getTableModel() {
		return this.model;
	}
	public void filterTable(String ho, String ten, String email, String sdt) {
		sorter.setRowFilter(new RowFilter<Object, Object>() {

				@Override
				public boolean include(Entry entry) {
					// TODO Auto-generated method stub
					String Fname  = entry.getValue(1).toString();
					String Lname  = entry.getValue(2).toString();
					String SDT  = entry.getValue(3).toString();
					String email  = entry.getValue(5).toString();
					System.out.println(Fname.startsWith(ten) &&Lname.startsWith(ho)&&SDT.startsWith(sdt)&&email.startsWith(email) );
					return Fname.startsWith(ten) &&Lname.startsWith(ho)&&SDT.startsWith(sdt)&&email.startsWith(email) ;
					
//					if (entry.getStringValue(i).startsWith("a")) {
//				         // The value starts with "a", include it
//				         return true;
//				       }
				}
				
			});
	}
}
