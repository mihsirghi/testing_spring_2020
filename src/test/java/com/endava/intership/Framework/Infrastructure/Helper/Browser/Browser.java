package com.endava.intership.Framework.Infrastructure.Helper.Browser;

import com.endava.intership.Framework.Infrastructure.Driver.Setup;
import org.openqa.selenium.WebDriver;
import java.util.LinkedList;
import java.util.Set;

//Useful functions to manipulate the driver
//commented all the log related calls, logging not yet developed
public class Browser {

    //public static final Logger log = LoggerHelper.getLogger(BrowserHelper.class);
    Setup setup=new Setup();

    public void browserMaximize() {
        WebDriver driver = setup.driver;
        driver.manage().window().maximize();
        //log.info("");
    }

    public void goBack() {
        WebDriver driver = setup.driver;
        driver.navigate().back();
        // log.info("");
    }

    public void goForward() {
        WebDriver driver = setup.driver;
        driver.navigate().forward();
        //log.info("");
    }

    public void refresh() {
        WebDriver driver = setup.driver;
        driver.navigate().refresh();
        //log.info("");
    }

    public Set<String> getWindowHandlens() {
        // log.debug("");
        return setup.driver.getWindowHandles();
    }

    public void SwitchToWindow(int index) {

        LinkedList<String> windowsId = new LinkedList<String>(getWindowHandlens());

        if( index < 0 || index > windowsId.size())
            throw new IllegalArgumentException("Invalid Index : " + index);

        setup.driver.switchTo().window(windowsId.get(index));
        //log.info("Index : " + index);
    }

    public void switchToParentWindow() {
        LinkedList<String> windowsId = new LinkedList<String>(getWindowHandlens());
        setup.driver.switchTo().window(windowsId.get(0));
        //log.info("");
    }

    public void switchToParentWithChildClose() {
        switchToParentWindow();

        LinkedList<String> windowsId = new LinkedList<String>(getWindowHandlens());
        WebDriver driver = setup.driver;

        for(int i = 1; i < windowsId.size(); i++){
            driver.switchTo().window(windowsId.get(i));
            driver.close();
        }
        switchToParentWindow();
    }
}
