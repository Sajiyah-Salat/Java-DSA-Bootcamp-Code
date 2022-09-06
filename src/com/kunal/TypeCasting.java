package com.kunal;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        // int num = input.nextInt();
////        int num = (int)(67.54f);
////        System.out.println(num);
//        byte b = (byte)(257);
//        System.out.println(b);
//        int count = 1;
//        while(count!=6){
//            System.out.println(count);
//            count++;
//        }
//        for(int count = 1;count != 5; count++){
//            System.out.println(count);
//        }
        int salary = 25400;
//        if (salary> 10000){
//            salary= salary + 2000;
//
//        }
//        else {
//            salary = salary + 1000;
//        }
        if (salary > 10000 ){
            salary += 2000;
        }
        else if(salary>20000){
            salary += 3000;
        }
        else{
            salary += 1000;
        }
        System.out.println(salary);
    }

}
