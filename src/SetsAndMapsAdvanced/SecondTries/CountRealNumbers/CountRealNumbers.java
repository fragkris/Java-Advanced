package SetsAndMapsAdvanced.SecondTries.CountRealNumbers;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> count = new LinkedHashMap<>();

        String[] numbers = scanner.nextLine().split("\\s+");

        for (int i = 0; i < numbers.length; i++) {
            double current = Double.parseDouble(numbers[i]);

            if (!count.containsKey(current)){
                count.put(current, 1);
            }else {
                count.put(current, count.get(current) + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : count.entrySet()) {
            System.out.printf("%.1f -> %d", entry.getKey(), entry.getValue());
            System.out.println();
        }
    }
}
