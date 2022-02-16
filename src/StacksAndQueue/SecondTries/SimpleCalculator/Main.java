package StacksAndQueue.SecondTries.SimpleCalculator;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] operations = scanner.nextLine().split("\\s+");
        ArrayDeque <String> calculator = new ArrayDeque<String>(Arrays.asList(operations));
        int sum = 0;

        while (!calculator.isEmpty()){
            String currentSymbol = calculator.peek();

            switch (currentSymbol){
                case "+":
                    calculator.pop();
                    sum+=Integer.parseInt(calculator.pop());

                    break;

                case "-":
                    calculator.pop();
                    sum-=Integer.parseInt(calculator.pop());

                    break;

                default:
                    sum=Integer.parseInt(calculator.pop());
                    break;
            }
        }
        System.out.println(sum);
    }
}
