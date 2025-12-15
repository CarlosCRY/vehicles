package org.ies.tierno.models;

public class Car extends Vehicle {
    protected int doors;
    protected int horsePower;

    public Car (String licensePlate, int km, int doors, int horsePower){
        super(licensePlate, km);
        this.doors = doors;
        this.horsePower = horsePower;
    }

    @Override
    public void showInfo() {
        showVehicleInfo();
        System.out.print(", Puertas: " + doors + ", Caballos: " + horsePower);
    }
}
