package com.educationWebsite.View;

import com.educationWebsite.Helper.*;
import com.educationWebsite.Model.Operator;
import com.educationWebsite.Model.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class OperatorUI extends JFrame {
    private JPanel wrapper;
    private JTabbedPane tab_operator;
    private JLabel lbl_welcome;
    private JPanel pnl_top;
    private JButton btn_logout;
    private JPanel pnl_userlist;
    private JScrollPane scrl_userlist;
    private JTable tbl_userlist;
    private DefaultTableModel mdl_userlist;
    private final Operator operator;
    private Object[] row_userlist;

    public OperatorUI(Operator operator) {
        this.operator = operator;
        add(wrapper);
        setSize(1000, 700);
        int x = Helper.appScreenLocationPosition("x", getSize());
        int y = Helper.appScreenLocationPosition("y", getSize());
        setLocation(x, y);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.APP_TITLE);
        setVisible(true);
        lbl_welcome.setText("Welcome: " + operator.getName());

        // ModelUserList
        mdl_userlist = new DefaultTableModel();
        Object[] col_userlist = {"ID", "Name Surname", "Username", "Password", "Role"};
        mdl_userlist.setColumnIdentifiers(col_userlist);
        for (User obj : User.getList()) {
            Object[] row = new Object[col_userlist.length];
            row[0] = obj.getId();
            row[1] = obj.getName();
            row[2] = obj.getUsername();
            row[3] = obj.getPassword();
            row[4] = obj.getRole();
            mdl_userlist.addRow(row);
        }

        tbl_userlist.setModel(mdl_userlist);
        tbl_userlist.getTableHeader().setReorderingAllowed(false);
    }

    public static void main(String[] args) {
        Operator op = new Operator();
        op.setId(1);
        op.setName("Duha Yildirim");
        op.setUsername("duhayildirim");
        op.setPassword("12345678");
        op.setRole("operator");
        Helper.appTheme();
        OperatorUI opUI = new OperatorUI(op);
    }
}
