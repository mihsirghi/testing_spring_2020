package com.endava.intership.Framework.Infrastructure.Browser;

import com.endava.intership.Framework.Infrastructure.Helper.Utility.Resource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
    public static WebDriver getFirefoxDriver(){
        System.setProperty( "webdriver.gecko.driver", Resource.getResourcePath( "driver\\geckodriver.exe" )  );
        return new FirefoxDriver();
    }

}
