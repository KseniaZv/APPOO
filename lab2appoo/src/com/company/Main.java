package com.company;

import static com.company.GetFoodNames.getFoodNames;

public class Main {

    public static void main(String[] args) {

        FoodForBreakfast foodForBreakfast = new FoodForBreakfast();
        foodForBreakfast.print(foodForBreakfast.productsSelection());

        FoodForDinner foodForDinner = new FoodForDinner();
        foodForDinner.print(foodForDinner.productsSelection());

        FoodForSnack foodForSnack = new FoodForSnack();
        foodForSnack.print(foodForSnack.productsSelection());

        FoodForSupper foodForSupper = new FoodForSupper();
        foodForSupper.print(foodForSupper.productsSelection());

        Man man = new Man();

        man.setWeight(83);
        man.setHeight(180);
        man.setAge(20);

        System.out.println("Man's Basal Metabolic Rate is: " + man.basalMetabolicRateCalculator() + "\n");

        System.out.println("Menu for a Man: \n" );

        MealFactory mealFactoryForMan = new MealFactory();

        //get an object of Breakfast and call its caloriesCalculation method.
        IMeal breakfastForMan = mealFactoryForMan.getMeal("BREAKFAST");
        //call caloriesCalculation method of Breakfast
        breakfastForMan.printCalories(man.basalMetabolicRateCalculator());
        getFoodNames(foodForBreakfast.productsSelection(), breakfastForMan.caloriesCalculation(man.basalMetabolicRateCalculator()));


        IMeal dinnerForMan = mealFactoryForMan.getMeal("DINNER");
        dinnerForMan.printCalories(man.basalMetabolicRateCalculator());
        getFoodNames(foodForDinner.productsSelection(), dinnerForMan.caloriesCalculation(man.basalMetabolicRateCalculator()));

        IMeal snackForMan = mealFactoryForMan.getMeal("SNACK");
        snackForMan.printCalories(man.basalMetabolicRateCalculator());
        getFoodNames(foodForSnack.productsSelection(), snackForMan.caloriesCalculation(man.basalMetabolicRateCalculator()));

        IMeal supperForMan = mealFactoryForMan.getMeal("SUPPER");
        supperForMan.printCalories(man.basalMetabolicRateCalculator());
        getFoodNames(foodForSupper.productsSelection(), supperForMan.caloriesCalculation(man.basalMetabolicRateCalculator()));

        AdviceForMan adviceForMan = new AdviceForMan();
        adviceForMan.print(adviceForMan.getAdvice());

        System.out.println();
        System.out.println();

        Woman woman = new Woman();

        woman.setWeight(65);
        woman.setHeight(175);
        woman.setAge(21);

        System.out.println("Woman's Basal Metabolic Rate is: " + woman.basalMetabolicRateCalculator() + "\n" );

        System.out.println("Menu for a Woman: \n" );

        MealFactory mealFactoryForWoman = new MealFactory();

        IMeal breakfastForWoman = mealFactoryForWoman.getMeal("BREAKFAST");
        breakfastForWoman.printCalories(woman.basalMetabolicRateCalculator());
        getFoodNames(foodForBreakfast.productsSelection(), breakfastForWoman.caloriesCalculation(woman.basalMetabolicRateCalculator()));


        IMeal dinnerForWoman = mealFactoryForWoman.getMeal("DINNER");
        dinnerForWoman.printCalories(woman.basalMetabolicRateCalculator());
        getFoodNames(foodForDinner.productsSelection(), dinnerForWoman.caloriesCalculation(woman.basalMetabolicRateCalculator()));

        IMeal snackForWoman = mealFactoryForWoman.getMeal("SNACK");
        snackForWoman.printCalories(woman.basalMetabolicRateCalculator());
        getFoodNames(foodForSnack.productsSelection(), snackForWoman.caloriesCalculation(woman.basalMetabolicRateCalculator()));

        IMeal supperForWoman = mealFactoryForWoman.getMeal("SUPPER");
        supperForWoman.printCalories(woman.basalMetabolicRateCalculator());
        getFoodNames(foodForSupper.productsSelection(), supperForWoman.caloriesCalculation(woman.basalMetabolicRateCalculator()));

        AdviceForWoman adviceForWoman = new AdviceForWoman();
        adviceForWoman.print(adviceForWoman.getAdvice());

    }
}
