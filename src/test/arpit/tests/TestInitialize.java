package arpit.tests;

import Utilities.ExcelUtil;
import Utilities.LogUtils;
import base.DriverContext;
import base.FrameworkInitialize;
import config.ConfigReader;
import config.Settings;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class TestInitialize extends FrameworkInitialize {
    @BeforeTest
    public void setup() throws IOException {
        ConfigReader.PopulateSettings();
        LogUtils log = new LogUtils();
        log.createLogFile();
        log.writeLog("Framework Initialized");
        initializeBrowser(Settings.browserType);
        DriverContext.Browser.GoToURL(Settings.appURL);
        try {
            ExcelUtil util = new ExcelUtil("/Users/arpit/Documents/SelfLearning/SeleniumFrameworkSetup/seleniumFramework/data.xls");
        } catch (Exception e) {

        }
    }
}
