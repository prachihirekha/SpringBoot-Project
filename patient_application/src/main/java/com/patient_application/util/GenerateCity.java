package com.patient_application.util;

import java.util.Random;

public class GenerateCity {
    public static String generateCity(){
        String []  city ={"Andalusia", "Anniston ", "Athens "," Alaska" ," Anchorage" ," Cordova ", "Fairbanks ","Haines ", "Arizona", "Ajo", "Avondale "," Bisbee", "Arkansas"};
        Random random = new Random();
        int c=random.nextInt(city.length);
        return city[c];
    }

}
