package StacksAndQueue.SecondTries.BrowserHistory;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<String>();

        String command = scanner.nextLine();

        while (!command.equals("Home")) {

            switch (command) {
                case "back":
                    if (history.size() <= 1) {
                        System.out.println("no previous URLs");
                    } else {
                        history.pop();
                        System.out.println(history.peek());
                    }
                    break;
                default:
                    history.push(command);
                    System.out.println(history.peek());


            }

            command = scanner.nextLine();
        }
    }
}
