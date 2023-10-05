package com.employeeapplication.util;

import java.util.Date;
import java.util.Random;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class RandomDate {
    public static Date date(){
        long aDay = TimeUnit.DAYS.toMillis(1); // 1 day
        long now = new Date().getTime(); // current time
        Date yesterday = new Date(now - aDay);
        Date aYearAgo = new Date(now - aDay * 365);

        return yesterday;
    }


}



