package com.example;

public class TestAppliances {

	public static void main(String[] args) {

		WashingMachine machine1 = new WashingMachine("Samsung", 2005);
		Refrigerator fridge = new Refrigerator("LG", 2010);

		System.out.println("Washing Machine ");
		machine1.displayInfo();
		machine1.turnOn();
		machine1.performMaintenance();
		machine1.turnOff();

		System.out.println("\nRefrigerator ");
		fridge.displayInfo();
		fridge.turnOn();
		fridge.performMaintenance();

	}
}
