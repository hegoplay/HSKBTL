package component;
import javax.swing.JTable;
import java.util.ArrayList;
import javax.swing.JComboBox;
import controller.ControllerQuanLyVe;
import javax.swing.table.DefaultTableModel;
public class VeDiChuyenTable extends JTable {
	private static final long serialVersionUID = -2143949099686518381L;
	private static int maVe = 1;
	private static int tenCongTy = 2;
	private static int loaiVe = 3;
	private static int TPDiemDi = 4;
	private static int TPDiemDen = 5;
	private static int giaVe = 6;
	private static int conHoatDong = 6;
	private String[] title = new String[]{
        "maVe", "tenCongTy", "loaiVe", "TPDiemDi", "TPDiemDen", "giaVe", "conHoatDong"
    };
	public VeDiChuyenTable(){
		// TODO Auto-generated constructor stub
		this.setModel(new DefaultTableModel(title,0){
			@Override
			public Class<?> getColumnClass(int columnIndex){
				// TODO Auto-generated method stub
				if(columnIndex == conHoatDong) return Boolean.class;
				return String.class;
			}
		});
	}
}