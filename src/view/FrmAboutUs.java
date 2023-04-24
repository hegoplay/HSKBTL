package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class FrmAboutUs {
    //        COLOR PALETTE
    private final Color defaultColor = new Color(4, 7, 74);
    private final Color tableContentColor = new Color(77, 79, 106);
    private final Color tableHeaderBgColor = new Color(247, 247, 247);
    private final Color offWhite = new Color(0xfffff7);

    void buttonUI(JButton btn) {
        Color btnColor = new Color(128, 0, 255);

        btn.setBackground(btnColor);
        btn.setForeground(offWhite);
        btn.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(112, 2, 220), 2, true), new EmptyBorder(8, 13, 8, 13)));
    }

    void tableUI(JTable table, JPanel panel, JScrollPane scrp) {
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
    }
}
