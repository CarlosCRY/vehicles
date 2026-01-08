package org.ies.tierno.readers;

import org.ies.tierno.models.Car;

import java.util.Scanner;

public class CarReader {
    private final Scanner scanner;

    public CarReader (Scanner scanner) {
        this.scanner = scanner;
    }

    public Car read () {
        System.out.println("\nMatrícula del coche: \n");
        String licensePlate = scanner.nextLine();

        System.out.println("\nKilómetros hechos: \n");
        int km = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nNúmero de puertas: \n");
        int doors = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nPotencia en caballos: \n");
        int horsePower = scanner.nextInt();
        scanner.nextLine();

        return new Car(licensePlate, km, doors, horsePower);
    }

}
