package FunctionalProgramming_Lambda;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        //int[]numbers2 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        //int[]numbers3 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function<int[], Integer> findMin = min -> {
            int currentNum= Integer.MAX_VALUE;
            for (int number : min) {
                if (number<currentNum){
                    currentNum=number;
                }
            }
            return currentNum;
        };
        System.out.println(findMin.apply(numbers));
        //System.out.println(findMin.apply(numbers2));
        //System.out.println(findMin.apply(numbers3));


    }
}
