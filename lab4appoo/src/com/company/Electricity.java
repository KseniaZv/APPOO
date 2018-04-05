package com.company;

public class Electricity extends UtilityPayments implements IPrintable {

    private double tariffForElectricity;
    private double electricityAllowance; //nadbavka
    private double standardForElectricity;
    private int numberOfRegisteredInFlat;

    public float calculate() {

        return (float) ((getTariffForElectricity() + (getElectricityAllowance() * 1.18)) * (getStandardForElectricity() * getNumberOfRegisteredInFlat()) + (getStandardForElectricity() * getNumberOfRegisteredInFlat()));
    }

    @Override
    public void print(Object payment) {

        System.out.println("\nPayment for Electricity: " + payment);
    }

    public double getTariffForElectricity() {

        return tariffForElectricity;

    }

    public void setTariffForElectricity(double newTariffForElectricity) {

        tariffForElectricity = newTariffForElectricity;
    }

    public double getElectricityAllowance() {

        return electricityAllowance;
    }

    public void setElectricityAllowance(double newElectricityAllowance) {

        electricityAllowance = newElectricityAllowance;

    }

    public double getStandardForElectricity() {

        return standardForElectricity;

    }

    public void setStandardForElectricity(double newStandardForElectricity) {

        standardForElectricity = newStandardForElectricity;
    }

    public int getNumberOfRegisteredInFlat() {

        return numberOfRegisteredInFlat;
    }

    public void setNumberOfRegisteredInFlat(int newNumberOfRegisteredInFlat) {

        numberOfRegisteredInFlat = newNumberOfRegisteredInFlat;

    }

}
