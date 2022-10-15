package com.kunal;

public class WrraperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Integer num = 45;
        swap(a, b);
        System.out.println(a + " " + b);
        final A sajiya = new A("Sajiyah Salat");
        sajiya.name = "other name";
        // when a non primitive is final you cannot reassign it
        // kunal = new A("new object");
        A obj = new A("Mahenur");
        System.out.println(obj);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    }
}
class A {
        final int num = 10;
        String name;
        public A(String name){
            this.name = name;
        }

}


