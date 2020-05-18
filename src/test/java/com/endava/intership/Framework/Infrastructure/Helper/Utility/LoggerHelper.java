package com.endava.intership.Framework.Infrastructure.Helper.Utility;

import org.apache.log4j.*;

public class LoggerHelper {

    private static String pattern = "%d{yyyy-MM-dd HH:mm:ss} %-5p [%c{1}] - [%M] %m%n";
    private static Logger root = null;

    public static Layout getPatternLayout(String pattern) {
        return new PatternLayout(pattern);
    }

    public static String getPattern() {
        return pattern;
    }

    public static void setPattern(String pattern) {
        LoggerHelper.pattern = pattern;
    }

    public static Appender getConsoleAppender() {

        ConsoleAppender console = new ConsoleAppender(getPatternLayout( getPattern()));
        console.setName("ConsoleAppender");
        console.setThreshold(Level.INFO);
        console.setTarget("System.out");
        console.activateOptions();
        return console;
    }

    public static Appender getRollingFileAppender() {

        RollingFileAppender file = new RollingFileAppender();
        file.setAppend(true);
        file.setLayout(getPatternLayout( getPattern()));
        file.setName("Rolling File Appender");
        file.setThreshold(Level.INFO);
        file.setMaxBackupIndex(10);
        file.setFile(Resource.getResourcePath("logs/") + "Selenium.log");
        file.activateOptions();
        return file;
    }

    public static Logger getLogger(Class clas) {

        if(root != null)
            return Logger.getLogger(clas);

        root = Logger.getRootLogger();
        root.addAppender(getConsoleAppender());
        root.addAppender(getRollingFileAppender());
        return Logger.getLogger(clas);
    }
}
