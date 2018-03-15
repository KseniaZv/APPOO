package com.company;

public class Breakfast implements IMeal {

    @Override
    public int caloriesCalculation(int basalMetabolicRate) {

        return (int) (basalMetabolicRate*0.25);

    }

    @Override
    public void printCalories(int basalMetabolicRate) {

        System.out.println("caloriesForBreakfast: " +  caloriesCalculation(basalMetabolicRate));

    }
}
