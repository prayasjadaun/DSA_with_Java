package com.dailycode;


import java.util.*;

public class dsa_07_functions {
    public static int calculateMulti(int a , int b){
        return a*b;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number of a: ");
        int a = sc.nextInt();
        System.out.print("Enter your number of b: ");
        int b = sc.nextInt();

        System.out.println("The product of 2 numbers: "+ calculateMulti(a,b));
    }
}
