package com.kunal;
import java.util.Scanner;
import java.util.Arrays;
public class Input {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //Array of Primitives
        arr[0] = 45;
        arr[1] = 5;
        arr[2] = 4;
        arr[3] = 49;
        arr[4] = 75;
        System.out.println(arr[3]);
        Scanner in = new Scanner( System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();

        }
       // System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        for (int num: arr){
//            System.out.println(num + " ");
//        }

// array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        // modify
//        str[1] = "Salat Sajiyah";
//        System.out.println(Arrays.toString(str));
   }
}
