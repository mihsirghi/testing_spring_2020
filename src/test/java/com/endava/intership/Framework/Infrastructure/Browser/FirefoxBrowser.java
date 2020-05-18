package com.endava.intership.Framework.Infrastructure.Browser;

import com.endava.intership.Framework.Infrastructure.Helper.Utility.Resource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
    Resource resource= new Resource();
    public WebDriver getFirefoxDriver(){
        System.setProperty( "webdriver.gecko.driver", resource.getResourcePath( "driver\\geckodriver.exe" )  );
        return new FirefoxDriver();
    }
}
//FirefoxDriver(FirefoxOptions options)