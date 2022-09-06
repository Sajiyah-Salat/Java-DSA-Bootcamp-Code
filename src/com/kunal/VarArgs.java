package com.kunal;
import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4);
        fun(2,4,"Sajiyah");
        demo("Jifal","hfdifdi");

    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int a ,int b ,String ...v)//Variable arg always at the end
    {

    }
    static void  fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
