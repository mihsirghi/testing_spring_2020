package com.endava.intership.Framework.Infrastructure.Driver;

import com.endava.intership.Framework.Infrastructure.Browser.ChromeBrowser;
import com.endava.intership.Framework.Infrastructure.Browser.FirefoxBrowser;
import com.endava.intership.Framework.Infrastructure.Helper.Browser.BrowserType;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Setup {
    public static WebDriver driver;

    @Before
    public void setWebDriver() throws Exception {

        String browser = System.getProperty("browser");

        //setting the default browser,
        if (browser == null) {
            browser = String.valueOf( BrowserType.chrome );
        }

        switch (browser) {
            case "chrome":
                driver = ChromeBrowser.getChromeDriver();
                break;

            case "firefox":
                driver = FirefoxBrowser.getFirefoxDriver();
                break;

            default:
                throw new IllegalArgumentException("Browser \"" + browser + "\" isn't supported.");
        }
    }
}
