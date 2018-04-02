package com.company;

public class UtilityPayments {
    int m_type;

    double tariff;
    double standard;
    int numberOfRegisteredInFlat;

    public double getTariff() {
        return tariff;
    }

    public void setTariff(double newTariff) {
        tariff = newTariff;
    }

    public double getStandard() {
        return standard;
    }

    public void setStandard(double newStandard) {
        standard = newStandard;
    }

    public int getNumberOfRegisteredInFlat() {
        return numberOfRegisteredInFlat;
    }

    public void setNumberOfRegisteredInFlat(int newNumberOfRegisteredInFlat) {
        numberOfRegisteredInFlat = newNumberOfRegisteredInFlat;
    }

}
