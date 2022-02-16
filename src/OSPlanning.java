import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OSPlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> tasks = new ArrayDeque<>(); //stack---------------------------------------
        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(tasks::push);

        ArrayDeque<Integer> threads = Arrays.stream(scanner.nextLine().split(" ")) //queue------
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        int toBeKilled = Integer.parseInt(scanner.nextLine());
        boolean finished = true;

        while (finished && !threads.isEmpty() && !tasks.isEmpty()){
            int currentTask = tasks.peek();
            int currentThread = threads.poll();
            if (currentThread>=currentTask){
                tasks.pop();
            }
            if (currentTask == toBeKilled){
                finished=false;
                System.out.printf("Thread with value %d killed task %d%n", currentThread, toBeKilled);
                threads.push(currentThread);
            }

        }
        for (Integer thread : threads) {
            System.out.print(thread + " ");
        }

    }
}
