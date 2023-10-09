package com.patient_application.util;

import java.util.Random;

public class GeneratePhoneNo {
    public static long generatePhoneNumber(){
        Random random = new Random();
       long number= 1000000000l+random.nextLong(9000000000l);
       return number;
    }

    public static void main(String[] args) {
        System.out.println(generatePhoneNumber());
    }
}
