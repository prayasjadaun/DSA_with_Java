package com.dailycode;
import java.util.*;

public class dsa_10_array {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size = 5;

        String names[] = new String[size];
        //Input
        for(int i = 0; i<size; i++){
            System.out.println("Enter ypur names: ");
            names[i] = sc.next();
        }
        //Output
        for(int i = 0; i< names.length; i++){
            System.out.println("Name "+ (i+1)+ " is: "+ names[i]);
        }

    }
}
