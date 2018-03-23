package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Numerology {

    int sumOfArrayDigits(ArrayList<Integer> numbers) {

        int sum = 0;
        for (int number : numbers)
            sum += number;
        return sum;
    }

    int sumOfDigits(int sum) {

        int sumOfDigits = 0;
        while (sum > 0) {
            sumOfDigits = sumOfDigits + sum % 10;
            sum = sum / 10;
        }

        sumOfDigits = (sumOfDigits < 10) ? sumOfDigits : sumOfDigits(sumOfDigits);
        return sumOfDigits;
    }

    void destinyNumberDescription(int number) {

        Map<Integer, String> destinyNumber = new HashMap<>();

        destinyNumber.put(1, "People with this number should strive to be leaders. They need to be the one who take initiative and take control." +
                "These people think for themselves and do not automatically follow the crowd.");
        destinyNumber.put(2, "People with this number are team players. These are typically diplomats and have special abilities to create harmony.");
        destinyNumber.put(3, "People with this number are very inspirational to others. They are positive and enthusiastic. " +
                "They master the art of bringing out the best in others.");
        destinyNumber.put(4, "People with the destiny number four are called to maintain order and security. " +
                "This is about organizing and building something that will last for a long time. These people work hard.");
        destinyNumber.put(5, "These people should have freedom. Their destiny is to explore, discover new things and embrace change.");
        destinyNumber.put(6, "These people are meant to love and care for their closest family and friends. They see the needs of others and do something about it.");
        destinyNumber.put(7, "This is about going into to depth of whatever you are researching. Perfection is another virtue of the number 7. " +
                "This person is to find wisdom and share that wisdom with others.");
        destinyNumber.put(8, "This person should have success in business. It is all about authority and power. This is a road towards material wealth brought about with integrity.");
        destinyNumber.put(9, "These people need to generously reach out to the world and work to unite, heal or help in whatever manner possible. " +
                "This is unconditional love that goes far beyond the immediate family.");

        String value = destinyNumber.get(number);
        System.out.println("    " + value + "\n");
    }
}
