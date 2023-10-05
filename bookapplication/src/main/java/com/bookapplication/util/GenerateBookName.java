package com.bookapplication.util;

import java.util.Random;

public class GenerateBookName {
    public static String bookName(){
        String[] a ={"1984 by George Orwell",
                "The Lord of the Rings by J.R.R. Tolkien",
                "The Kite Runner by Khaled Hosseini",
               " Harry Potter and the Philosopher's Stone by J.K.",
                "Slaughterhouse-Five by Kurt Vonnegut.",
                "The Lion, the Witch, and the Wardrobe by C.S.",
        "To Kill a Mockingbird by Harper Lee.",
               " The Book Thief by Markus Zusak."};
        Random random =new Random();
      int s = random.nextInt(a.length);
      return a[s];
    }
}
