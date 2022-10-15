package com.kunal.cloning;

public class Human implements Cloneable {
    int age;
    String name;
int[] arr;
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
      // this.arr = new int{6,43,6,3,4,6};
    }

  public Human(Human other){
        this.age = other.age;
        this.name = other.name;

  }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
