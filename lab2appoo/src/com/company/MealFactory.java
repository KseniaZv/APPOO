package com.company;

public class MealFactory {

    //use getMeal method to get object of type meal
    public IMeal getMeal(String mealType){
        if(mealType == null){
            return null;
        }
        if(mealType.equalsIgnoreCase("BREAKFAST")){
            return new Breakfast();

        } else if(mealType.equalsIgnoreCase("DINNER")){
            return new Dinner();

        } else if(mealType.equalsIgnoreCase("SNACK")){
            return new Snack();

        } else if(mealType.equalsIgnoreCase("SUPPER")){
            return new Supper();
        }

        return null;
    }


}
