package com.company;

public class Heating extends UtilityPayments {
    float flatArea;

    Heating() {
        super.m_type = 4;
    }

    public float getFlatArea() {
        return flatArea;
    }

    public void setFlatArea(float newFlatArea) {
        flatArea = newFlatArea;
    }
}
