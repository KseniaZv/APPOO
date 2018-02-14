package com.company;

import java.util.HashMap;
import java.util.Map;

public class Supper implements Meal {

    @Override
    public void eat(int BMR) {

        int caloriesForSupper;
        caloriesForSupper = (int) (BMR*0.25);
        System.out.println("caloriesForSupper: " +  caloriesForSupper);

        Map foodForSupper = new HashMap();

        foodForSupper.put("vegetable salat", 68);
        foodForSupper.put("beef", 154);
        foodForSupper.put("chicken", 185);
        foodForSupper.put("bread", 204);
        foodForSupper.put("cheese", 335);
        foodForSupper.put("ham", 365);
        foodForSupper.put("fish", 87);
        foodForSupper.put("cereal", 330);
        foodForSupper.put("kefir", 62);

    }
}
