package com.endava.intership.Framework.Infrastructure.Helper.Utility;

public class Resource {

    public static String getResourcePath(String resource) {

        return getBaseResourcePath() + resource;
    }

    public static String getBaseResourcePath() {
        return Class.class.getResource("/").getPath();
    }
}
