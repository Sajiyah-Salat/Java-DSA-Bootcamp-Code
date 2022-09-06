package com.kunal;

public class Nto1 {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
//        funRev(5);
//    }
//    static void funRev(int n){
//        if(n==0){
//            return;
//        }
//        funRev(n-1);
//        System.out.println(n);

    }
    static int fact(int n){
        if (n<= 1){
            return 1;
        }
      return   n * fact(n-1);
    }





}
