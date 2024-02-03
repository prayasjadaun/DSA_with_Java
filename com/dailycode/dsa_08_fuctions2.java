package com.dailycode;

import java.util.*;


public class dsa_08_fuctions2 {
//    public static void main(String[] args) {
//Question 1--Enter 3 numbers from the user & make a function to print their average.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter number of b: ");
//        int b = sc.nextInt();
//        System.out.println("Enter number of c: ");
//        int c = sc.nextInt();
//
//        int avg = (a + b + c)/ 3;
//
//        System.out.println("The average of all numbers is :" + avg);

    //Question 2--Write a function to print the sum of all odd numbers from 1 to n.
//    public static void printsum(int n) {
//        int sum = 0;
//
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 != 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//        printsum(n);


    //    Question 3-- Write a function which takes in 2 numbers and returns the greater of those two.
//    public static int greterNumber(int a, int b) {
//        if (a > b) {
//            System.out.println("a is greater than b");
//            return a;
//        } else {
//            System.out.println("b is greater than a");
//            return b;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter number of b: ");
//        int b = sc.nextInt();
//
//        greterNumber(a, b);


    //    Question 4-- Write a function that takes in the radius as input and returns the circumference of a circle.
//    public static Double circumfrence(Double r) {
//        return 2 * Math.PI * r;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter radius: ");
//        Double r = sc.nextDouble();
//        System.out.println(circumfrence(r));

//    Question 5--Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    public static boolean isEligible(int age){
        if(age>18){
            return true;
        }
        return false;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println(isEligible(age));

    }
}
