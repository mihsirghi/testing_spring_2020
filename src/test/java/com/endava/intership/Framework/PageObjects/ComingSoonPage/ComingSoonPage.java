package com.endava.intership.Framework.PageObjects.ComingSoonPage;

import com.endava.intership.Framework.Infrastructure.Driver.Setup;
import com.endava.intership.Framework.PageObjects.DefaultPage.DefaultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComingSoonPage  extends DefaultPage {

    @FindBy(className = "grid icon-gridview")
    private WebElement gridElementBtn;

    public ComingSoonPage(){
        WebDriver driver = Setup.driver;
        PageFactory.initElements( driver, this );
    }

    public WebElement getGridElementBtn() {
        return gridElementBtn;
    }
}
