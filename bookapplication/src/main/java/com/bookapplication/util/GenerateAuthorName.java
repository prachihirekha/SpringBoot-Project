package com.bookapplication.util;

import java.util.Random;

public class GenerateAuthorName {
    public static void main(String[] args) {
        System.out.println(authorName());
    }
    public static String authorName(){
        String [] s ={"Chetan Bhagat",
        "Amrita Pritam",
       " Jhumpa Lahiri",
        "Khushwant Singh",
       " R. K. Narayan",
        "Rabindranath Tagore",
        "Ruskin Bond",
        "Vikram Seth"};
        Random random =new Random();
        int a = random.nextInt(s.length);
        return s[a];
    }
}
