package com.educationWebsite.Helper;

import java.awt.*;

public class Helper {
    public static int appScreenLocationCenter(String point, Dimension size) {
        int flat;
        switch (point) {
            case "x":
                flat = (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
                break;
            case "y":
                flat = (Toolkit.getDefaultToolkit().getScreenSize().height - size.height) / 2;
                break;
            default:
                flat  = 0;
        }
        return flat;
    }
}
