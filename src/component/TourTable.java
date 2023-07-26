package component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class TourTable extends JTable {
	private DefaultTableModel model = new DefaultTableModel(
        new Object[][]{},
        new String[]{
            "M\u00E3 Tour", "T\u00EAn Tour", "Th\u1EDDi Gian B\u1EAFt \u0110\u1EA7u", "Th\u1EDDi Gian K\u1EBFt Th\u00FAc", "TP \u0110i\u1EC3m \u0110i", "TP \u0110i\u1EC3m \u0110\u1EBFn"
        }
    ){
        Class[] columnTypes = new Class[]{
            String.class, String.class, String.class, String.class, String.class, String.class
        };
        public Class getColumnClass(int columnIndex){
            return columnTypes[columnIndex];
        }
    };
	public TourTable(){
		// TODO Auto-generated constructor stub
		this.setModel(model);
	}
}