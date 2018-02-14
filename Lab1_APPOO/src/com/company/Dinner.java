package com.company;

public class Dinner implements Meal {

    @Override
    public void eat(int BMR) {

        int caloriesForDinner;
        caloriesForDinner = (int) (BMR*0.35);
        System.out.println("caloriesForDinner: " +  caloriesForDinner);

    }
}
