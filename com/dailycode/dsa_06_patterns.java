package com.dailycode;
import java.util.*;
public class dsa_06_patterns {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int m = 5;
       /*
        for(int i = 1; i<=n; i++){

            for(int j = 1; j<=m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */

        for(int i =1; i<=n; i++){
            for(int j =1; j<=m; j++){
                if(i==1 || j ==1 || i==n || j== m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
