package arpit.tests;

import arpit.Pages.EmployeeListPage;
import arpit.Pages.HomePage;
import arpit.Pages.LoginPage;
import base.DriverContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginTest extends TestInitialize {

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
