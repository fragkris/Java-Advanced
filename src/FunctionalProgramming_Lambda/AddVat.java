package FunctionalProgramming_Lambda;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class AddVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prices with VAT:");

        Function<String, Double>mapWithVat= str ->Double.parseDouble(str)*1.2;


        Arrays.stream(scanner.nextLine().split(", "))
                .map(mapWithVat)
                .forEach(e -> System.out.printf("%.2f%n", e));





    }
}
