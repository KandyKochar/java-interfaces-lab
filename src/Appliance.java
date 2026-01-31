package com.example;

public abstract class Appliance {

	 protected String brand;
	    protected int make; 

	    public Appliance(String brand, int make) {
	        this.brand = brand;
	        this.make = make;
	    }

	    public abstract void turnOn();
	    public abstract void turnOff();

	    public void displayInfo() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Made in Year: " + make);
	    }
}
