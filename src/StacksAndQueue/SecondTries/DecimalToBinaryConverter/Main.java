package StacksAndQueue.SecondTries.DecimalToBinaryConverter;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int decimal = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> binary = new ArrayDeque<Integer>();

        if (decimal == 0){
            System.out.println("0");
            return;
        }
        while (decimal != 0) {
            binary.push(decimal % 2);
            decimal = decimal / 2;
        }

        while (!binary.isEmpty()){
            System.out.print(binary.pop());
        }

    }
}
