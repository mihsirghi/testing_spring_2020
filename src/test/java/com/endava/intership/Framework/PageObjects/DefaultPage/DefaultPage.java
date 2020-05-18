package com.endava.intership.Framework.PageObjects.DefaultPage;

import com.endava.intership.Framework.Infrastructure.Driver.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public abstract class DefaultPage {

    protected WebDriver driver;
    protected Wait wait;
    protected String Gostr;
    Setup setup=new Setup();


    public DefaultPage() {
        this.driver = setup.driver;
        this.wait = new Wait( this.driver );
    }


    public void checkTitle(String title) {
        String displayedTitle = driver.getTitle();
        Assert.assertEquals( "Displayed title is " + displayedTitle + " instead of " + title, title, displayedTitle );
    }
}
