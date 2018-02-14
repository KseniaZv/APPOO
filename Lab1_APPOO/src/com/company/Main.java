package com.company;

public class Main {

    public static void main(String[] args) {

        Man man = new Man();
        Woman woman = new Woman();

        man.setWeight(88);
        man.setHeight(180);
        man.setAge(30);

        woman.setWeight(61);
        woman.setHeight(168);
        woman.setAge(44);

        System.out.println("Man's Basal Metabolic Rate is: " + man.BMR() + "\n");
        System.out.println("Woman's Basal Metabolic Rate is: " + woman.BMR() + "\n" );

        System.out.println("Menu for a Man: \n" );

        MealFactory mealFactory = new MealFactory();

        //get an object of Breakfast and call its eat method.
        Meal meal_1 = mealFactory.getMeal("BREAKFAST");

        //call eat method of Breakfast
        meal_1.eat(man.BMR());

        Meal meal_2 = mealFactory.getMeal("DINNER");
        meal_2.eat(man.BMR());

        Meal meal_3 = mealFactory.getMeal("SNACK");
        meal_3.eat(man.BMR());

        Meal meal_4 = mealFactory.getMeal("SUPPER");
        meal_4.eat(man.BMR());

    }
}
