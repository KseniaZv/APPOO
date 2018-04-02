package com.company;

public class Drainage extends UtilityPayments {
    double drainageAllowance;

    Drainage() {
        super.m_type = 1;
    }

    public double getDrainageAllowance() {
        return drainageAllowance;
    }

    public void setDrainageAllowance(double newDrainageAllowance) {
        drainageAllowance = newDrainageAllowance;
    }
}
