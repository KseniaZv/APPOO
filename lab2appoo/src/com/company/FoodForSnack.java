package com.company;

import java.util.HashMap;
import java.util.Map;

public class FoodForSnack  implements IProducts, IPrintable {

    @Override
    public Map <String,Integer> productsSelection() {

        Map <String,Integer> foodForSnack = new HashMap<>();

        foodForSnack.put("ice-cream", 270);
        foodForSnack.put("apple", 49);
        foodForSnack.put("prune", 227);
        foodForSnack.put("curd", 233);
        foodForSnack.put("grape", 70);
        foodForSnack.put("dried apricots", 280);
        foodForSnack.put("watermelon", 38);
        foodForSnack.put("bun", 240);
        foodForSnack.put("pancakes", 150);
        foodForSnack.put("eclair", 147);

        return foodForSnack;
    }

    @Override
    public void print(Object foodForSnack){
        System.out.println("Calories of products for Snack: \n");
        System.out.println(foodForSnack);
        System.out.println("\n");
    }
}

