package SetsAndMapsAdvanced.Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> userEmails = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            String email = scanner.nextLine();

            if (email.endsWith("us") || email.endsWith("uk") || email.endsWith("com")) {

            } else {
                userEmails.put(input, email);
            }
            input = scanner.nextLine();
        }
        userEmails.entrySet().stream()
                .forEach(e -> System.out.printf("%s -> %s%n", e.getKey(), e.getValue()));
    }
}
