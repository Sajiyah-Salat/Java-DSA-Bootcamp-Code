package com.kunal.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Sajiyah = new Human(32,"Sajiyah Salat");
        Human twin =  (Human)Sajiyah.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));
    }
}
