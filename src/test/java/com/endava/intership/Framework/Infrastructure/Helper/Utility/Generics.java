package com.endava.intership.Framework.Infrastructure.Helper.Utility;

import com.endava.intership.Framework.Infrastructure.Driver.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class Generics {

    public static WebElement getElement(By locator){

        if (isElementPresent(locator))
            return Setup.driver.findElement(locator);
        throw new NoSuchElementException("Element Not Found : " + locator);
    }

    public static boolean  isElementPresent(By locator){
        return Setup.driver.findElements(locator).size() >= 1;
    }
}


