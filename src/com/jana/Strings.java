package com.jana;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {


    }

    static boolean palindrome(String word){
        String str = word.toLowerCase(Locale.ENGLISH);
        for (int i = 0; i <= str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-i-1);

            if(start!=end){
               return false;
            }

        }
        return true;
    }
}
