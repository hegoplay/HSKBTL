package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutUs extends JFrame implements ActionListener {
    //        COLOR PALETTE
    private final Color defaultColor = new Color(4, 7, 74);
    private final Color offWhite = new Color(0xfffff7);
    private JPanel panel;
    private JButton btnKH;
    private JButton btnNV;
    private JTable table;
    private JPanel pTable;
    private JPanel pDesc;
    private JPanel pButtons;
    private JLabel lbDesc;
    private JLabel lbTitle;
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
        add(panel = new JPanel());
        panel.setLayout(new BorderLayout());

        createTable();
        createButtons();
        createDesc();
        UIDesign();
        showEvent();

        pack();
        setVisible(true);
    }

    private void createTable() {

        panel.add(pTable = new JPanel(), BorderLayout.NORTH);
        pTable.setLayout(new BorderLayout());
        pTable.add(lbTitle = new JLabel("About Us"), BorderLayout.NORTH);
        pTable.add(lbDesc = new JLabel("Giới Thiệu Chức Năng", SwingConstants.CENTER), BorderLayout.SOUTH);

        String[] colNames = {"TÊN", "CHỨC VỤ"};
        tableModel = new DefaultTableModel(colNames, 0);
        table = new JTable(tableModel);
        pTable.add(scrp = new JScrollPane(table));
        tableModel.addRow(new String[]{"Phan Thế Mạnh", "Nhóm trưởng"});
        tableModel.addRow(new String[]{"Mai Quốc Trưởng", "Thành viên"});
        tableModel.addRow(new String[]{"Trần Chí Bảo", "Thành viên"});
        tableModel.addRow(new String[]{"Nguyễn Cao Anh Minh", "Thành viên"});
        tableModel.addRow(new String[]{"Lê Mỹ Duyên", "Thành viên"});
        table.setEnabled(false);
    }

    private void createButtons() {
        panel.add(pButtons = new JPanel(), BorderLayout.WEST);
        pButtons.setLayout(new GridLayout(6, 1, 10, 10));
        pButtons.add(btnNV = new JButton("Nhân Viên"));
        pButtons.add(btnKH = new JButton("Khách Hàng"));
//        pButtons.add(btnTour =  new JButton("Tour"));
        pButtons.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }

    private void createDesc() {
        panel.add(pDesc = new JPanel(), BorderLayout.CENTER);
        pDesc.setLayout(new BorderLayout());
        pDesc.add(tpDesc = new JTextPane());
    }

    private void UIDesign() {
        FrmAboutUs ui = new FrmAboutUs();

//        set background color
        panel.setBackground(offWhite);
        pTable.setBackground(panel.getBackground());
        scrp.setBackground(panel.getBackground());

//        table
        ui.tableUI(table,pTable,scrp);

//        buttons
        ui.buttonUI(btnKH);
        ui.buttonUI(btnNV);
        
//        text area
        tpDesc.setEditable(false);
        tpDesc.setMargin(new Insets(30, 30, 30, 30));
        tpDesc.setFont(new Font("iCiel Effra", Font.PLAIN, 14));
        tpDesc.setBackground(Color.lightGray);
        tpDesc.setOpaque(true);

//        labels
        lbTitle.setFont(new Font("iCiel Effra", Font.BOLD, 26));
        lbTitle.setForeground(defaultColor);
        lbTitle.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 0));
        lbDesc.setFont(new Font("iCiel Effra", Font.BOLD, 18));
        lbDesc.setForeground(defaultColor);
        lbDesc.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        lbDesc.setBackground(pDesc.getBackground());
        lbDesc.setOpaque(true);

    }

    private void showEvent() {
        btnKH.addActionListener(this);
        btnNV.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object cmd = e.getSource();
        if (cmd.equals(btnKH))
            tpDesc.setText("Đặt tour\n"+
                    "\t+ Chức năng dùng để đặt tour cho khách hàng\n" +
                    "\t+ B1: chọn khách hàng muốn đặt tour\n" +
                    "\t+ B2: Chọn tour cho khách hàng\n");
        else if (cmd.equals(btnNV))
            tpDesc.setText("QUẢN LÝ NHÂN VIÊN\n" +
                    "\t+ Sửa: sửa thông tin nhân viên trong danh sách\n" +
                    "\t+ Thêm: thêm nhân viên mới vào danh sách\n" +
                    "\t+ Xóa: xóa nhân viên khỏi danh sách");
        else ì (cmd.equals(btn))
    }
}
