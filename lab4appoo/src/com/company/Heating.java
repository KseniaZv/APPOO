package com.company;

public class Heating extends UtilityPayments implements IPrintable {

    private double tariffForHeating;
    private double standardForHeating;
    private float flatArea;

    public float calculate() {

        return (float) (getTariffForHeating() * 1.18 * getStandardForHeating() * getFlatArea());
    }

    @Override
    public void print(Object payment) {

        System.out.println("\nPayment for Heating: " + payment);
    }

    public double getTariffForHeating() {

        return tariffForHeating;

    }

    public void setTariffForHeating(double newTariffForHeating) {

        tariffForHeating = newTariffForHeating;
    }

    public double getStandardForHeating() {

        return standardForHeating;

    }

    public void setStandardForHeating(double newStandardForHeating) {

        standardForHeating = newStandardForHeating;
    }

    public float getFlatArea() {

        return flatArea;
    }

    public void setFlatArea(float newFlatArea) {

        flatArea = newFlatArea;
    }
}
