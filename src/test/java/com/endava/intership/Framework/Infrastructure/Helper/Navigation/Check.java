package com.endava.intership.Framework.Infrastructure.Helper.Navigation;

import com.endava.intership.Framework.Infrastructure.Helper.Utility.Generics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Check {

// Callers/converters,
    public static void check(By locator) {

        selectCheckBox( Generics.getElement(locator));
    }

    public static void unCheck(By locator) {

        unSelectCheckBox(Generics.getElement(locator));
    }

    public static boolean isSelected (By locator) {
        return isSelected(Generics.getElement(locator));
    }

//Functions that do stuff
    private static boolean isSelected (WebElement element) {

        return element.isSelected();
    }

    private static void selectCheckBox(WebElement element) {

        if(!isSelected(element))
            element.click();
    }

    private static void unSelectCheckBox(WebElement element) {

        if( isSelected(element))
            element.click();
    }
}
