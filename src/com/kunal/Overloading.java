package com.kunal;

public class Overloading {
    public static void main(String[] args) {
        fun(45);
        fun("Sajiya");
        sum(3,4);
        sum(5,6,6);
     }
     static int sum(int a,int b){
       return a + b;
     }
    static int sum(int a,int b,int c){
       return a + b + c;
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name ){
        System.out.println(name);
    }
}
