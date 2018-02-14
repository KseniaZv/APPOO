package com.company;

public class Woman extends Human {

    @Override
    public int BMR(){

        return (int) (447.6+(9.2*getWeight())+(3.1*getHeight())-(4.3*getAge()));

    }
}
