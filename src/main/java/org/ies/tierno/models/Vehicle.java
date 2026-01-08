package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Vehicle {
    protected String licensePlate;
    protected int km;

    public abstract void showInfo ();

    protected void showVehicleInfo () {
        System.out.print("\nMatrícula: " + licensePlate + ", KM realizados: " + km);
    }

    public final void move (int x) {
        System.out.println("\nRecorridos " + x + " kilómetros más.\n");
        km += x;
    }

}
