package com.endava.intership.Framework.Infrastructure.Helper.Navigation;

import com.endava.intership.Framework.Infrastructure.Helper.Utility.Generics;
import org.openqa.selenium.By;

public class TextInput {

    public static void sendKeys(By locator, String value) {

        Generics.getElement(locator).sendKeys(value);
    }

    public static void clear(By locator) {

        Generics.getElement(locator).clear();
    }

    public static String getText(By locator) {

        return Generics.getElement(locator).getText();
    }
}
