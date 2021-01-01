package src.test.arpit.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import src.com.arpit.Framework.base.BasePage;

public class LoginPage extends BasePage {

    public LoginPage() {
    }

    @FindBy(how = How.NAME, using = "UserName")
    public WebElement userName;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement password;

    @FindBy(how = How.CSS, using = "[class*='btn-default']")
    public WebElement loginButton;


    public EmployeeListPage loginWithUserCreds(String uName, String pass) {
        userName.sendKeys(uName);
        password.sendKeys(pass);
        loginButton.submit();
//        return new LoginPage();
        return GetInstance(EmployeeListPage.class);
    }
}
