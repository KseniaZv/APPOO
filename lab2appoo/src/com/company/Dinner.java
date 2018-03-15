package com.company;

public class Dinner implements IMeal {

    @Override
    public int caloriesCalculation(int basalMetabolicRate) {

        return (int) (basalMetabolicRate*0.35);

    }

    @Override
    public void printCalories(int basalMetabolicRate) {

        System.out.println("caloriesForDinner: " +  caloriesCalculation(basalMetabolicRate));

    }
}
