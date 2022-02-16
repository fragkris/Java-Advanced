package IteratorsAndComparators.Froggy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer>lake = new ArrayList<>();
        String[] inputLake = scanner.nextLine().split(", ");
        for (String s : inputLake) {
            int num = Integer.parseInt(s);
            lake.add(num);
        }
        String end = scanner.nextLine();

    }
}
