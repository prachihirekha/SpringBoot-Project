package com.employeeapplication.util;

import java.util.Random;
import java.util.UUID;

public class GenerateEmployeeID {
    public static long randomId(){

        Random random =new Random();
       long sb = 1+random.nextInt(1000);
       // String s = UUID.randomUUID().toString();
        return sb;
    }


}
