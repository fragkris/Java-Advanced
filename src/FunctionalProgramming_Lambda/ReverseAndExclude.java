package FunctionalProgramming_Lambda;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        Collections.reverse(nums);
        int n = scanner.nextInt();

        BiFunction<List<Integer>,Integer, List<Integer>> printReverse = (list, integer)-> {
            List<Integer>sorted= new ArrayList<>();
            for (Integer num : list) {
                if (num%integer!=0){
                    sorted.add(num);
                }
            }
            return sorted;
        };
        System.out.println(printReverse.apply(nums, n).toString().replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\,", "").trim());


    }
}
