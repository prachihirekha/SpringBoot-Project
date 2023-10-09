package com.patient_application.util;

import java.util.Random;

public class GenerateLastName {
    // method
    public  static String generateLastName(){
        String[] lastNAme={"Smith", "Johnson", "Miller","Davis", "Williams", "Allen", "Carter", "Garcia", " Wilson"};
        Random random =new Random();
        int s =random.nextInt(lastNAme.length);
        return lastNAme[s];
    }

    public static void main(String[] args) {
        System.out.println(generateLastName());
    }
}
