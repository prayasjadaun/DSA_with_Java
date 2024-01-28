package com.dailycode;
import java.util.*;
public class dsa_05_loops {
    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        int l = sc.nextInt();
//        int sum = 0;
//        for(int i = 1; i<=l; i++){
//            if(i%2==0){
//                sum+= i;
//            }
//
//        }
//        System.out.println(sum);
//        for(int i = 1;i<=5; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n  = sc.nextInt();
        int sum =0;
        for(int i =1; i<=10; i++){
            System.out.println(n+" X "+ i+" = "+ n*i);
        }

    }
}
