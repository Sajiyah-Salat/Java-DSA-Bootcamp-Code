package com.kunal.polymorphism;

public class Circle extends Shapes{
    @Override//this is called annotation
    void area(){
        System.out.println("Area of Cirle is Math.PI *r * r") ;
    }
}
