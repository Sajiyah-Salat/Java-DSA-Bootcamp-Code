package com.kunal;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        /*
        syntax
        ArrayList<Integer> list = new ArrayList<>();

         */
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(68);
        list.add(68);
        list.add(56);
        list.add(68);
        list.add(68);
        list.add(68);
        list.add(68);
        list.add(68);
        list.set(0,4);
     //   System.out.println(list.contains(56));
      //  System.out.println(list);
// input
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            list.add(in.nextInt());

        }

        for (int i = 0; i <5 ; i++) {
            System.out.println(list.get(i));

        }

       System.out.print(list);

    }
}
