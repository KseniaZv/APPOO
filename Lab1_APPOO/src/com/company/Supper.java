package com.company;

public class Supper implements Meal {

    @Override
    public void eat() {
        System.out.println("Inside Supper::eat() method.");
    }
}
