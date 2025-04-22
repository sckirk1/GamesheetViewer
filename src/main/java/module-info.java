module com.kirk.gamesheetviewer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kirk.gamesheetviewer to javafx.fxml;
    exports com.kirk.gamesheetviewer;
}