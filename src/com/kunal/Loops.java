package com.kunal;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        // Q
//        for(int num = 1;num<= 5;num++){
//            System.out.println(num);
//        }
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int num = 1; num <=n ; num++) {
//            System.out.println("Hello World");
//        }
//int num = 1;
//while (num<= 5){
//    System.out.println(num);
//    num += 1;
//}
//
        //  int max = Math.max(c, Math.max(a,b));
        /// System.out.println(max);
//char ch = in.next().trim().charAt(0);
//if(ch >= 'a' && ch <= 'z'){
////            System.out.println("Lowercase");
////        }
////else{
////            System.out.println("Uppercase");
//int n = in.nextInt();
//int a = 0;
//int b = 1;
//int count = 2;
//while(count<= n){
//    int temp = b;
//    b = b + a;
//    a = temp ;
//    count ++;
//
//        }
//        System.out.println(b);

//int n  = 2_59_87;
//int count = 0;
//while(n>0){
//    int rem = n% 10;
//    if (rem ==4){
//        count++;
//    }
//    n = n/10;
//}
//        System.out.println(count);
//    }
        int num = 44382;
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }

        System.out.println(ans);
    }

}
