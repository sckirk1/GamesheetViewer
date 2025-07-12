package com.kirk.gamesheetviewer.utilities;

import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.net.URL;

public class FXMLUtilities {

    public static void load(Object root, URL fxmlUrl) {
        final FXMLLoader fxmlLoader = new FXMLLoader(fxmlUrl);
        fxmlLoader.setRoot(root);
        fxmlLoader.setController(root);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.err.println("I really need a logger");
        }
    }
}
