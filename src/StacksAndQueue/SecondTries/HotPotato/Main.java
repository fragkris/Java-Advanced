package StacksAndQueue.SecondTries.HotPotato;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<String> names = new ArrayDeque<String>(Arrays.asList(input));

        int n = Integer.parseInt(scanner.nextLine());

        while (names.size() != 1) {

            for (int i = 1; i < n; i++) {

                names.offer(names.pop());
            }
            System.out.println("Removed " + names.pop());
        }

        System.out.println("Last is " + names.pop());
    }
}
