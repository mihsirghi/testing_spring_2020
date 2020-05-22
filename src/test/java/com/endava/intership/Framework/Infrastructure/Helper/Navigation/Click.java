package com.endava.intership.Framework.Infrastructure.Helper.Navigation;

import com.endava.intership.Framework.Infrastructure.Helper.Utility.Generics;
import org.openqa.selenium.By;

public class Click {

    //Click functions to click elements, after framework checks if they exist
    //following function is recommended for most uses.
    public static void clickGeneric (By locator){
        Generics.getElement( locator ).click();
    }

    public static void clickLink(String linkText) {
        Generics.getElement(By.linkText(linkText)).click();
    }

    public static void clickPartialLink(String partialLinkText) {
        Generics.getElement(By.partialLinkText(partialLinkText)).click();
    }
}
