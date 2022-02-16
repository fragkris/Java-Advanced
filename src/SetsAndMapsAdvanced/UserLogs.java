package SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Integer>> info = new TreeMap<>();//<user , <IP, Count>>
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] data = input.split("\\s+");
            String IP = data[0].split("=")[1];
            String user = data[2].split("=")[1];

            info.putIfAbsent(user, new LinkedHashMap<>());
            info.get(user).putIfAbsent(IP, 0);
            info.get(user).put(IP, info.get(user).get(IP) + 1);

            input = scanner.nextLine();
        }

        info.entrySet().stream()
                .forEach(entry -> {
                            System.out.println(entry.getKey() + ": ");
                            int countEntry = entry.getValue().size();
                            for (var ipEntry : entry.getValue().entrySet()) {

                                if (countEntry > 1) {
                                    System.out.print(ipEntry.getKey() + " => " + ipEntry.getValue() + ", ");
                                } else {
                                    System.out.print(ipEntry.getKey() + " => " + ipEntry.getValue() + ".");
                                }
                                countEntry--;

                            }
                            System.out.println();
                        }
                );
    }
}
