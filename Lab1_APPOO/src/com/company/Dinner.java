package com.company;

import java.util.HashMap;
import java.util.Map;

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
        foodForDinner.put("vegetable salat", 68);
        foodForDinner.put("fish", 87);
        foodForDinner.put("cereal", 330);
        foodForDinner.put("orange", 41);

    }
}
