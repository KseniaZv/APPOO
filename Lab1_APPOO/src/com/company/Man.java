package com.company;

public class Man extends Human {

    @Override
    public void BMR(){

        int BMR;
        BMR = (int)(88.36+(13.4*getWeight())+(4.8*getHeight())-(5.7*getAge()));
        System.out.println("\n Man's Basal Metabolic Rate is: " + BMR);

    }
}
