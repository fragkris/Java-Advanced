package FunctionalProgramming_Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer>nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        Function<List<Integer>, Integer> findSmallest = e -> {
            int smallest = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i <e.size() ; i++) {
                if (e.get(i)<=smallest){
                    smallest=e.get(i);
                    index=i;
                }
            }
            return index;
        };

        System.out.println(findSmallest.apply(nums));
    }

}
