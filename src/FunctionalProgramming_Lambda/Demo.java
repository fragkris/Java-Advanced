package FunctionalProgramming_Lambda;

import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(13, 42 ,69, 73);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println();

        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println();

        numbers.forEach(e-> printNum(e));


    }
    public static void printNum (int num){
        System.out.println(num);
    }
}
