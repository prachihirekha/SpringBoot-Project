package com.bookapplication.util;

import java.util.Random;

public class GenerateID {
    public static int generateId(){
        Random random =new Random();
       int a= random.nextInt();
       return a;

    }



}
