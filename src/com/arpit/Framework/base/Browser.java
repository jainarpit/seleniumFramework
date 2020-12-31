package src.com.arpit.Framework.base;

import org.openqa.selenium.WebDriver;

public class Browser {
    public BrowserType type;
    public WebDriver driver;

    public Browser(WebDriver driver) {
        this.driver = driver;
    }

    public void GoToURL(String url) {
        driver.get(url);
    }

    public void MaximizeWindow() {
        driver.manage().window().maximize();
    }

    public void fullScreen() {
        driver.manage().window().fullscreen();
    }
}

