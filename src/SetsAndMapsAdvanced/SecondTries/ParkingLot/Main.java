package SetsAndMapsAdvanced.SecondTries.ParkingLot;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();
        Set<String> parkingLot = new LinkedHashSet<>();

        while (!command.equals("END")) {
            String direction = command.split(", ")[0];
            String registration = command.split(", ")[1];

            switch (direction) {
                case "IN":
                    parkingLot.add(registration);
                    break;

                case "OUT":
                    parkingLot.remove(registration);
                    break;
            }
            command = scanner.nextLine();
        }
        if (!parkingLot.isEmpty()) {
            for (String s : parkingLot) {
                System.out.println(s);
            }
        } else {
            System.out.println("Parking Lot is Empty");
        }

    }
}
