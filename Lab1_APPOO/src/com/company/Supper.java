package com.company;

public class Supper implements Meal {

    @Override
    public void eat(int BMR) {

        int caloriesForSupper;
        caloriesForSupper = (int) (BMR*0.25);
        System.out.println("caloriesForSupper: " +  caloriesForSupper);

    }
}
