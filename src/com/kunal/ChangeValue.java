package com.kunal;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr ={1,3,4,6};
        change (arr);
   //     System.out.println(arr.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99;//if you make a change to the object via this ref variable, same object will be changed
    }
}
