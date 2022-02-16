package ExamPreparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LootBox_Cheat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        ArrayDeque<Integer> firstbox = Arrays.stream(scanner.nextLine().split("\\s+")) //queue------
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> secondbox = new ArrayDeque<>(); //stack---------------------------------------
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(secondbox::push); //не може да преповторим предишния код, защото стека изисква push
        int itemValue = 0;

        while (!firstbox.isEmpty() && !secondbox.isEmpty()) {
            int firstItem = firstbox.peek();
            int secondItem = secondbox.pop();
            int sum = firstItem + secondItem;

            if (sum % 2 == 0) {
                itemValue += sum;
                firstbox.poll();
            } else {
                firstbox.offer(secondItem);
            }
        }

        if (firstbox.isEmpty()) {
            System.out.println("First lootbox is empty");
        } else {
            System.out.println("Second lootbox is empty");
        }

        if (itemValue >= 100) {
            System.out.printf("Your loot was epic! Value: %d%n", itemValue);
        } else {
            System.out.printf("Your loot was poor... Value: %d%n", itemValue);
        }
    }
}
//        List<Integer> secondStack = Arrays.stream(scanner.nextLine().split("\\s+"))
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());
//
//        for (Integer integer : secondStack) {
//            secondbox.push(integer);
//        }
//        ArrayDeque<Integer>secondbox = new Arraydeque<>();

//        прибавяне на стойности от лист в стек или опашка