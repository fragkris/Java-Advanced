package FunctionalProgramming_Lambda;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class CustomMinFunction1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Consumer<int[]>printMin = array-> System.out.println(Arrays.stream(array).min().orElse(0));
        printMin.accept(input);

    }
}
