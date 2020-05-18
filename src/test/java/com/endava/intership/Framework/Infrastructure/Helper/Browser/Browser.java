package com.endava.intership.Framework.Infrastructure.Helper.Browser;

import com.endava.intership.Framework.Infrastructure.Driver.Setup;
import org.openqa.selenium.WebDriver;
import java.util.LinkedList;
import java.util.Set;

//Useful functions to manipulate the driver
//commented all the log related calls, logging not yet developed
public class Browser {

    //public static final Logger log = LoggerHelper.getLogger(BrowserHelper.class);

    public static void browserMaximize() {
        WebDriver driver = Setup.driver;
        driver.manage().window().maximize();
        //log.info("");
    }

    public static void goBack() {
        WebDriver driver = Setup.driver;
        driver.navigate().back();
        // log.info("");
    }

    public static void goForward() {
        WebDriver driver = Setup.driver;
        driver.navigate().forward();
        //log.info("");
    }

    public static void refresh() {
        WebDriver driver = Setup.driver;
        driver.navigate().refresh();
        //log.info("");
    }

    public static Set<String> getWindowHandlens() {
        // log.debug("");
        return Setup.driver.getWindowHandles();
    }

    public static void SwitchToWindow(int index) {

        LinkedList<String> windowsId = new LinkedList<String>(getWindowHandlens());

        if( index < 0 || index > windowsId.size())
            throw new IllegalArgumentException("Invalid Index : " + index);

        Setup.driver.switchTo().window(windowsId.get(index));
        //log.info("Index : " + index);
    }

    public static void switchToParentWindow() {
        LinkedList<String> windowsId = new LinkedList<String>(getWindowHandlens());
        Setup.driver.switchTo().window(windowsId.get(0));
        //log.info("");
    }

    public static void switchToParentWithChildClose() {
        switchToParentWindow();

        LinkedList<String> windowsId = new LinkedList<String>(getWindowHandlens());
        WebDriver driver = Setup.driver;

        for(int i = 1; i < windowsId.size(); i++){
            driver.switchTo().window(windowsId.get(i));
            driver.close();
        }
        switchToParentWindow();
    }
}
