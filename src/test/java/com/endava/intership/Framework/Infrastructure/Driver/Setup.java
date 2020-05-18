package com.endava.intership.Framework.Infrastructure.Driver;

import com.endava.intership.Framework.Infrastructure.Browser.ChromeBrowser;
import com.endava.intership.Framework.Infrastructure.Browser.FirefoxBrowser;
import com.endava.intership.Framework.Infrastructure.Helper.Browser.BrowserType;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Setup {
    public WebDriver driver;
    ChromeBrowser chromeBrowser=new ChromeBrowser();
    FirefoxBrowser firefoxBrowser= new FirefoxBrowser();

    @Before
    public void setWebDriver() throws Exception {

        String browser = System.getProperty("browser");

        //setting the default browser,
        if (browser == null) {
            browser = String.valueOf( BrowserType.chrome );
        }

        switch (browser) {
            case "chrome":
                driver = chromeBrowser.getChromeDriver();
                break;

            case "firefox":
                driver = firefoxBrowser.getFirefoxDriver();
                break;

            default:
                throw new IllegalArgumentException("Browser \"" + browser + "\" isn't supported.");
        }
    }
}
