package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutUs extends JFrame implements ActionListener {
    //        COLOR PALETTE
    private final Color defaultColor = new Color(4, 7, 74);
    private final Color tableContentColor = new Color(77, 79, 106);
    private final Color tableHeaderBgColor = new Color(247, 247, 247);
    private final Color offWhite = new Color(0xfffff7);
    private JPanel panel = new JPanel();
    private JButton btnKH;
    private JButton btnNV;
    private JTable table;
    private JPanel pTable = new JPanel();
    private JPanel pDesc = new JPanel();
    private JPanel pButtons = new JPanel();
    private JLabel lbDesc = new JLabel();
    private JLabel lbTitle = new JLabel();
    private JButton tourKháchSạnButton = new JButton(getName());
    private JButton tỉnhThànhButton;
    private JButton chấmChấmButton;
    private DefaultTableModel tableModel;
    private JTextPane tpDesc;
    private JScrollPane scrp;

    public AboutUs() {
        GUI();
    }

    public static void main(String[] args) {
        AboutUs main = new AboutUs();
    }

    private void GUI() {
        setSize(1000, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel);

        createTable();
        createDesc();
        UIDesign();
        showEvent();

        setVisible(true);
    }

    private void createTable() {
        String[] colNames = {"TÊN", "CHỨC VỤ"};
        tableModel = new DefaultTableModel(colNames, 0);
        table = new JTable(tableModel);
        pTable.add(scrp = new JScrollPane(table));
        String[] data = {"Lê Mỹ Duyên", "Thành viên"};
        tableModel.addRow(data);
        tableModel.addRow(new String[] {"Mạnh","Nhóm trưởng"});
        table.setEnabled(false);
    }

    private void createDesc() {
        tpDesc = new JTextPane();
        tpDesc.setText("");
        pDesc.add(tpDesc);
    }

    private void UIDesign() {
        panel.setBackground(offWhite);
        pTable.setBackground(panel.getBackground());
//        pDesc.setBackground(panel.getBackground());
//        pButtons.setBackground(panel.getBackground());
        scrp.setBackground(panel.getBackground());


//        TABLE
        table.setRowHeight(50);
        table.setShowVerticalLines(false);
        table.setFillsViewportHeight(true);
        table.setFont(new Font("iCiel Effra", Font.BOLD, 12));
        table.setBackground(panel.getBackground());
        table.setForeground(tableContentColor);
        table.setGridColor(Color.lightGray);
        table.setIntercellSpacing(new Dimension(15, 0));
//        table header
        table.getTableHeader().setPreferredSize(new Dimension(0, 30));
        table.getTableHeader().setBackground(tableHeaderBgColor);
        table.getTableHeader().setForeground(Color.gray);
        table.getTableHeader().setFont(new Font("iCiel Effra", Font.BOLD, 10));
        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.LEFT);
        UIManager.getDefaults().put("TableHeader.cellBorder", BorderFactory.createEmptyBorder(10, 10, 10, 10));
        scrp.setBorder(BorderFactory.createEmptyBorder(0, 30, 0, 30));

//        buttons
        buttonUI(btnKH);
        buttonUI(btnNV);
        buttonUI(chấmChấmButton);
        buttonUI(tourKháchSạnButton);
        buttonUI(tỉnhThànhButton);

//        text area
        tpDesc.setEditable(false);
        tpDesc.setMargin(new Insets(30, 30, 30, 30));
        tpDesc.setFont(new Font("iCiel Effra",Font.PLAIN,14));
        tpDesc.setBackground(tableHeaderBgColor);
        tpDesc.setOpaque(true);

//        labels
        lbTitle.setFont(new Font("iCiel Effra", Font.BOLD, 26));
        lbTitle.setForeground(defaultColor);
        lbTitle.setBorder(BorderFactory.createEmptyBorder(20,20,20,0));
        lbDesc.setFont(new Font("iCiel Effra", Font.BOLD, 18));
        lbDesc.setForeground(defaultColor);
        lbDesc.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));
        lbDesc.setBackground(pDesc.getBackground());
        lbDesc.setOpaque(true);

    }

    private void buttonUI(JButton btn) {
        Color btnColor = new Color(128, 0, 255);
        Color offWhite = new Color(255, 255, 247);

        btn.setBackground(btnColor);
        btn.setForeground(offWhite);
        btn.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(112, 2, 220), 2, true), new EmptyBorder(8, 13, 8, 13)));
    }

    private void showEvent() {
        btnKH.addActionListener(this);
        btnNV.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object cmd = e.getSource();
        if (cmd.equals(btnKH))
            tpDesc.setText("QUẢN LÝ KHÁCH HÀNG\n");
        else if (cmd.equals(btnNV))
            tpDesc.setText("QUẢN LÝ NHÂN VIÊN\n" +
                    "\t+ Sửa: sửa thông tin nhân viên trong danh sách\n" +
                    "\t+ Thêm: thêm nhân viên mới vào danh sách\n" +
                    "\t+ Xóa: xóa nhân viên khỏi danh sách");
    }
}
