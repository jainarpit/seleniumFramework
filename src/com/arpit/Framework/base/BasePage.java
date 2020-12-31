package src.com.arpit.Framework.base;

import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(DriverContext.Driver, this);
    }

}
