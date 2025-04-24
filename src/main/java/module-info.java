module com.kirk.gamesheetviewer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kirk.gamesheetviewer to javafx.fxml;
    exports com.kirk.gamesheetviewer;
    exports com.kirk.gamesheetviewer.landingpage;
    opens com.kirk.gamesheetviewer.landingpage to javafx.fxml;
}