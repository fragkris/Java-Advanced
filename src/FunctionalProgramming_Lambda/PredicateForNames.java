package FunctionalProgramming_Lambda;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[]names= scanner.nextLine().split("\\s+");


        Predicate<String> hasPassed = w -> w.length()<=n;

        for (String name : names) {
            if (hasPassed.test(name)){
                System.out.println(name);
            }
        }

    }
}
