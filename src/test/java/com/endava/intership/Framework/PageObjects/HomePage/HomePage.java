package com.endava.intership.Framework.PageObjects.HomePage;

import com.endava.intership.Framework.Infrastructure.Driver.Setup;
import com.endava.intership.Framework.PageObjects.DefaultPage.DefaultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends DefaultPage {

    public HomePage(){
        WebDriver driver = Setup.driver;
        PageFactory.initElements( driver, this );
    }
}
