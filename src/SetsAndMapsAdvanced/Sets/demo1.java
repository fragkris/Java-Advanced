package SetsAndMapsAdvanced.Sets;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class demo1 {
    public static void main(String[] args) {
        List<Integer> randomIntegers = getRandomListOfIntegers(1000);
        Set<Integer> numbers = new HashSet<>(randomIntegers);

        System.out.println(numbers.size());
        boolean contains = numbers.contains(666);
        System.out.println(contains);


    }

    private static List<Integer> getRandomListOfIntegers(int count) {
        return ThreadLocalRandom.current()
                .ints(count, 100, 1000)
                .boxed()
                .collect(Collectors.toList());
    }
}
