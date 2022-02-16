package StacksAndQueue.SecondTries.PrinterQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> printerQueue = new ArrayDeque<String>();

        String command = scanner.nextLine();


        while (!command.equals("print")) {

            switch (command) {
                case "cancel":
                    if (printerQueue.isEmpty()) {
                        System.out.println("Printer is on standby");
                    } else {
                        System.out.println("Canceled " + printerQueue.poll());
                    }

                    break;
                default:
                    printerQueue.offer(command);
                    break;
            }
            command = scanner.nextLine();
        }
        for (String entry : printerQueue) {
            System.out.println(entry);
        }
    }
}
