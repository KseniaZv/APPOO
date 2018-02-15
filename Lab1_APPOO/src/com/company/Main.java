package com.company;

public class Main {

    public static void main(String[] args) {

        Man man = new Man();

        man.setWeight(88);
        man.setHeight(180);
        man.setAge(30);

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

        woman.setWeight(61);
        woman.setHeight(168);
        woman.setAge(44);

        System.out.println("Woman's Basal Metabolic Rate is: " + woman.BMR() + "\n" );

        System.out.println("Menu for a Woman: \n" );

        MealFactory mealFactoryW = new MealFactory();

        Meal meal_1w = mealFactoryW.getMeal("BREAKFAST");
        meal_1w.eat(man.BMR());

        Meal meal_2w = mealFactoryW.getMeal("DINNER");
        meal_2w.eat(man.BMR());

        Meal meal_3w = mealFactoryW.getMeal("SNACK");
        meal_3w.eat(man.BMR());

        Meal meal_4w = mealFactoryW.getMeal("SUPPER");
        meal_4w.eat(man.BMR());

    }
}
