package StacksAndQueue.SecondTries.MathPotato;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<String> names = new ArrayDeque<String>(Arrays.asList(input));

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        while (names.size() != 1) {

            for (int i = 1; i < n; i++) {
                names.offer(names.poll());
            }

            if (isPrime(counter)) {
                System.out.println("Prime " + names.peek());



            } else {
                System.out.println("Removed " + names.poll());

            }
            counter++;
        }

        System.out.println("Last is " + names.poll());
    }

    private static boolean isPrime(int cycle) {
        if (cycle == 1) {
            return false;
        }
        for (int i = 2; i <= cycle / 2; i++) {
            if (cycle % i == 0) {
                return false;
            }
        }
        return true;
    }
}
