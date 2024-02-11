package com.dailycode;

public class dsa_14_Sorting {
    /*
     public static void printArr(int[] arr){
         for (int j : arr) {
             System.out.print(j + " ");
         }
         System.out.println();
     }
    public static void main(String[]args){
        int [] arr = {7,8,3,1,2};
        //Bubble Sort
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
        printArr(arr);
    }

    //Selection Sort
    public static void printArr(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};
        for (int i = 0; i < arr.length -1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[smallest]> arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArr(arr);
    }
        */

    //Insertion Sort

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        printArr(arr);
    }


}
