package com.company;

public class Snack implements Meal {

    @Override
    public void eat() {
        System.out.println("Inside Snack::eat() method.");
    }
}
