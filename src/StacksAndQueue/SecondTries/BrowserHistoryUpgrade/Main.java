package StacksAndQueue.SecondTries.BrowserHistoryUpgrade;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    static public  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<String>();
        ArrayDeque<String> forwardHistory = new ArrayDeque<String>();

        String command = scanner.nextLine();

        while (!command.equals("Home")) {

            switch (command) {
                case "back":
                    if (history.size() <= 1) {
                        System.out.println("no previous URLs");

                    } else {
                        forwardHistory.addFirst(history.peek());
                        history.pop();
                        System.out.println(history.peek());
                    }
                    break;

                case "forward":
                    if (forwardHistory.size()<1){
                        System.out.println("no next URLs");
                    }else {
                        System.out.println(forwardHistory.peek());
                        history.push(forwardHistory.pop());
                    }

                    break;


                default:
                    System.out.println(command);
                    history.push(command);
                    forwardHistory.clear();
                    break;

            }

            command = scanner.nextLine();
        }
    }
}
