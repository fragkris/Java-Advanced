package SetsAndMapsAdvanced.SecondTries.Voina;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayer = fillSet(scanner);
        Set<Integer> secondPlayer = fillSet(scanner);
        startGame(firstPlayer, secondPlayer);
        whoWins(firstPlayer, secondPlayer);
    }

    private static void whoWins(Set<Integer> firstPlayer, Set<Integer> secondPlayer) {

        if (firstPlayer.size()> secondPlayer.size()){
            System.out.println("First player win!");
        }else if (secondPlayer.size()> firstPlayer.size()){
            System.out.println("Second player win!" );
        }else {
            System.out.println("Draw!");
        }
    }

    private static void startGame(Set<Integer> firstPlayer, Set<Integer> secondPlayer) {
        int counter = 1;
        while ((!firstPlayer.isEmpty() || !secondPlayer.isEmpty()) && counter != 50) {
            int firstCard = getFirstCard(firstPlayer);
            int secondCard = getFirstCard(secondPlayer);
            firstPlayer.remove(firstCard);
            secondPlayer.remove(secondCard);

            if (firstCard>secondCard){
                firstPlayer.add(firstCard);
                firstPlayer.add(secondCard);
            }else if (firstCard< secondCard){
                secondPlayer.add(firstCard);
                secondPlayer.add(secondCard);
            }
        counter++;
        }
    }

    private static int getFirstCard(Set<Integer> set) {
        return set.iterator().next();
    }


    private static Set<Integer> fillSet(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
    }
}

