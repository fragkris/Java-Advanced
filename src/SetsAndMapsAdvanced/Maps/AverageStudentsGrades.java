package SetsAndMapsAdvanced.Maps;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        Map<String, double[]> studentgrades = new TreeMap<>();


        while (n-- >0){
        String name = scanner.nextLine();
        double[]grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        studentgrades.put(name, grades);


        }
        for (var entry : studentgrades.entrySet()) {
            double avg = Arrays.stream(entry.getValue()).average().orElse(0);
            System.out.printf("%s is graduated with %f%n", entry.getKey(), avg);
        }
    }
}
