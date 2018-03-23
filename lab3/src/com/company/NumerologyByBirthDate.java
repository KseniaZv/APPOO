package com.company;

import java.util.ArrayList;

class NumerologyByBirthDate extends Numerology implements IPrintable {

    ArrayList<Integer> splitNumber(int day, int month, int year){

        ArrayList<Integer> numbers = new ArrayList<>();

        while (day > 0) {
            numbers.add(day % 10);
            day = day / 10;
        }

        while (month > 0) {
            numbers.add(month % 10);
            month = month / 10;
        }

        while (year > 0) {
            numbers.add(year % 10);
            year = year / 10;
        }

        return numbers;
    }


    @Override
    public void print(Object destinyNumber) {
        System.out.println("Your destiny number by birth date is: " + destinyNumber);
    }
}
