package FunctionalProgramming_Lambda;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Integer> people = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split(", ");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            people.put(name, age);
        }

        String ageCondition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        people.entrySet()
                .stream()
                .filter(getAgeFilter(age, ageCondition))
                .forEach(getFormatter(format));


//        people.entrySet().stream()
//                .filter(e -> {
//                    if (ageCriteria.equals("older")){
//                        return e.getValue()>=age;
//                    }else {
//                        return e.getValue()<=age;
//                    }
//                }).forEach(entry -> {
//            if (format.equals("name")){
//                System.out.println(entry.getKey());
//            }else if (format.equals("age")){
//                System.out.println(entry.getValue());
//            }else {
//                System.out.println(entry.getKey()+ " - " + entry.getValue());
//            }
//        });

    }

    private static Predicate<Map.Entry<String, Integer>> getAgeFilter
            (int age, String ageCondition) {
        if (ageCondition.equals("older")) {
            return e -> e.getValue() >= age;
        }
        return e -> e.getValue() <= age;
    }

    public static Consumer<Map.Entry<String, Integer>> getFormatter(String format) {
        if (format.equals("name")) {
            return entry -> System.out.println(entry.getKey());
        } else if (format.equals("age")) {
            return entry -> System.out.println(entry.getValue());
        }
        return entry -> System.out.println(entry.getKey() + " - " + entry.getValue());
    }
}