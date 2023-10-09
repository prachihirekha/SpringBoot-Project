package com.patient_application.util;

import java.util.Random;

public class GenerateFirstName {
    public static String generateName() {
        String[] names = {"Alex", "James", "Blake", "Kyle", "Kyle", "Taylor", " Kennedy", "Jordan", "Parker"};
        Random random = new Random();
        int a = random.nextInt(names.length);
        return names[a];
    }


}

