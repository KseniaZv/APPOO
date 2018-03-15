package com.company;

public class Snack implements IMeal {

    @Override
    public int caloriesCalculation(int basalMetabolicRate) {

        return (int) (basalMetabolicRate*0.15);

    }

    @Override
    public void printCalories(int basalMetabolicRate) {

        System.out.println("caloriesForSnack: " +  caloriesCalculation(basalMetabolicRate));

    }
}
