package com.endava.intership.Framework.Infrastructure.Helper.Utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTime {
    public static String getCurrentDateTime() {

        DateFormat dateFormat = new SimpleDateFormat("_yyyy-MM-dd_HH-mm-ss");
        Calendar cal = Calendar.getInstance();
        return "" + dateFormat.format(cal.getTime());
    }

    public static String getCurrentDate() {
        return getCurrentDateTime().substring(0, 11);
    }

}
