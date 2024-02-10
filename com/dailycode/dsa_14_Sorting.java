package com.dailycode;

public class dsa_14_Sorting {
    public static void printarr(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
   public static void main(String[]args){
       int [] arr = {7,8,3,1,2};

       for(int i = 0; i<arr.length; i++){
           for(int j = 0; j<arr.length -i -1;j++){
               //Swap
               int temp = arr[j];
               if(arr[j]> arr[j+1]){
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
       printarr(arr);
   }
}
