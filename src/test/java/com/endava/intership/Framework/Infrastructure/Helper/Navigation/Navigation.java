package com.endava.intership.Framework.Infrastructure.Helper.Navigation;

import com.endava.intership.Framework.Infrastructure.Driver.Setup;


import java.net.URL;

public class Navigation {
    public static void navigateTo(String url) {
        Setup.driver.get( url );
    }

    public static void navigateTo(URL url) {
        Setup.driver.get(url.getPath());
    }

    public static String getTitle() {

        return Setup.driver.getTitle();
    }

    public static String getCurrentUrl() {

        return Setup.driver.getCurrentUrl();
    }
}
