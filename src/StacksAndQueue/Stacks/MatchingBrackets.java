package StacksAndQueue.Stacks;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input =scanner.nextLine();
        ArrayDeque<Integer>stackOfIndexes = new ArrayDeque<>();


        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)=='('){
                stackOfIndexes.push(i);
            }else if (input.charAt(i)==')'){
                int startIndex = stackOfIndexes.pop();
                String subString = input.substring(startIndex,i+1);
                System.out.println(subString);
            }
        }


    }
}
