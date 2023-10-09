package com.patient_application.util;

import java.util.Random;

public class GenerateDisease {
    public static  String generateDisease(){
        String[] s = {"Campylobacter Infection.",
                "Hepatitis A." ,
                "Hepatitis B." ,
                "Hepatitis C." ,
                "Novel Coronavirus (COVID-19)" ,
                "Influenza (Flu)" ,
                "Measles." ,
                "Meningococcal Disease."};
        Random random =new Random();
        int a=random.nextInt(s.length);
        return s[a];
    }

    public static void main(String[] args) {
        System.out.println(generateDisease());
    }
}
