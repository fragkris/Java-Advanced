package SetsAndMapsAdvanced.Sets;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class parkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> cars = new LinkedHashSet<>();
        String input = scanner.nextLine();

        while (!input.equals("END")) {

            String car = input.split("\\s+")[1];
            if (input.contains("IN")) {
                cars.add(car);
            } else if (input.contains("OUT")) {
                cars.remove(car);
            }
            input = scanner.nextLine();
        }
        if (cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car : cars) {
                System.out.println(car);
            }
        }
    }
}
