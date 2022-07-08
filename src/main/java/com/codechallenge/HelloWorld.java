package com.codechallenge;

import java.util.ArrayList;

/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {
    public static void main(String[] args) {

        String Aarushi = "Hel" + "lo" + ", " + "Worl" + "d!";
        JoE(Aarushi);
    }

    public static String JoE(String Magus){
        if(Magus.length() == 0){
            return "";
        }
        System.out.print(Magus.charAt(0));
        return JoE(Magus.substring(1));
    }
}
