package Generics.GenericSwapMethodStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box<String> box = new Box<>();
        int n = Integer.parseInt(scanner.nextLine());



        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            box.add(text);

        }
        String []indexes = scanner.nextLine().split(" ");
        int index1 = Integer.parseInt(indexes[0]);
        int index2 = Integer.parseInt(indexes[1]);
        box.swap(index1,index2);

        System.out.println(box);
    }
}
