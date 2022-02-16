package StacksAndQueue.Stacks;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer>binary = new ArrayDeque<>();


       if (number==0){
           System.out.println(0);
       }else {
           while (number!=0){
               binary.push(number%2);
               number/=2;
           }

       }
        for (Integer integer : binary) {
            System.out.print(integer);
        }

        /*
        73%2 =1
        73/2 = 36
        36%2= 0
        36/2=  16
        16%2 =0
        16/2 = 8
        8%2=4
        4/2...
        ...
         */
    }
}
