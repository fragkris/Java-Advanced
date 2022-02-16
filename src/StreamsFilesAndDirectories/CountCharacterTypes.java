package StreamsFilesAndDirectories;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("C:\\Users\\fragkris\\Desktop\\Java\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        Map<String, Integer> symbols = new HashMap<>();
        symbols.put("vowels", 0);
        //a e i o u - vowels
        symbols.put("punctuation", 0);
        // , . ! ? - punctuation
        symbols.put("consonants", 0);


        for (String line : lines) {
            for (char symbol : line.toCharArray()) {
                if (isVowel(symbol)) {
                    symbols.put("vowels", symbols.get("vowels") + 1);

                } else if (isPunctuation(symbol)) {
                    symbols.put("punctuation", symbols.get("punctuation") + 1);
                } else if (isConsonant(symbol)){
                    symbols.put("consonants", symbols.get("consonants") + 1);
                }

            }
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("output_task.txt"));
        writer.write("Vowels: " + symbols.get("vowels"));
        writer.newLine();
        writer.write("Consonants: " + symbols.get("consonants"));
        writer.newLine();
        writer.write("Punctuation: " + symbols.get("punctuation"));
        writer.close();
    }

    private static boolean isConsonant(char symbol) {
        if (symbol == ' '){
            return false;
        }else {
            return true;
        }
    }

    private static boolean isPunctuation(char symbol) {
        if (symbol == '!' || symbol == ',' || symbol == '.' || symbol == '?') {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isVowel(char symbol) {
        if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
            return true;
        } else {
            return false;
        }


    }
}
