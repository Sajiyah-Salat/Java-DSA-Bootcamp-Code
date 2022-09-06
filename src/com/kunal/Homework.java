package com.kunal;
import java.util.Scanner;
public class Homework {
 public static void main(String[] args) {
//        System.out.println("Enter lenght");
     Scanner in = new Scanner(System.in);
//        int l = in.nextInt();
//        System.out.println("Enter height");
//        int h = in.nextInt();
//        System.out.println("Enter width");
//        int w = in.nextInt();
//        int volume = (int) (l * w * h )/3;
//        System.out.println( "The volume of pyramid is: " + volume);

//     int num1 = in.nextInt();
//     int num2 = in.nextInt();
//     int p = num1 * num2;
//     int s = num1 + num2;
//     int ans = p - s;
////     System.out.println(ans);
     int employ  = in.nextInt();
     String department = in.next();
     switch (employ){
         case 1 :
             System.out.println("Kunal Kushwaha");
             break;
         case 2:
             System.out.println("Salat Sajiyah");
             break;
         case 3:
             switch (department){
                 case "IT":
                     System.out.println("IT Department");
                     break;
                 case "Management":
                     System.out.println("Management Department");
                     break;
                 default:
                     System.out.println("No deparatment" );
             }
             break;
         default:
             System.out.println("Enter correct empID");
     }

 }
}
