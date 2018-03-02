package com.company;

import java.util.*;

import static com.company.GetFoodNames.getFoodNames;

public class Dinner implements Meal {

    @Override
    public void eat(int BMR) {

        int caloriesForDinner;
        caloriesForDinner = (int) (BMR*0.35);
        System.out.println("caloriesForDinner: " +  caloriesForDinner);

        Map foodForDinner = new HashMap();

        foodForDinner.put("soup", 25);
        foodForDinner.put("potatoes", 89);
        foodForDinner.put("macaroni", 336);
        foodForDinner.put("beef", 154);
        foodForDinner.put("chicken", 185);
        foodForDinner.put("vegetable salad", 68);
        foodForDinner.put("fish", 87);
        foodForDinner.put("cereal", 330);
        foodForDinner.put("orange", 41);

        getFoodNames(foodForDinner, caloriesForDinner);

    }
}
