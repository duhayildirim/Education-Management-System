package com.educationWebsite.View;

import com.educationWebsite.Helper.*;
import com.educationWebsite.Model.Operator;

import javax.swing.*;

public class OperatorUI extends JFrame {
    private JPanel wrapper;
    private JTabbedPane tab_operator;
    private JLabel lbl_welcome;
    private JPanel pnl_top;
    private JButton btn_logout;
    private JPanel pnl_userlist;
    private final Operator operator;
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
