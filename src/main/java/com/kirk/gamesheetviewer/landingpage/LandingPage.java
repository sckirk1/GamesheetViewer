package com.kirk.gamesheetviewer.landingpage;

import com.kirk.gamesheetviewer.utilities.FXMLUtilities;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.util.Objects;

public class LandingPage extends StackPane {

    public LandingPage() {
        FXMLUtilities.load(this, getClass().getResource("/landingpage/LandingPage.fxml"));

    }



}