package com.kunal.abstractDemo;

abstract public class Parent {
    static int age;
final int VALUE;
    public Parent(int age) {
        this.age = age;
        VALUE = 9438;
    }

    static void hello(){
        System.out.println("hey");

    }
    void normal(){
        System.out.println("thisis a nornfkasd");
    }


    abstract void career();
    abstract void partner();
}
