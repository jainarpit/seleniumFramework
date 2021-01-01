import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import src.com.arpit.Framework.base.DriverContext;
import src.com.arpit.Framework.base.FrameworkInitialize;
import src.test.arpit.Pages.EmployeeListPage;
import src.test.arpit.Pages.HomePage;
import src.test.arpit.Pages.LoginPage;

public class LoginTest extends FrameworkInitialize {


    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        DriverContext.Driver = new ChromeDriver();
        DriverContext.Driver.get("http://eaapp.somee.com/");
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
