package com.kunal.generics;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {


        Student Sajiyah = new Student(45,89);
        Student Rahul = new Student(4,23);
        Student Neha = new Student(5,53);
        Student Sunaina = new Student(3,31);
        Student Naina = new Student(7,56);
        Student[] list = {Sajiyah, Rahul, Neha, Sunaina, Naina};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list, (o1, o2) -> -(int)( o1.age - o2.age));
        System.out.println(Arrays.toString(list));
//        if(sajiyah.compareTo(Rahul) < 0){
//            System.out.println(sajiyah.compareTo(Rahul));
//            System.out.println("Rahul has more marks");
//        }
    }
}
