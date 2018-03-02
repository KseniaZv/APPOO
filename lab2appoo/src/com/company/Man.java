package com.company;

public class Man extends Human {

    @Override
    public int BMR() {

        return (int) (88.36 + (13.4 * getWeight()) + (4.8 * getHeight()) - (5.7 * getAge()));
    }
}
