package com.company;

import java.util.HashMap;
import java.util.Map;

public class Snack implements Meal {

    @Override
    public void eat(int BMR) {

        int caloriesForSnack;
        caloriesForSnack = (int) (BMR*0.15);
        System.out.println("caloriesForSnack: " +  caloriesForSnack);

        Map foodForSnack = new HashMap();

        foodForSnack.put("ice-cream", 270);
        foodForSnack.put("apple", 49);
        foodForSnack.put("prune", 227);
        foodForSnack.put("curde", 233);
        foodForSnack.put("grape", 70);
        foodForSnack.put("dried apricots", 280);
        foodForSnack.put("watermelon", 38);
        foodForSnack.put("bun", 240);
        foodForSnack.put("pancakes", 150);
        foodForSnack.put("eclair", 147);

    }
}
