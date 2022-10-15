package com.kunal.polymorphism;

public class Square extends Shapes{
    // this will run obj of Circle is created
    // hence it is overriding the parent method
    void area(){
        System.out.println("Area is square of side");
    }
}
