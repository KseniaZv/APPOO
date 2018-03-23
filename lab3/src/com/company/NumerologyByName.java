package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NumerologyByName extends Numerology implements IPrintable {

    @Override
    public void print(Object destinyNumber) {
        System.out.println("Your destiny number by name and surname is: " + destinyNumber);
    }

    ArrayList<Integer> splitNumber(int day, int month, int year){
        throw new UnsupportedOperationException();
    }

}
