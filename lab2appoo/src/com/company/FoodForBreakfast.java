package com.company;

import java.util.HashMap;
import java.util.Map;

public class FoodForBreakfast implements IProducts, IPrintable {

    @Override
    public Map <String,Integer> productsSelection() {

        Map <String,Integer> foodForBreakfast = new HashMap<>();

        foodForBreakfast.put("oatmeal", 356);
        foodForBreakfast.put("egg",150);
        foodForBreakfast.put("curd", 233);
        foodForBreakfast.put("bun", 240);
        foodForBreakfast.put("banana", 95);
        foodForBreakfast.put("sandwich", 340);
        foodForBreakfast.put("milk", 62);

        return foodForBreakfast;
    }

    @Override
    public void print(Object foodForBreakfast){
        System.out.println("Calories of products for Breakfast: \n");
        System.out.println(foodForBreakfast);
        System.out.println("\n");
    }
}
