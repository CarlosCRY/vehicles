package org.ies.tierno.readers;

import org.ies.tierno.models.MBike;

import java.util.Scanner;

public class MBikeReader {
    private final Scanner scanner;

    public MBikeReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public MBike read () {
        System.out.println("\nMatrícula de la motocicleta: \n");
        String licensePlate = scanner.nextLine();

        System.out.println("\nKilómetros hechos: \n");
        int km = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nCilindrada: \n");
        int cilCapacity = scanner.nextInt();
        scanner.nextLine();

        return new MBike(licensePlate, km, cilCapacity);
    }

}
