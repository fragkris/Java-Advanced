package FunctionalProgramming_Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        //-1 няма размяна
        //1  има размяна
        //0 null

        Comparator<Integer> comparator = (firstNum, secondNum) -> {
            if (firstNum % 2 == 0 && secondNum % 2 != 0) {
                return -1;
            } else if (firstNum % 2 == 1 && secondNum % 2 == 0) {
                return 1;
            } else if (firstNum % 2 == 0 || secondNum % 2 != 0){
                if (firstNum <= secondNum) {
                    return -1;
                } else {
                    return 1;
                }
            }

            return 0;
        };


        numbers.sort(comparator);

        numbers.forEach(e-> System.out.print(e + " "));
    }
}
