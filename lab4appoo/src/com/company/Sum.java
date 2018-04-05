package com.company;

import java.util.ArrayList;

public class Sum implements IPrintable{

    public float sumOfArrayValues(ArrayList<Float> payment) {
        float sum = 0;
        for(float value : payment)
            sum += value;
        return sum;
    }

    @Override
    public void print(Object totalPayment) {
        System.out.println("\n--------------------------------------");
        System.out.println("\nTotal Utility Payment: " + totalPayment);
    }
}
