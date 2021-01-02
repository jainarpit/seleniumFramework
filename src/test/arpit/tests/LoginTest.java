package arpit.tests;

import Utilities.ExcelUtil;
import Utilities.LogUtils;
import arpit.Pages.EmployeeListPage;
import arpit.Pages.HomePage;
import arpit.Pages.LoginPage;
import base.BrowserType;
import base.DriverContext;
import base.FrameworkInitialize;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends FrameworkInitialize {

    @BeforeTest
    public void setup() {
        LogUtils log = new LogUtils();
        log.createLogFile();
        log.writeLog("Framework Initialized");
        initializeBrowser(BrowserType.CHROME);
        DriverContext.Browser.GoToURL("http://eaapp.somee.com/");
        try {
            ExcelUtil util = new ExcelUtil("/Users/arpit/Documents/SelfLearning/SeleniumFrameworkSetup/seleniumFramework/data.xls");
        } catch (Exception e) {

        }
    }

    @Test
    public void Login() {
        CurrentPage = GetInstance(HomePage.class);
        CurrentPage = CurrentPage.As(HomePage.class).clickOnLoginButton();
        CurrentPage = (CurrentPage.As(LoginPage.class)).loginWithUserCreds("admin", "password");
        (CurrentPage.As(EmployeeListPage.class)).clickOnCreateNewButton();
    }

    @AfterTest
    public void tearDown() {
        if (DriverContext.Driver != null)
            DriverContext.Driver.quit();
    }
}
