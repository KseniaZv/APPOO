package com.company;

public class Supper implements IMeal {

    @Override
    public int caloriesCalculation(int basalMetabolicRate) {

        return (int) (basalMetabolicRate*0.25);

    }

    @Override
    public void printCalories(int basalMetabolicRate) {

        System.out.println("caloriesForSupper: " +  caloriesCalculation(basalMetabolicRate));

    }
}
