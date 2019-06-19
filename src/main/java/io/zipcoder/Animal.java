package io.zipcoder;

public abstract class Animal {
    Double weight;
    Double height;
    Double xPos;
    Double yPost;

    public abstract void move();

    public Double getWeight(){
        return weight;
    }
}
