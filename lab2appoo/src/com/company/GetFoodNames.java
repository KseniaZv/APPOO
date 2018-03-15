package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

class GetFoodNames {

    static void getFoodNames(Map<String, Integer> food, int calories) {

        int tempCal = 0;
        List<String> foodNames = new ArrayList<>();
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(food.entrySet());
        Map.Entry<String, Integer> randomEntry = entries.get(new Random().nextInt(entries.size()));

        while (tempCal + randomEntry.getValue() <= calories) {
            tempCal += randomEntry.getValue();
            foodNames.add(randomEntry.getKey());
            randomEntry = entries.get(new Random().nextInt(entries.size()));
        }

        for (String foodName : foodNames) {
            System.out.println("   - " + foodName);
        }
    }
}
