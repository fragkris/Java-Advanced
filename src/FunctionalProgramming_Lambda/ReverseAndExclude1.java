package FunctionalProgramming_Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        Collections.reverse(nums);
        int n = scanner.nextInt();


        Predicate<Integer>checkDivision = number-> number%n==0;
        nums.removeIf(checkDivision);


        Consumer<List<Integer>> print = list -> list.forEach(e-> System.out.print(e + " "));
        print.accept(nums);
    }
}
