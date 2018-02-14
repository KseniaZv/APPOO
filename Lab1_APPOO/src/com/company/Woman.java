package com.company;

public class Woman extends Human {

    @Override
    public void BMR(){

        int BMR;
        BMR =  (int) (447.6+(9.2*getWeight())+(3.1*getHeight())-(4.3*getAge()));
        System.out.println("\n Woman's Basal Metabolic Rate is: " + BMR);
    }
}
