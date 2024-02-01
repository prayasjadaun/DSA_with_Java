package com.dailycode;


import java.util.*;

public class dsa_07_functions {
//    public static int calculateMulti(int a , int b){
//        return a*b;
//    }

    public static void printfact(int n) {
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your number of a: ");
//        int a = sc.nextInt();
//        System.out.print("Enter your number of b: ");
//        int b = sc.nextInt();
//        System.out.println("The product of 2 numbers: "+ calculateMulti(a,b));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of factorial: ");
        int n = sc.nextInt();
        printfact(n);
    }
}
