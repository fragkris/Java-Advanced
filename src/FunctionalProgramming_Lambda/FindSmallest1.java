package FunctionalProgramming_Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSmallest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        Consumer<List<Integer>>printMinElement = list-> {
            int min = Integer.MAX_VALUE;
            for (Integer num : nums) {
                if (num<min){
                    min=num;
                }
            }
            System.out.println(list.lastIndexOf(min));
        };
        printMinElement.accept(nums);
    }
}
