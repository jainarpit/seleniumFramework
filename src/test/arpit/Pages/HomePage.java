package src.test.arpit.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import src.com.arpit.Framework.base.BasePage;

public class HomePage extends BasePage {


    @FindBy(how = How.ID, using = "loginLink")
    public WebElement loginLink;

    public HomePage() {
    }


    public LoginPage clickOnLoginButton() {
        loginLink.click();
//        return new LoginPage();
        return GetInstance(LoginPage.class);
    }
}
