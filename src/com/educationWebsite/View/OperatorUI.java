package com.educationWebsite.View;

import com.educationWebsite.Helper.*;
import javax.swing.*;

public class OperatorUI extends JFrame {
    private JPanel wrapper;
    public OperatorUI() {
        add(wrapper);
        setSize(1000, 700);
        int x = Helper.appScreenLocationPosition("x", getSize());
        int y = Helper.appScreenLocationPosition("y", getSize());
        setLocation(x, y);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.APP_TITLE);
        setVisible(true);
    }

    public static void main(String[] args) {
        OperatorUI opUI = new OperatorUI();
    }
}
