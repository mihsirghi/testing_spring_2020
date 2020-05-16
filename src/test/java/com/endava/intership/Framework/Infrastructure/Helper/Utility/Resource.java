package com.endava.intership.Framework.Infrastructure.Helper.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Resource {

    //Temporary hardcoded baseResource, for future will be changed
    private static final String defaultResourcePath = "src\\test\\resources\\";

    //logger support to be done
    // public static final Logger log = LoggerSupport.getLogger(ResourceSupport.class);

    public static String getResourcePath(String resource) {
        String path = defaultResourcePath + resource;
        //logger suport to be done
        //log.debug(path);
        return path;
    }

    public static InputStream getResourcePathInputStream(String resource) throws FileNotFoundException {
        return new FileInputStream(Resource.getResourcePath(resource));
    }
}
