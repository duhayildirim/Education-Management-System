package com.educationWebsite.Helper;

import javax.swing.*;
import java.awt.*;

public class Helper {
    public static int appScreenLocationPosition(String point, Dimension size) {
        int flat;
        switch (point) {
            case "x":
                flat = (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
                break;
            case "y":
                flat = (Toolkit.getDefaultToolkit().getScreenSize().height - size.height) / 2;
                break;
            default:
                flat = 0;
        }
        return flat;
    }

    public static int appTheme() {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if("Nimbus".equals(info.getName())){
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                         UnsupportedLookAndFeelException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
