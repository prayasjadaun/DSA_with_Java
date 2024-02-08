package com.dailycode;
import java.util.*;

public class dsa_12_String {
    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = sc.nextLine();
//        System.out.println("Your name is: "+ name);

// Question 1--Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int totlength = 0;
        for(int i = 0; i<size; i++){
            array[i] = sc.next();
            totlength += array[i].length();
        }
        System.out.println(totlength);

    }
}
