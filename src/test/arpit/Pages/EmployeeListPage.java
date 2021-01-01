package arpit.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import base.BasePage;

public class EmployeeListPage extends BasePage {

    public EmployeeListPage() {
    }

    @FindBy(how = How.CSS, using = "[class*='btn-primary']")
    public WebElement createNewButton;

    public void clickOnCreateNewButton() {
        createNewButton.click();
    }
}
