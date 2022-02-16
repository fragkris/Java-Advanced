package SetsAndMapsAdvanced.Sets;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Sets_of_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input =scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        Set<Integer>firstSet = new LinkedHashSet<>();
        Set<Integer>secondSet = new LinkedHashSet<>();


        for (int i = 0; i < n; i++) {
            int e = Integer.parseInt(scanner.nextLine());
            firstSet.add(e);
        }
        for (int i = 0; i < m; i++) {
            int e = Integer.parseInt(scanner.nextLine());
            secondSet.add(e);
        }
        firstSet.retainAll(secondSet);

        for (Integer integer : firstSet) {
            System.out.print(integer + " ");
        }

    }
}
