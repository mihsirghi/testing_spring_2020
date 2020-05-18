package com.endava.intership.Framework.Infrastructure.Helper.Browser;

import com.endava.intership.Framework.Infrastructure.Driver.Setup;
import org.openqa.selenium.WebDriver;

//Useful functions to manipulate the driver

public class Browser {

    public static void browserMaximize() {
        WebDriver driver = Setup.driver;
        driver.manage().window().maximize();
    }

    public static void goBack() {
        WebDriver driver = Setup.driver;
        driver.navigate().back();
    }

    public static void goForward() {
        WebDriver driver = Setup.driver;
        driver.navigate().forward();
    }

    public static void refresh() {
        WebDriver driver = Setup.driver;
        driver.navigate().refresh();
    }
}
