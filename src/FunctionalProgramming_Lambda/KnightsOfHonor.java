package FunctionalProgramming_Lambda;

import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");

        Consumer<String> sirs = sir -> System.out.println("Sir " + sir);
        for (String name : names) {
            sirs.accept(name);
        }

    }
}
