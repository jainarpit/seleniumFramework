package config;

import base.BrowserType;

import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static void PopulateSettings() throws IOException {
        ConfigReader configReader = new ConfigReader();
        configReader.readProperty();
    }

    private void readProperty() throws IOException {
        Properties properties = new Properties();
        properties.load(getClass().getResourceAsStream("GlobalConfig.properties"));
        Settings.appURL = properties.getProperty("ApplicationURL");
        Settings.logPath = properties.getProperty("LogPath");
        Settings.browserType = BrowserType.valueOf(properties.getProperty("Browser"));
    }
}
