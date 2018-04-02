package com.company;

public class Electricity extends UtilityPayments {
    double electricityAllowance; //nadbavka

    Electricity() {
        super.m_type = 2;
    }


    public double getElectricityAllowance() {
        return electricityAllowance;
    }

    public void setElectricityAllowance(double newElectricityAllowance) {
        electricityAllowance = newElectricityAllowance;
    }
}
