package com.company;

public class HotWaterSupply extends UtilityPayments implements IPrintable{

    private double tariffForHotWater;
    private double standardForHotWater;
    private int numberOfRegisteredInFlat;

    public float calculate() {

        return (float) (getTariffForHotWater() * 1.18 * getStandardForHotWater() * getNumberOfRegisteredInFlat());

    }

    @Override
    public void print(Object payment) {

        System.out.println("\nPayment for HotWaterSupply: " + payment);
    }

    public double getTariffForHotWater() {

        return tariffForHotWater;

    }

    public void setTariffForHotWater(double newTariffForHotWater) {

        tariffForHotWater = newTariffForHotWater;
    }

    public double getStandardForHotWater() {

        return standardForHotWater;

    }

    public void setStandardForHotWater(double newStandardForHotWater) {

        standardForHotWater = newStandardForHotWater;
    }

    public int getNumberOfRegisteredInFlat() {

        return numberOfRegisteredInFlat;

    }

    public void setNumberOfRegisteredInFlat(int newNumberOfRegisteredInFlat) {

        numberOfRegisteredInFlat = newNumberOfRegisteredInFlat;

    }
}
