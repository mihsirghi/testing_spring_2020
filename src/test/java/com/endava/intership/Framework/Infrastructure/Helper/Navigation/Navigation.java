package com.endava.intership.Framework.Infrastructure.Helper.Navigation;

import com.endava.intership.Framework.Infrastructure.Driver.Setup;


import java.net.URL;

public class Navigation {
    Setup setup=new Setup();
    public void navigateTo(String url) {
        setup.driver.get( url );
    }

    public void navigateTo(URL url) {
        setup.driver.get(url.getPath());
    }

    public String getTitle() {

        return setup.driver.getTitle();
    }

    public String getCurrentUrl() {

        return setup.driver.getCurrentUrl();
    }
}
