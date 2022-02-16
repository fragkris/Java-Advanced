package StacksAndQueue.SecondTries.MatchingBrackets;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();

        String expression = scanner.nextLine();

        for (int i = 0; i < expression.length() - 1; i++) {
            char current = expression.charAt(i);

            if (current == '(') {
                stack.push(i);
            } else if (current == ')') {
                int startIndex = stack.pop();
                String contents = expression.substring(startIndex, i + 1);
                System.out.println(contents);
            }
        }
    }
}
