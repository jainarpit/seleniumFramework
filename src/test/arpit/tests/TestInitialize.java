package arpit.tests;

import Utilities.ExcelUtil;
import Utilities.LogUtils;
import base.DriverContext;
import base.FrameworkInitialize;
import config.ConfigReader;
import config.Settings;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.Set;

public class TestInitialize extends FrameworkInitialize {
    @BeforeTest
    public void setup() throws IOException {
        ConfigReader.PopulateSettings();
        Settings.logs = new LogUtils();
        Settings.logs.createLogFile();
        Settings.logs.writeLog("Framework Initialized");
        initializeBrowser(Settings.browserType);
        Settings.logs.writeLog("Browser is " + Settings.browserType);
        DriverContext.Browser.GoToURL(Settings.appURL);
        try {
            ExcelUtil util = new ExcelUtil("/Users/arpit/Documents/SelfLearning/SeleniumFrameworkSetup/seleniumFramework/data.xls");
        } catch (Exception e) {

        }
    }
}
