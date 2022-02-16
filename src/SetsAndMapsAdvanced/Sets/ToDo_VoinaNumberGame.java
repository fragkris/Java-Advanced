package SetsAndMapsAdvanced.Sets;

import java.util.*;
import java.util.stream.Collectors;

public class ToDo_VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Set<Integer> playerOne = fillDeck(scanner.nextLine());
        Set<Integer> playerTwo = fillDeck(scanner.nextLine());

        int rounds = 50;

        while (rounds-- > 0) {
            int firstCard = getFirstCard(playerOne);
            int secondCard = getFirstCard(playerTwo);


            playerOne.remove(firstCard);
            playerTwo.remove(secondCard);

            if (firstCard > secondCard) {
                playerOne.add(firstCard);
                playerOne.add(secondCard);
            } else if (secondCard > firstCard) {
                playerTwo.add(firstCard);
                playerTwo.add(secondCard);
            }

            if (playerOne.isEmpty() || playerTwo.isEmpty()) {
                break;
            }
        }

        if (playerOne.size() > playerTwo.size()) {
            System.out.println("First player win!");
        } else if (playerTwo.size() > playerOne.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }


    }

    private static int getFirstCard(Set<Integer> set) {

        return set.stream().findFirst().orElse(0);
//        Iterator<Integer> iterator = set.iterator();
//        Integer next = iterator.next();
//        iterator.remove();
//
//        return next;
    }


    private static Set<Integer> fillDeck(String nextLine) {
        return Arrays.stream(nextLine.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

    }

}
