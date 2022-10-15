package com.kunal.properties;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        // Used to initialise values present in parent class
        this.weight = weight;
    }

    public BoxWeight(){
        this.weight = -1;

    }



}
