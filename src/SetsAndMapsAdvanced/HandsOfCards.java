package SetsAndMapsAdvanced;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //C = 1
        //D = 2
        //H = 3
        //S = 4
        //2 to 10  = 2 to 10
        //J = 11
        //Q = 12
        //K = 13
        //A = 14
        Map<String, Set<String>> playersCards = new LinkedHashMap<>();

        Map<String, Integer> cardPowers = new HashMap<>();
        cardPowers.put("2", 2);
        cardPowers.put("3", 3);
        cardPowers.put("4", 4);
        cardPowers.put("5", 5);
        cardPowers.put("6", 6);
        cardPowers.put("7", 7);
        cardPowers.put("8", 8);
        cardPowers.put("9", 9);
        cardPowers.put("10", 10);
        cardPowers.put("J", 11);
        cardPowers.put("Q", 12);
        cardPowers.put("K", 13);
        cardPowers.put("A", 14);

        Map<String, Integer> cardMultipliers = new HashMap<>();
        cardMultipliers.put("S", 4);
        cardMultipliers.put("H", 3);
        cardMultipliers.put("D", 2);
        cardMultipliers.put("C", 1);


        String input = scanner.nextLine();

        while (!input.equals("JOKER")) {
            String[] tokens = input.split(": ");
            String name = tokens[0];
            String[] cards = tokens[1].split(", ");
            for (String card : cards) {
                if (!playersCards.containsKey(name)) {
                    playersCards.put(name, new HashSet<>());
                }
                playersCards.get(name).add(card);

            }
            input = scanner.nextLine();
        }

        for (var stringSetEntry : playersCards.entrySet()) {
            int sum = 0;
            String name = stringSetEntry.getKey();
            String[]card = stringSetEntry.getValue().toArray(new String[0]);

            for (String current : card){
                String []tokens = current.split("");
                String power = "";
                String multiplier = "";
                if (current.contains("10")){
                    power = "10";
                    multiplier = tokens[2];
                }else {
                    power = tokens[0];
                    multiplier = tokens[1];
                }
                sum += cardPowers.get(power) * cardMultipliers.get(multiplier);

            }
            System.out.println(name + ": " + sum);
        }

    }
}

