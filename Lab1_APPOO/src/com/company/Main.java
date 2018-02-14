package com.company;

public class Main {

    public static void main(String[] args) {

        Man man = new Man();
        Woman woman = new Woman();

        man.setWeight(80);
        man.setHeight(190);
        man.setAge(36);

        woman.setWeight(61);
        woman.setHeight(168);
        woman.setAge(44);

        System.out.println("\n Man's Basal Metabolic Rate is: " + man.BMR());
        System.out.println("\n Woman's Basal Metabolic Rate is: " + woman.BMR());

        MealFactory mealFactory = new MealFactory();

        //get an object of Breakfast and call its eat method.
        Meal meal_1 = mealFactory.getMeal("BREAKFAST");

        //call eat method of Breakfast
        meal_1.eat();

        Meal meal_2 = mealFactory.getMeal("DINNER");
        meal_2.eat();

        Meal meal_3 = mealFactory.getMeal("SNACK");
        meal_3.eat();

        Meal meal_4 = mealFactory.getMeal("SUPPER");
        meal_4.eat();

    }
}
