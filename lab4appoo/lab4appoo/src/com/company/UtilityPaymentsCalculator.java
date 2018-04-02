package com.company;

public class UtilityPaymentsCalculator {

    public void calculateUtilityPayments(UtilityPayments s) {
        if (s.m_type==1)
            calculateDrainage((Drainage) s);
        else if (s.m_type==2)
            calculateElectricity((Electricity) s);
        else if (s.m_type==3)
            calculateGasSupply((GasSupply) s);
        else if (s.m_type==4)
            calculateHeating((Heating) s);
        else if (s.m_type==5)
            calculateColdWaterSupply((ColdWaterSupply) s);
        else if (s.m_type==6)
            calculateHotWaterSupply((HotWaterSupply) s);
    }

    public float calculateDrainage(Drainage r) {
        System.out.println("\nDrainage: " + (r.getTariff() * 1.18) + (r.getDrainageAllowance() * 1.18 * r.getStandard() * r.getNumberOfRegisteredInFlat()));
        return (float) ((r.getTariff() * 1.18) + (r.getDrainageAllowance() * 1.18 * r.getStandard() * r.getNumberOfRegisteredInFlat()));
    }

    public float calculateElectricity(Electricity r) {
        System.out.println("\nElectricity: " + (r.getTariff() + (r.getElectricityAllowance() * 1.18 * r.getStandard() * r.getNumberOfRegisteredInFlat())));
        return (float) (r.getTariff() + (r.getElectricityAllowance() * 1.18 * r.getStandard() * r.getNumberOfRegisteredInFlat()));
    }

    public float calculateGasSupply(GasSupply r) {
        System.out.println("\nGasSupply: " + (r.getTariff() * r.getStandard() * r.getNumberOfRegisteredInFlat()));
        return (float) (r.getTariff() * r.getStandard() * r.getNumberOfRegisteredInFlat());
    }

    public float calculateHeating(Heating  r) {
        System.out.println("\nHeating: " + (r.getTariff() * 1.18 * r.getStandard() * r.getFlatArea()));
        return (float) (r.getTariff() * 1.18 * r.getStandard() * r.getFlatArea());
    }

    public float calculateColdWaterSupply(ColdWaterSupply  r) {
        System.out.println("\nColdWaterSupply: " + (r.getTariff() * 1.18) + (r.getColdWaterAllowance() * 1.18 * r.getStandard() * r.getNumberOfRegisteredInFlat()));
        return (float) ((r.getTariff() * 1.18) + (r.getColdWaterAllowance() * 1.18 * r.getStandard() * r.getNumberOfRegisteredInFlat()));
    }

    public float calculateHotWaterSupply(HotWaterSupply  r) {
        System.out.println("\nHotWaterSupply: " + (r.getTariff() * 1.18 * r.getStandard() * r.getNumberOfRegisteredInFlat()));
        return (float) (r.getTariff() * 1.18 * r.getStandard() * r.getNumberOfRegisteredInFlat());
    }

}
