package com.company;

import java.util.HashMap;
import java.util.Map;

public class Breakfast implements Meal {

    @Override
    public void eat(int BMR) {

        int caloriesForBreakfast;
        caloriesForBreakfast = (int) (BMR*0.25);
        System.out.println("caloriesForBreakfast: " +  caloriesForBreakfast);

        Map foodForBreakfast = new HashMap();

        foodForBreakfast.put("oatmeal", 356);
        foodForBreakfast.put("egg",150);
        foodForBreakfast.put("curd", 233);
        foodForBreakfast.put("bun", 240);
        foodForBreakfast.put("banana", 95);
        foodForBreakfast.put("sandwich", 340);
        foodForBreakfast.put("milk", 62);

    }

}
