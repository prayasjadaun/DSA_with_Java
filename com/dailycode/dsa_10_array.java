package com.dailycode;

import java.util.*;

public class dsa_10_array {
    public static void main(String[] args) {
//  Question 1--Take an array of names as input from the user and print them on the screen.
//        Scanner sc = new Scanner(System.in);
//        int size = 5;
//
//        String names[] = new String[size];
//        //Input
//        for(int i = 0; i<size; i++){
//            System.out.println("Enter ypur names: ");
//            names[i] = sc.next();
//        }
//        //Output
//        for(int i = 0; i< names.length; i++){
//            System.out.println("Name "+ (i+1)+ " is: "+ names[i]);
//        }

//Question 2-- Find the maximum & minimum number in an array of integers.
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] numbers = new int[size];
        //Input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Largest number is: " + max);
        System.out.println("Smallest number is: " + min);

    }
}
