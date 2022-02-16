package SetsAndMapsAdvanced.Maps;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> infoTable = new LinkedHashMap<>();


        while (n-->0){
            String[] tokens = scanner.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            infoTable.putIfAbsent(continent, new LinkedHashMap<>());
            Map<String, List<String>>innerMap = infoTable.get(continent);
            innerMap.putIfAbsent(country, new ArrayList<>());
            innerMap.get(country).add(city);
        }

        for (var entry : infoTable.entrySet()){
            String continent = entry.getKey();
            Map<String, List<String>> innerMap = entry.getValue();

            System.out.println(continent + ":");
            for (var innerEntry: innerMap.entrySet()) { //var автоматично разпознава типа от данни
                System.out.println("  "+innerEntry.getKey() + " -> " + String.join(", ",innerEntry.getValue()));
            }
        }

    }
}
