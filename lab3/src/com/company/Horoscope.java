package com.company;

import java.util.Random;

class Horoscope {

    Zodiac zodiac = new Zodiac();

    String defineHoroscope() {

        String[] horoscope = {
                "A healthy body will benefit you for life.",
                "Anxiety won't help your problems.",
                "Avoid negative people to stay positive.",
                "Don't wait for success to come - go find it!",
                "Pay attention to your family. Don't take them for granted.",
                "Things may seem much worse than they are.",
                "Stop procrastinating. Make a decision already.",
                "You have good reason to be self-confident.",
                "Everything will work out for the best.",
                "Someone thinks the world of you.",
                "Open your mind and your heart to good things.",
                "Lead by example, not by words alone.",
                "Happiness may be right under your nose.",
                "Worry does not beget change.",
                "You will do well to advance your career.",
                "Take care of yourself first. Then help others.",
                "Learn how to do something new today."
        };

        int horoscopeMakeRandomIndex = new Random().nextInt(horoscope.length);
        return horoscope[horoscopeMakeRandomIndex];
    }

    void printHoroscope(int day, int month, String horoscope) {

        System.out.println("\nToday's Horoscope for " + zodiac.defineZodiac(day, month) + ": \n" + "    " + horoscope + "\n");

    }
}
