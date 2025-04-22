package com.kirk.gamesheetviewer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GamesheetViewerApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(GamesheetViewerApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(, 320, 240);
        stage.setTitle("Gamesheet Viewer");
//        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}