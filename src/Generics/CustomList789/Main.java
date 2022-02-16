package Generics.CustomList789;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomList<String> list = new CustomList<>();


        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String[] tokens = command.split("\\s+");
            String commandName = tokens[0];

            switch (commandName) {
                case "Add":
                    String element = tokens[1];
                    list.add(element);
                    break;
                case "Remove":
                    int index = Integer.parseInt(tokens[1]);
                    list.remove(index);
                    break;
                case "Contains":
                    String element1 = tokens[1];
                    System.out.println(list.contains(element1));
                    break;

                case "Swap":
                    int i1 = Integer.parseInt(tokens[1]);
                    int i2 = Integer.parseInt(tokens[2]);
                    list.swap(i1, i2);
                    break;

                case "Greater":
                    String greaterElement = tokens[1];
                    System.out.println(list.countGreaterThan(greaterElement));
                    break;

                case "Max":
                    System.out.println(list.getMax());
                    break;

                case "Min":
                    System.out.println(list.getMin());
                    break;

                case "Print":
                    for (String s : list) {
                        System.out.println(s);
                    }
                    break;
                case "Sort":
                    Sorter.sort(list);
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
