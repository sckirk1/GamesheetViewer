package com.kirk.gamesheetviewer;

import com.kirk.gamesheetviewer.landingpage.LandingPage;
import javafx.stage.Stage;

import java.util.Optional;

public class GameSheetViewer {
    final Stage mainStage;

    public GameSheetViewer(Stage mainStage, LaunchParameters launchParameters) {
        this.mainStage = mainStage;

        //SAMDO: i18n?
        mainStage.setTitle("Game Sheet Viewer");

        switch (launchParameters.getLaunchType()) {
            case LANDING_PAGE -> setupLandingPageScene();
            case EMPTY_WORKSPACE -> setupWorkspaceScene(Optional.empty());
            case FILE -> setupWorkspaceScene(launchParameters.getPathToFile());
        }
    }

    private void setupWorkspaceScene(Optional<String> pathToFile) {
    }

    private void setupLandingPageScene() {
        final LandingPage landingPage = new LandingPage();

        //        stage.setTitle("Gamesheet Viewer");
//        stage.setScene(scene);
//        stage.show();
    }
}