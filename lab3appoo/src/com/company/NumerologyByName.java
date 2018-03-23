package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NumerologyByName extends Numerology implements IPrintable {

    ArrayList<String> splitString(String name, String surname){

        ArrayList<String> characters = new ArrayList<>();

        String [] stringNameArray = name.split("");
        for(String character : stringNameArray){
            characters.add(character);
        }

        String [] stringSurnameArray = surname.split("");
        for(String character : stringSurnameArray){
            characters.add(character);
        }

        return characters;
    }

    Map<String, Integer> characterValue() {

        Map<String,Integer> characterValue = new HashMap<>();

        characterValue.put("a", 1);
        characterValue.put("j", 1);
        characterValue.put("s", 1);
        characterValue.put("b", 2);
        characterValue.put("k", 2);
        characterValue.put("t", 2);
        characterValue.put("c", 3);
        characterValue.put("l", 3);
        characterValue.put("u", 3);
        characterValue.put("d", 4);
        characterValue.put("m", 4);
        characterValue.put("v", 4);
        characterValue.put("e", 5);
        characterValue.put("n", 5);
        characterValue.put("w", 5);
        characterValue.put("f", 6);
        characterValue.put("o", 6);
        characterValue.put("x", 6);
        characterValue.put("g", 7);
        characterValue.put("p", 7);
        characterValue.put("y", 7);
        characterValue.put("h", 8);
        characterValue.put("q", 8);
        characterValue.put("z", 8);
        characterValue.put("i", 9);
        characterValue.put("r", 9);

        return characterValue;
    }

    ArrayList<Integer> characterToNumberConverter(ArrayList<String> characters,  Map<String, Integer> characterValue){

        ArrayList<Integer> numbers = new ArrayList<>();

        for (String character : characters)
          numbers.add(characterValue.get(character));

        return numbers;
    }

    @Override
    public void print(Object destinyNumber) {
        System.out.println("Your destiny number by name and surname is: " + destinyNumber);
    }

}
