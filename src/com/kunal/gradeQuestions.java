package com.kunal;

import java.util.Scanner;

public class gradeQuestions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int i,fact = 1;
       int num = 5;
        for (i = 1; i < num; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial of" + num +  "is:" + fact);

//        int eng = in.nextInt();
//        int phy = in.nextInt();
//        int chem = in.nextInt();
//        int math = in.nextInt();
//        int comp = in.nextInt();
//        int percentage = (eng + phy + chem + math + comp) / (5 *100) * (100);
//        switch ( (int) percentage/10){
//            case 9:
//                 System.out.println(" Grade: A+");
//               break;
//            case 8:
//                   System.out.println("Grade: A");
//                   break;
//            case 7:
//                       System.out.println("Grade: B ");
//                       break;
//            case 6:
//                           System.out.println("Grade: C");
//                           break;
//            default:
//                               System.out.println("Grade: D");
//
//        }
    }
}
