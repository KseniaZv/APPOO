package com.company;

import java.util.ArrayList;
import java.util.Map;

class NumerologyByBirthDate extends Numerology implements IPrintable {

    @Override
    public void print(Object destinyNumber) {
        System.out.println("Your destiny number by birth date is: " + destinyNumber);
    }

    ArrayList<String> splitString(String name, String surname){
        throw new UnsupportedOperationException();
    }

    ArrayList<Integer> characterToNumberConverter(ArrayList<String> characters,  Map<String, Integer> characterValue){
        throw new UnsupportedOperationException();
    }

    Map<String, Integer> characterValue() {
        throw new UnsupportedOperationException();
    }
}
