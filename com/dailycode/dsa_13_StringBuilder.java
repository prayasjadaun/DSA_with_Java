package com.dailycode;

import java.util.*;

import com.sun.security.jgss.GSSUtil;

public class dsa_13_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Prayas");
//        System.out.println(sb);
//        char at index 0
//        System.out.println(sb.charAt(0));
//
//       set char at index 0
//        sb.setCharAt(0,'R');
//        System.out.println(sb);
//         insert the index
//        sb.insert(0, 'S');
//        System.out.println(sb);
//        delete the index
//        sb.delete(2, 4);
//        System.out.println(sb);

        for(int i = 0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() -1 -i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);



    }
}
