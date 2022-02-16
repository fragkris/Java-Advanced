package ExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class FlowerWreaths_Cheat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stored = 0;


        ArrayDeque<Integer> tasks = new ArrayDeque<>(); //stack---------------------------------------
        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(tasks::push);

        ArrayDeque<Integer> threads = Arrays.stream(scanner.nextLine().split(", ")) //queue------
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));


        int wraths = 0;
        while (!threads.isEmpty() && !tasks.isEmpty()) {
            int lastLillie = tasks.peek();
            int firstRose = threads.peek();

            int sum = firstRose + lastLillie;

            if (sum == 15) {
                wraths++;
                threads.pop();
                tasks.poll();

            } else if (sum > 15) {
                int decreasedLilly = tasks.peek() - 2;
                tasks.pop();
                tasks.push(decreasedLilly);
            } else {
                stored+=sum;
                threads.pop();
                tasks.poll();

            }
        }
        wraths+= stored/15;

        if (wraths>=5){
            System.out.printf("You made it, you are going to the competition with %d wreaths!%n",wraths);
        }else {
            System.out.printf("You didn't make it, you need %d wreaths more!%n", 5-wraths);
        }
    }
}
