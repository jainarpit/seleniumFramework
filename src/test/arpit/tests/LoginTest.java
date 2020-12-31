import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import src.com.arpit.Framework.base.BrowserType;
import src.com.arpit.Framework.base.DriverContext;
import src.com.arpit.Framework.base.FrameworkInitialize;
import src.test.arpit.Pages.EmployeeListPage;
import src.test.arpit.Pages.HomePage;
import src.test.arpit.Pages.LoginPage;

public class LoginTest extends FrameworkInitialize {

    @BeforeTest
    public void setup() {
        initializeBrowser(BrowserType.FIREFOX);
        DriverContext.Browser.GoToURL("http://eaapp.somee.com/");
    }

    @Test
    public void Login() {
        HomePage homePage = new HomePage();
        homePage.clickOnLoginButton();
        LoginPage loginPage = new LoginPage();
        loginPage.loginWithUserCreds("admin", "password");
        EmployeeListPage elp = new EmployeeListPage();
        elp.clickOnCreateNewButton();
    }

    @AfterTest
    public void tearDown() {
        if (DriverContext.Driver != null)
            DriverContext.Driver.quit();
    }
}
