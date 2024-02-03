package com.dailycode;

public class dsa_11_2dArray {
    public static void main(String[]args){
        int rows = 5;
        int cols = 5;

        int [][] arr = new int[rows][cols];
        int value = 1;
        for(int i = 0 ; i<rows;i++){
            for(int j = 0; j<cols; j++){
               arr[i][j] = value;
               value++;
            }
        }
        System.out.println("2d array is: ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols;j++){
                System.out.println(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
