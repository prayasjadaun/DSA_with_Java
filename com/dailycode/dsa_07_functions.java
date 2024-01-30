package com.dailycode;


import java.util.*;

public class dsa_07_functions {
    public static int calculateMulti(int a , int b){
        int sum = a*b;
        return sum;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateMulti(a,b);
        System.out.println(sum);
    }
}
