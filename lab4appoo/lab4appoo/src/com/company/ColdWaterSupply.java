package com.company;

public class ColdWaterSupply extends UtilityPayments {
    double coldWaterAllowance; //nadbavka

    ColdWaterSupply() {
        super.m_type = 5;
    }


    public double getColdWaterAllowance() {
        return coldWaterAllowance;
    }

    public void setColdWaterAllowance(double newColdWaterAllowance) {
        coldWaterAllowance = newColdWaterAllowance;
    }
}
