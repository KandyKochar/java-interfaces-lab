package com.example;


public class WashingMachine extends Appliance implements Maintainable {

    public WashingMachine(String brand, int make) {
        super(brand, make);
    }

    @Override
    public void turnOn() {
        System.out.println("Washing Machine is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Washing Machine is now OFF.");
    }

    @Override
    public void performMaintenance() {
        System.out.println("Cleaning washing machine.");
    }
}
