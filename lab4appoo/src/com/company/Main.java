package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

	ArrayList<Float> totalPayment = new ArrayList<>();
	Round roundValue = new Round();

	UtilityPaymentsCalculator calc = new UtilityPaymentsCalculator();

	ColdWaterSupply coldWater = new ColdWaterSupply();
	coldWater.setTariffForColdWater(9.15);
	coldWater.setStandardForColdWater(5.472);
	coldWater.setColdWaterAllowance(0.41);
	coldWater.setNumberOfRegisteredInFlat(2);
	coldWater.print(roundValue.round((Float) calc.calculateUtilityPayments(coldWater)));
	totalPayment.add((Float) calc.calculateUtilityPayments(coldWater));

	Drainage drainage = new Drainage();
	drainage.setTariffForDrainage(7.38);
	drainage.setStandardForDrainage(8.982);
	drainage.setDrainageAllowance(1.03);
	drainage.setNumberOfRegisteredInFlat(2);
	drainage.print(roundValue.round((Float) calc.calculateUtilityPayments(drainage)));
	totalPayment.add((Float) calc.calculateUtilityPayments(drainage));

	Electricity electricity = new Electricity();
	electricity.setTariffForElectricity(2.28);
	electricity.setStandardForElectricity(67);
	electricity.setElectricityAllowance(0.006);
	electricity.setNumberOfRegisteredInFlat(2);
	electricity.print(roundValue.round((Float) calc.calculateUtilityPayments(electricity)));
	totalPayment.add((Float) calc.calculateUtilityPayments(electricity));

	GasSupply gas = new GasSupply();
	gas.setGasPrice(21.30);
	gas.setStandardForGas(6);
	gas.setNumberOfRegisteredInFlat(2);
	gas.print(roundValue.round((Float) calc.calculateUtilityPayments(gas)));
	totalPayment.add((Float) calc.calculateUtilityPayments(gas));

	Heating heating = new Heating();
	heating.setTariffForHeating(570.73);
	heating.setStandardForHeating(0.0209);
	heating.setFlatArea(50);
	heating.print(roundValue.round((Float) calc.calculateUtilityPayments(heating)));
	totalPayment.add((Float) calc.calculateUtilityPayments(heating));

	HotWaterSupply hotWater = new HotWaterSupply();
	hotWater.setTariffForHotWater(36.40);
	hotWater.setStandardForHotWater(3.510);
	hotWater.setNumberOfRegisteredInFlat(2);
	hotWater.print(roundValue.round((Float) calc.calculateUtilityPayments(hotWater)));
	totalPayment.add((Float) calc.calculateUtilityPayments(hotWater));

	Sum totalUtilityPayment = new Sum();
	totalUtilityPayment.print(roundValue.round(totalUtilityPayment.sumOfArrayValues(totalPayment)));

	Payment payment = new Payment();
	payment.setNominal(2500);
	payment.setName("rubles");
	payment.print(payment.compare((float) roundValue.round(totalUtilityPayment.sumOfArrayValues(totalPayment)), payment.getNominal()));
    payment.showMoneyDifference((float) roundValue.round(totalUtilityPayment.sumOfArrayValues(totalPayment)), payment.getNominal(), payment.getName());

    }
}
