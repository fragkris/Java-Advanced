package SetsAndMapsAdvanced.Sets;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Set<String> vip = new TreeSet<>();
        Set<String> regulr = new TreeSet<>();

        String input = scanner.nextLine();

        while (!input.equals("PARTY")) {
            if (Character.isDigit(input.charAt(0))) {
                vip.add(input);
            } else {
                regulr.add(input);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("END")) {
            if (Character.isDigit(input.charAt(0))) {
                vip.remove(input);
            } else {
                regulr.remove(input);
            }
            input = scanner.nextLine();
        }

        System.out.println(vip.size() + regulr.size());



        printIfNotEmpty(vip);
        printIfNotEmpty(regulr);

    }
    public static void  printIfNotEmpty(Set<String>set){
        if (!set.isEmpty()) {
            System.out.println(String.join(System.lineSeparator(), set));
        }
    }
}
