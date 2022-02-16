package SetsAndMapsAdvanced.Sets;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String>periodicTable = new TreeSet<>();

        for (int i = 0; i <n ; i++) {
            String[]  elements = scanner.nextLine().split("\\s+");

            periodicTable.addAll(Arrays.asList(elements));

//            Collections.addAll(periodicTable, elements);
//
//            for (String element : elements) {
//                periodicTable.add(element);
//            }
        }

        for (String s : periodicTable) {
            System.out.print(s + " ");
        }

    }

}
