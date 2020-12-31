package src.test.arpit.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import src.com.arpit.Framework.base.BasePage;

public class EmployeeListPage extends BasePage {

    public EmployeeListPage() {
    }

    @FindBy(how = How.CSS, using = "[class*='btn-primary']")
    public WebElement createNewButton;

    public void clickOnCreateNewButton() {
        createNewButton.click();
    }
}
