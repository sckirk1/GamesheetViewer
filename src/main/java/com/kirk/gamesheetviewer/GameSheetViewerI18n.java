package com.kirk.gamesheetviewer;

import java.util.ResourceBundle;

public class GameSheetViewerI18n {
    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle("GameSheetViewer");

    public static String getAppName() {
        return BUNDLE.getString("APP_NAME");
    }

}
