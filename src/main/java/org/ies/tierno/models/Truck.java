package org.ies.tierno.models;

public class Truck extends Vehicle {
    protected int axles;

    public Truck(String licensePlate, int km, int axles){
        super(licensePlate, km);
        this.axles = axles;
    }

    @Override
    public void showInfo() {
        showVehicleInfo();
        System.out.print(" Ejes: " + axles);
    }
}
