package FunctionalProgramming_Lambda;


import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;


public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        BiFunction<int[], String, int[]> function = (list, command) -> {

            boolean isTrue = true;
            while (!command.equals("end")) {
                switch (command) {
                    case "add":
                        add(list);
                        break;

                    case "multiply":

                        multiply(list);
                        break;

                    case "subtract":
                        subtract(list);

                        break;

                    case "print":
                        isTrue = false;

                        printArr(list);

                        break;
                }
                command = scanner.nextLine();
            }

            if (isTrue) {
                printArr(list);
            }
            return list;
        };

        function.apply(nums, input);
    }


    private static void add(int[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = list[i] + 1;
        }
    }

    private static void multiply(int[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = list[i] * 2;
        }
    }

    private static void subtract(int[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = list[i] - 1;
        }
    }

    private static void printArr(int[] list) {
        Arrays.stream(list).forEach(value -> {
            System.out.print(String.format("%d ", value));
        });
        System.out.println();
    }
}
