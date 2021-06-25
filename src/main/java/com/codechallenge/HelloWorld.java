package com.codechallenge;

import java.util.ArrayList;

/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {

	public static void main(String[] args) {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char h = alphabet[7];
        char e = alphabet[4];
        char l = alphabet[11];
        char l2 = alphabet[11];
        char o = alphabet[14];
        char w = alphabet[22];
        char o2 = alphabet[14];
        char r = alphabet[17];
        char l3 = alphabet[11];
        char d = alphabet[3];
        
        char[] totallyInsignificantPhrase = {h,e,l,l2,o,w,o2,r,l3,d};
        
            int o_counter = 0;
            for (char i : totallyInsignificantPhrase){
                if(i == 'o'){
                    o_counter++;
                }
                
                if(i == 'h' || i == 'w'){
                    System.out.print((char)(i-32));
                } else {
                    System.out.print(i);
                }
                
                if(o_counter == 1){
                    System.out.print(" ");
                    o_counter++;
                }
            }
            System.out.println("");
    }
}
