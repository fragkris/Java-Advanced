package StacksAndQueue.Stacks;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowseHistory1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> URLs = new ArrayDeque<>();

        String input = scanner.nextLine();
        String currentUrl = "";

        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (URLs.isEmpty()) {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                }
                currentUrl = URLs.pop();


            } else {

                if (!currentUrl.equals("")) {
                    URLs.push(currentUrl);
                }
                currentUrl = input;
            }


            System.out.println(currentUrl);
            input = scanner.nextLine();
        }

    }
}
