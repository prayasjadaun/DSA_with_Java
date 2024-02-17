package com.dailycode;
/*

public class dsa_16_PermutationString {
    public static void printPerm(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i =0; i<str.length();i++){
            char currChar = str.charAt(i);
            //"abc" -> "ab"
            String newStr = str.substring(0,i)+ str.substring(i+1);
            printPerm(newStr, permutation+currChar);
        }
    }
    public static void main(String[]args){
        String str = "abc";
        printPerm(str, "");
    }
}
 */

public class dsa_16_PermutationString {
   /*
    public static int countPaths(int i , int j , int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j ==m-1){
            return 1;
        }
        //Move Downwards
        int downPaths = countPaths(i+1,j,n,m);
        //Move Right
        int rightPaths = countPaths(i, j+1, n, m);
        return downPaths+ rightPaths;
    }
    public static void main(String[]args){
        int n =3 , m = 3;
        int totalPaths = countPaths(0,0,n,m);
        System.out.println(totalPaths);

    }
    */

    public static int callGuests(int n){
        if(n<=1){
            return 1;
        }
        int way1 = callGuests(n-1);

        int way2 = (n-1) * callGuests(n-2);
        return way1 + way2;
    }
    public static void main(String[]args){
        int n = 4;
        System.out.println(callGuests(n));
    }
}