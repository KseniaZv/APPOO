package com.company;

import java.util.Random;

public class AdviceForMan implements IAdvice, IPrintable {

    @Override
    public String getAdvice(){

        String[] advice = {
                "Start a heart-healthy diet and exercise plan",
                "Prioritize sleep",
                "De-stress your life",
                "Drink Green Tea, The Wonder Liquid",
                "Eat the Bacon",
                "Drink Chocolate Milk"
        };

        int adviceMakeRandomIndex = new Random().nextInt(advice.length);
        return advice[adviceMakeRandomIndex];
    }

    @Override
    public void print(Object foodForBreakfast) {

        System.out.println("\nUseful advice for Man: " + foodForBreakfast + "\n");

    }
}
