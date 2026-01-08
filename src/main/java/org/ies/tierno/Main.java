package org.ies.tierno;

import org.ies.tierno.models.Vehicle;
import org.ies.tierno.readers.VehicleReader;
import org.ies.tierno.readers.CarReader;
import org.ies.tierno.readers.MBikeReader;
import org.ies.tierno.readers.TruckReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarReader carReader = new CarReader(scanner);
        MBikeReader mBikeReader = new MBikeReader(scanner);
        TruckReader truckReader = new TruckReader(scanner);
        VehicleReader vehicleReader = new VehicleReader(scanner, carReader, mBikeReader, truckReader);

        Vehicle vehicle = vehicleReader.read();

        vehicle.showInfo();

        System.out.println("\nIntroduce los kilómetros realizados\n");

        vehicle.move(scanner.nextInt());
    }
}