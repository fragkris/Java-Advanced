package FunctionalProgramming_Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .filter(e -> e % 2 == 0)
                .toArray();

//        List<Integer>nums = Arrays.stream(numbers)
//                .boxed()
//                .collect(Collectors.toList());


//        StringBuilder out = new StringBuilder();
//        for (int i = 0; i < numbers.length; i++) {
//            out.append(numbers[i]);
//            if (i < numbers.length - 1) {
//                out.append(", ");
//            }
//        }
        Function<IntStream, String> formatNumbers = str -> str.
                mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
        String evenNumbers  = formatNumbers.apply(Arrays.stream(numbers));

        System.out.println(evenNumbers);





        String sortedNumbers = Arrays.stream(numbers).sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(sortedNumbers);

    }

    public static void printNum(int num) {
        System.out.println(num);
    }
}
