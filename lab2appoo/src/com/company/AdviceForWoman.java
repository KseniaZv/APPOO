package com.company;

import java.util.Random;

public class AdviceForWoman implements IAdvice, IPrintable {

    @Override
    public String getAdvice(){

        String[] advice = {
                "Stop dieting",
                "Get more sleep",
                "Get a great workout in 10 minutes",
                "Make anyone laugh (including yourself)",
                "Drink purer water",
                "Know your survival dish"
        };

        int adviceMakeRandomIndex = new Random().nextInt(advice.length);
        return advice[adviceMakeRandomIndex];
    }

    @Override
    public void print(Object foodForBreakfast){

        System.out.println("\nUseful advice for Woman: " + foodForBreakfast + "\n");

    }
}
