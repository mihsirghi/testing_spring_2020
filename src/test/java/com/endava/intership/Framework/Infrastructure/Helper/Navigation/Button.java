package com.endava.intership.Framework.Infrastructure.Helper.Navigation;

import com.endava.intership.Framework.Infrastructure.Helper.Utility.Generics;
import org.openqa.selenium.By;

public class Button {

    public static void clickButton(By locator){
        Generics.getElement( locator ).click();
    }
}
