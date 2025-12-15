package org.ies.tierno.models;

public class MBike extends Vehicle {
    protected int cilCapacity;

    public MBike (String licensePlate, int km, int cilCapacity){
        super(licensePlate, km);
        this.cilCapacity = cilCapacity;
    }

    @Override
    public void showInfo() {
        showVehicleInfo();
        System.out.print(", Cilindrada: " + cilCapacity);
    }
}
