package org.ies.tierno.readers;

import org.ies.tierno.models.Truck;

import java.util.Scanner;

public class TruckReader {
    private final Scanner scanner;

    public TruckReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Truck read () {
        System.out.println("\nMatrícula del camión: \n");
        String licensePlate = scanner.nextLine();

        System.out.println("\nKilómetros hechos: \n");
        int km = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nNúmero de ejes: \n");
        int axle = scanner.nextInt();
        scanner.nextLine();

        return new Truck(licensePlate, km, axle);
    }

}
