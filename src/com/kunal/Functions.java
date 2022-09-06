package com.kunal;
import java.util.Scanner;

public class Functions {
   public static void main(String[] args) {
//       String message = greet();
//       System.out.println(message);
       //int ans = sum2();
//        System.out.println(ans);
       Scanner in = new Scanner(System.in);
       System.out.println("Enter your name");
       String name = in.next();
       String personalised = MyGreet(name);
       System.out.println(personalised);

    }

     static String MyGreet(String name) {
       String message = "Hello " + name;
       return message;
    }

    //    }
//    static int sum2(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number 1");
//        int num1 = in.nextInt();
//        System.out.println("Enter the number 2");
//        int num2 = in.nexrInt();
//        int sum = num1 + num2;
//        return sum;
    static String greet(){
       String greeting = "how are you?";
               return greeting;
    }
}
