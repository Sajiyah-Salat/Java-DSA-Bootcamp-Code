package com.kunal;
import java.util.Arrays;



public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,2};
        reverse(arr);
       // swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
       // System.out.println(swap);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[]arr){
        int start = 0;
        int end = arr.length - 1;
         while (start<end){
             //swap
             swap(arr,start,end);
             start++;
             end--;
         }
    }
    static void swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2]= temp;
    }
}
