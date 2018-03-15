package com.company;

import java.util.HashMap;
import java.util.Map;

public class FoodForSupper implements IProducts, IPrintable {

    @Override
    public Map <String,Integer> productsSelection() {

        Map <String,Integer> foodForSupper = new HashMap<>();

        foodForSupper.put("vegetable salad", 68);
        foodForSupper.put("beef", 154);
        foodForSupper.put("chicken", 185);
        foodForSupper.put("bread", 204);
        foodForSupper.put("cheese", 335);
        foodForSupper.put("ham", 365);
        foodForSupper.put("fish", 87);
        foodForSupper.put("cereal", 330);
        foodForSupper.put("pancakes", 150);
        foodForSupper.put("yogurt", 62);

        return foodForSupper;
    }

    @Override
    public void print(Object foodForSupper){
        System.out.println("Calories of products for Supper: \n");
        System.out.println(foodForSupper);
        System.out.println("\n");
    }
}
