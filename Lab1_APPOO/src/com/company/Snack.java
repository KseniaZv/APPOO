package com.company;

public class Snack implements Meal {

    @Override
    public void eat(int BMR) {

        int caloriesForSnack;
        caloriesForSnack = (int) (BMR*0.15);
        System.out.println("caloriesForSnack: " +  caloriesForSnack);

    }
}
