package com.kirk.gamesheetviewer;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class GameSheetViewerApplication extends Application {
    private GameSheetViewer gameSheetViewer;

    @Override
    public void start(Stage stage) throws IOException {
        final LaunchParameters launchParameters = new LaunchParameters(getParameters());
        gameSheetViewer = new GameSheetViewer(stage, launchParameters);
//        FXMLLoader fxmlLoader = new FXMLLoader(GamesheetViewerApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(, 320, 240);

    }

    public static void main(String[] args) {
        launch();
    }
}