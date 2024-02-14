package com.dailycode;

public class dsa_15_Recursion {
//    public static void printNumb(int n){
//        if(n == 0){
//            return;
//        }
//        System.out.println(n);
//        printNumb(n-2);
//    }
//    public static void main(String[]args){
//        int n = 10;
//        printNumb(n);
//    }

    public static void printfib(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printfib(b, c, n-1);

    }
    public static void main(String[]args){
        int a = 0;
        int b = 2;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printfib(a, b, n-2);

    }



}
