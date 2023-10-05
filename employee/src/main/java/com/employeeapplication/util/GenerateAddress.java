package com.employeeapplication.util;

import java.util.Random;

public class GenerateAddress {
    public static  String generateAddress(){
        String []address ={"Nagpur","Kolhapur","Chandrapur","Ramtek","Pune","Mumbai"};
        Random random =new Random();
        int a = random.nextInt(address.length);
        return address[a];
    }


}
