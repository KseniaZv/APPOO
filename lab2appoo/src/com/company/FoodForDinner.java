package com.company;

import java.util.HashMap;
import java.util.Map;

public class FoodForDinner implements IProducts, IPrintable {

    @Override
    public Map <String,Integer> productsSelection() {

        Map <String,Integer> foodForDinner = new HashMap<>();

        foodForDinner.put("soup", 25);
        foodForDinner.put("potatoes", 89);
        foodForDinner.put("macaroni", 336);
        foodForDinner.put("beef", 154);
        foodForDinner.put("chicken", 185);
        foodForDinner.put("vegetable salad", 68);
        foodForDinner.put("fish", 87);
        foodForDinner.put("cereal", 330);
        foodForDinner.put("orange", 41);

        return foodForDinner;
    }

    @Override
    public void print(Object foodForDinner){
        System.out.println("Calories of products for Dinner: \n");
        System.out.println(foodForDinner);
        System.out.println("\n");
    }
}
