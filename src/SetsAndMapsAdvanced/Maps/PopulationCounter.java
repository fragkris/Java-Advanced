package SetsAndMapsAdvanced.Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> population = new LinkedHashMap<>(); //<Country, <City, Population>>
        Map<String, Integer> totalPerCountry = new TreeMap<>();
        String input = scanner.nextLine();

        while (!input.equals("report")) {

            String[] tokens = input.split("\\|");
            String city = tokens[0];
            String country = tokens[1];
            int citizens = Integer.parseInt(tokens[2]);

            population.putIfAbsent(country, new LinkedHashMap<>());
            population.get(country).putIfAbsent(city, citizens);
            population.get(country).put(city, population.get(country).get(city) + citizens);


            input = scanner.nextLine();
        }



        population.entrySet().stream()
                .sorted((c1, c2) -> totalPerCountry.get(c2.getKey()).compareTo(totalPerCountry.get(c1.getKey())))
                .forEach(country -> {
                    System.out.format("%s (total population: %d)\n", country.getKey(), totalPerCountry.get(country.getKey()));
                    country.getValue().entrySet()
                            .stream().sorted((t1, t2) -> t2.getValue().compareTo(t1.getValue())).forEach(city -> {
                        System.out.format("=>%s: %d\n", city.getKey(), city.getValue());
                    });
                });
//да си добавя населението в total, преди да изпълня това ^
    }
}
