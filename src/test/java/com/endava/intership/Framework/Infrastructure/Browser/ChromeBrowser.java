package com.endava.intership.Framework.Infrastructure.Browser;

import com.endava.intership.Framework.Infrastructure.Helper.Utility.Resource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser {
    Resource resource= new Resource();
   public WebDriver getChromeDriver(){

       ChromeOptions chromeOptions = new ChromeOptions();
       chromeOptions.addArguments("['start-maximized']");
       System.setProperty("webdriver.chrome.driver", resource.getResourcePath( "driver\\chromedriver.exe" ));
       return new ChromeDriver(chromeOptions);
   }
}
