package com.company;

public class Drainage extends UtilityPayments implements IPrintable {

    private double tariffForDrainage;
    private double drainageAllowance;
    private double standardForDrainage;
    private int numberOfRegisteredInFlat;

    public float calculate() {

        return (float) (((getTariffForDrainage() * 1.18) + (getDrainageAllowance() * 1.18)) * getStandardForDrainage() * getNumberOfRegisteredInFlat());
    }

    @Override
    public void print(Object payment) {

        System.out.println("\nPayment for Drainage: " + payment);
    }

    public double getTariffForDrainage() {

        return tariffForDrainage;

    }

    public void setTariffForDrainage(double newTariffForDrainage) {

        tariffForDrainage = newTariffForDrainage;
    }

    public double getStandardForDrainage() {

        return standardForDrainage;

    }

    public double getDrainageAllowance() {

        return drainageAllowance;
    }

    public void setDrainageAllowance(double newDrainageAllowance) {

        drainageAllowance = newDrainageAllowance;
    }

    public void setStandardForDrainage(double newStandardForDrainage) {

        standardForDrainage = newStandardForDrainage;
    }

    public int getNumberOfRegisteredInFlat() {

        return numberOfRegisteredInFlat;
    }

    public void setNumberOfRegisteredInFlat(int newNumberOfRegisteredInFlat) {

        numberOfRegisteredInFlat = newNumberOfRegisteredInFlat;

    }

}
