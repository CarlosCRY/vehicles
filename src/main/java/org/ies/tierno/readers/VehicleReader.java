package org.ies.tierno.readers;

import lombok.AllArgsConstructor;
import org.ies.tierno.models.Vehicle;

import java.util.Scanner;

@AllArgsConstructor
public class VehicleReader {
    private final Scanner scanner;
    private final CarReader carReader;
    private final MBikeReader mBikeReader;
    private final TruckReader truckReader;

    public Vehicle read () {
        int option;
        while (true) {
            System.out.println("Tipos de vehículo:\n");
            System.out.println("1. Coche.\n2. Motocicleta.\n3. Camión.");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    return carReader.read();
                case 2:
                    return mBikeReader.read();
                case 3:
                    return truckReader.read();
                default:
                    System.out.println("\nNo es una opción válida\n");
            }
        }
    }
}
