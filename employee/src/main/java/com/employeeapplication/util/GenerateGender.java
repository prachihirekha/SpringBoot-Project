package com.employeeapplication.util;

import java.util.Random;

public class GenerateGender {
    public static String gender(){
        String []s ={"male","female"};
        Random random =new Random();
        int g = random.nextInt(s.length);
        return s[g];
    }

    public static void main(String[] args) {
        System.out.println(gender());
    }
}
