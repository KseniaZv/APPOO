package com.company;

public class Main {

    public static void main(String[] args) {

	ColdWaterSupply coldWater = new ColdWaterSupply();
	Drainage drainage = new Drainage();
	Electricity electricity = new Electricity();
	GasSupply gas = new GasSupply();
	Heating heating = new Heating();
	HotWaterSupply hotWater = new HotWaterSupply();

	coldWater.setTariff(9.15);
	coldWater.setStandard(5.472);
	coldWater.setColdWaterAllowance(0.41);
	coldWater.setNumberOfRegisteredInFlat(2);

	drainage.setTariff(7.38);
	drainage.setStandard(8.982);
	drainage.setDrainageAllowance(1.03);
	drainage.setNumberOfRegisteredInFlat(2);

	electricity.setTariff(2.28);
	electricity.setStandard(67);
	electricity.setElectricityAllowance(0.006);
	electricity.setNumberOfRegisteredInFlat(2);

	gas.setTariff(21.30);
	gas.setStandard(6);
	gas.setNumberOfRegisteredInFlat(2);

	heating.setTariff(570.73);
	heating.setStandard(0.0209);
	heating.setFlatArea(50);

	hotWater.setTariff(36.40);
	hotWater.setStandard(3.510);
	hotWater.setNumberOfRegisteredInFlat(2);

	UtilityPaymentsCalculator calc = new UtilityPaymentsCalculator();
	calc.calculateUtilityPayments(coldWater);
	calc.calculateUtilityPayments(drainage);
	calc.calculateUtilityPayments(electricity);
	calc.calculateUtilityPayments(gas);
	calc.calculateUtilityPayments(heating);
	calc.calculateUtilityPayments(hotWater);

    }
}
