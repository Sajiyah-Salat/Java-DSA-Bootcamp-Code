package com.kunal.generics;

public class Student implements Comparable<Student>{

      int rollno;
      int age;

    @Override
    public String toString() {
        return age + " " + rollno;
    }

    public Student(int rollno, int age) {
        this.rollno = rollno;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.age - o.age);
        return diff;
    }
}
