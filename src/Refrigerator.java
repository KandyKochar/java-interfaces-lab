
package com.example;

public class Refrigerator extends Appliance implements Maintainable {

	public Refrigerator(String brand, int make) {
		super(brand, make);
	}

	@Override
	public void turnOn() {
		System.out.println("Refrigerator is now ON.");
	}

	@Override
	public void turnOff() {
		System.out.println("Refrigerator is now OFF.");
	}

	@Override
	public void performMaintenance() {
		System.out.println("cleaning refrigerator coils.");
	}
}