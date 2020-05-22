package com.endava.intership.Framework.Infrastructure.Helper.Navigation;

import com.endava.intership.Framework.Infrastructure.Helper.Utility.Generics;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class dropDown {

    public static void selectElementByIndex(By locator,int index) {

        Select select = new Select(Generics.getElement(locator));
        select.selectByIndex(index);
    }
}
