package com.company;

public class Main {

    public static void main(String[] args) {

        Person girl = new Person();

        girl.setDay(15);
        girl.setMonth(11);
        girl.setYear(1990);
        girl.setName("blair");
        girl.setSurname("waldorf");

        Zodiac girlsZodiac = new Zodiac();
        girlsZodiac.print(girlsZodiac.defineZodiac(girl.getDay(), girl.getMonth()));

        Horoscope horoscopeForGirl = new Horoscope();
        horoscopeForGirl.printHoroscope(girl.getDay(), girl.getMonth(), horoscopeForGirl.defineHoroscope());

        NumerologyByBirthDate numGirl = new NumerologyByBirthDate();
        numGirl.print(numGirl.sumOfDigits(numGirl.sumOfArrayDigits(numGirl.splitNumber(girl.getDay(), girl.getMonth(),girl.getYear()))));
        numGirl.destinyNumberDescription(numGirl.sumOfDigits(numGirl.sumOfArrayDigits(numGirl.splitNumber(girl.getDay(), girl.getMonth(),girl.getYear()))));

        NumerologyByName nameGirl = new NumerologyByName();
        nameGirl.print(nameGirl.sumOfDigits(nameGirl.sumOfArrayDigits(nameGirl.characterToNumberConverter(nameGirl.splitString(girl.getName(), girl.getSurname()), nameGirl.characterValue()))));
        nameGirl.destinyNumberDescription(nameGirl.sumOfDigits(nameGirl.sumOfArrayDigits(nameGirl.characterToNumberConverter(nameGirl.splitString(girl.getName(), girl.getSurname()), nameGirl.characterValue()))));

        Person boy = new Person();

        boy.setDay(19);
        boy.setMonth(1);
        boy.setYear(1991);
        boy.setName("charles");
        boy.setSurname("bass");

        Zodiac boyZodiac = new Zodiac();
        boyZodiac.print(boyZodiac.defineZodiac(boy.getDay(), boy.getMonth()));

        Horoscope horoscopeForBoy = new Horoscope();
        horoscopeForBoy.printHoroscope(boy.getDay(), boy.getMonth(), horoscopeForBoy.defineHoroscope());

        NumerologyByBirthDate numBoy = new NumerologyByBirthDate();
        numBoy.print(numBoy.sumOfDigits(numBoy.sumOfArrayDigits(numBoy.splitNumber(boy.getDay(), boy.getMonth(),boy.getYear()))));
        numBoy.destinyNumberDescription(numBoy.sumOfDigits(numBoy.sumOfArrayDigits(numBoy.splitNumber(boy.getDay(), boy.getMonth(),boy.getYear()))));

        NumerologyByName nameBoy = new NumerologyByName();
        nameBoy.print(nameBoy.sumOfDigits(nameBoy.sumOfArrayDigits(nameBoy.characterToNumberConverter(nameBoy.splitString(boy.getName(), boy.getSurname()), nameBoy.characterValue()))));
        nameBoy.destinyNumberDescription(nameBoy.sumOfDigits(nameBoy.sumOfArrayDigits(nameBoy.characterToNumberConverter(nameBoy.splitString(boy.getName(), boy.getSurname()), nameBoy.characterValue()))));

    }
}
