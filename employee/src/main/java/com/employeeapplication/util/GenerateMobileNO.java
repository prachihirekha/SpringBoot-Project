package com.employeeapplication.util;

import java.util.Random;

public class GenerateMobileNO {
    public static long mobileNo(){
        Random random =new Random();
        long number =1000000000l+((long) random.nextInt(900000000));
        return number;
    }

}
