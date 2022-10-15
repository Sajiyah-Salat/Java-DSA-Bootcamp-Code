package com.kunal.collections;

public class Enum {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;


        // these are enum constants
        // public ,static and final
        //since its final you cant create child enums
        // type is week
        Week() {
            System.out.println("Constructor called for " + this);
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        for (Week day:Week.values()
             ) {
            System.out.println(day);

        }
        System.out.println(week.ordinal());
    }
}
