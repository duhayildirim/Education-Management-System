package com.educationWebsite.View;

import javax.swing.*;
import java.awt.*;

public class OperatorUI extends JFrame {
    private JPanel wrapper;

    public OperatorUI() {
        add(wrapper);
        setSize(1000, 700);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width) / 2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2;
    }
}
