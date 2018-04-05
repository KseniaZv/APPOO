package com.company;

public class ColdWaterSupply extends UtilityPayments implements IPrintable {

    private double tariffForColdWater;
    private double standardForColdWater;
    private double coldWaterAllowance; //nadbavka
    private int numberOfRegisteredInFlat;

    @Override
    public float calculate() {

        return (float) (((getTariffForColdWater() * 1.18) + (getColdWaterAllowance() * 1.18)) * getStandardForColdWater() * getNumberOfRegisteredInFlat());
    }

    public void print(Object payment) {

        System.out.println("\nPayment for ColdWaterSupply: " + payment);
    }

    public double getTariffForColdWater() {

        return tariffForColdWater;

    }

    public void setTariffForColdWater(double newTariffForColdWater) {

        tariffForColdWater = newTariffForColdWater;
    }

    public double getStandardForColdWater() {

        return standardForColdWater;

    }

    public void setStandardForColdWater(double newStandardForColdWater) {

        standardForColdWater = newStandardForColdWater;
    }

    public int getNumberOfRegisteredInFlat() {

        return numberOfRegisteredInFlat;
    }

    public void setNumberOfRegisteredInFlat(int newNumberOfRegisteredInFlat) {

        numberOfRegisteredInFlat = newNumberOfRegisteredInFlat;

    }

    public double getColdWaterAllowance() {

        return coldWaterAllowance;
    }

    public void setColdWaterAllowance(double newColdWaterAllowance) {

        coldWaterAllowance = newColdWaterAllowance;
    }

}
