package com.company;

public class GasSupply extends UtilityPayments implements IPrintable {

    private double gasPrice;
    private double standardForGas;
    private int numberOfRegisteredInFlat;

    public float calculate() {

        return (float) (getGasPrice() * getStandardForGas() * getNumberOfRegisteredInFlat());
    }

    @Override
    public void print(Object payment) {

        System.out.println("\nPayment for GasSupply: " + payment);
    }

    public double getGasPrice() {

        return gasPrice;

    }

    public void setGasPrice(double newGasPrice) {

        gasPrice = newGasPrice;
    }

    public double getStandardForGas() {

        return standardForGas;

    }

    public void setStandardForGas(double newStandardForGas) {

        standardForGas = newStandardForGas;
    }

    public int getNumberOfRegisteredInFlat() {

        return numberOfRegisteredInFlat;

    }

    public void setNumberOfRegisteredInFlat(int newNumberOfRegisteredInFlat) {

        numberOfRegisteredInFlat = newNumberOfRegisteredInFlat;

    }
}
