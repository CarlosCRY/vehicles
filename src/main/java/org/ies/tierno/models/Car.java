package org.ies.tierno.models;

public class Car extends Vehicle {
    protected String race;

    public Car (String name, int age, String race){
        super(name, age);
        this.race = race;
    }

    @Override
    public void showInfo() {
        showVehicleInfo();
        System.out.print(" Raza: " + race);
    }
}
