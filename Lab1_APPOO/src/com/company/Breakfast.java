package com.company;

public class Breakfast implements Meal {

    @Override
    public void eat(int BMR) {

        int caloriesForBreakfast;
        caloriesForBreakfast = (int) (BMR*0.25);
        System.out.println("caloriesForBreakfast: " +  caloriesForBreakfast);
    }

}
