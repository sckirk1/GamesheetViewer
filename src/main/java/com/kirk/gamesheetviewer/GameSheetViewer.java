package com.kirk.gamesheetviewer;

import com.kirk.gamesheetviewer.landingpage.LandingPage;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Optional;

public class GameSheetViewer {
  final Stage mainStage;

  public GameSheetViewer(Stage mainStage, LaunchParameters launchParameters) {
    this.mainStage = mainStage;


    switch (launchParameters.getLaunchType()) {
      case LANDING_PAGE -> setupLandingPageScene();
      case EMPTY_WORKSPACE, FILE -> setupWorkspaceScene(launchParameters.getPathToFile());
    }

    mainStage.setTitle(GameSheetViewerI18n.getAppName());
    mainStage.show();
  }

  private void setupWorkspaceScene(Optional<String> pathToFile) {
  }

  private void setupLandingPageScene() {
    final LandingPage landingPage = new LandingPage();

    final Scene temp = new Scene(landingPage);
    mainStage.setScene(temp);

  }
}