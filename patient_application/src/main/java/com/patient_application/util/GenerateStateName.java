package com.patient_application.util;

import java.util.Random;

public class GenerateStateName {
    public static String generateStateName(){
        String [] stateName={"Alabama", "Alaska", "Arizona", " Arkansas","California","Colorado", "Connecticut", "Delaware"};
        Random random = new Random();
       int a = random.nextInt(stateName.length);
       return stateName[a];
    }

    public static void main(String[] args) {
        System.out.println(generateStateName());
    }
}
