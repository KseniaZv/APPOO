package com.company;

public class Payment implements IPrintable{

    private float nominal;
    private String name;

    public int compare(float totalPayment, float usersMoney){

        int compareValue;

        if (totalPayment < usersMoney)
            compareValue = 1;

        else if (totalPayment > usersMoney)
            compareValue = -1;

        else
            compareValue = 0;

        return compareValue;
    }

    public float getNominal() {

        return nominal;

    }

    public void setNominal(float newNominal) {

        nominal = newNominal;
    }

    public String getName() {

        return name;

    }

    public void setName(String newName) {

        name = newName;
    }

    @Override
    public void print(Object compareValue) {

        int intCompareValue = (Integer) compareValue;

        if (intCompareValue == 1) {
            System.out.println("\nYou have much more than enough money to pay for utilities\n");
        } else if (intCompareValue == -1) {
            System.out.println("\nYou don't have enough money to pay for utilities\n");
        } else {
            System.out.println("\nYou have the exact amount of money  to pay for utilities\n");
        }
    }

    public void showMoneyDifference(float totalPayment, float usersMoney, String name) {

        if(totalPayment < usersMoney){
            System.out.println("Your rest is " + (Math.round((usersMoney - totalPayment) * 100.0) / 100.0) + " " + name);
        }
        else if(totalPayment > usersMoney){
            System.out.println("You have to add " + (Math.round((totalPayment - usersMoney) * 100.0) / 100.0) + " " + name);
        }
        else{
            System.out.println("Thank you! Current balance is " + (Math.round((totalPayment - usersMoney) * 100.0) / 100.0) + " " + name);
        }

    }
}
