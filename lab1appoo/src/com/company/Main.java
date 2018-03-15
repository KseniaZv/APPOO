package com.company;

public class Main {

    public static void main(String[] args) {

        Man man = new Man();

        man.setWeight(83);
        man.setHeight(180);
        man.setAge(20);

        System.out.println("Man's Basal Metabolic Rate is: " + man.BMR() + "\n");

        System.out.println("Menu for a Man: \n" );

        MealFactory mealFactoryM = new MealFactory();

        //get an object of Breakfast and call its eat method.
        Meal meal_1m = mealFactoryM.getMeal("BREAKFAST");

        //call eat method of Breakfast
        meal_1m.eat(man.BMR());

        Meal meal_2m = mealFactoryM.getMeal("DINNER");
        meal_2m.eat(man.BMR());

        Meal meal_3m = mealFactoryM.getMeal("SNACK");
        meal_3m.eat(man.BMR());

        Meal meal_4m = mealFactoryM.getMeal("SUPPER");
        meal_4m.eat(man.BMR());

        System.out.println();
        System.out.println();

        Woman woman = new Woman();

        woman.setWeight(65);
        woman.setHeight(175);
        woman.setAge(21);

        System.out.println("Woman's Basal Metabolic Rate is: " + woman.BMR() + "\n" );

        System.out.println("Menu for a Woman: \n" );

        MealFactory mealFactoryW = new MealFactory();

        Meal meal_1w = mealFactoryW.getMeal("BREAKFAST");
        meal_1w.eat(woman.BMR());

        Meal meal_2w = mealFactoryW.getMeal("DINNER");
        meal_2w.eat(woman.BMR());

        Meal meal_3w = mealFactoryW.getMeal("SNACK");
        meal_3w.eat(woman.BMR());

        Meal meal_4w = mealFactoryW.getMeal("SUPPER");
        meal_4w.eat(woman.BMR());

    }
}
