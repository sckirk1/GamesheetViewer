package com.kirk.gamesheetviewer;

import javafx.application.Application;

import java.util.Optional;

public class LaunchParameters {
    private final LaunchType launchType;
    private String pathToFile;

    public LaunchParameters(Application.Parameters parameters) {
        launchType = getLaunchTypeFromParameters(parameters);
    }

    private LaunchType getLaunchTypeFromParameters(Application.Parameters parameters) {

        // If parameters contain a path to a .ttrpg file open as FILE
        // Otherwise check preferences and see if they prefer opening to an empty workspace

        return LaunchType.LANDING_PAGE;
    }

    public LaunchType getLaunchType() {
        return launchType;
    }

    public Optional<String> getPathToFile() {
        return Optional.ofNullable(pathToFile);
    }
}
