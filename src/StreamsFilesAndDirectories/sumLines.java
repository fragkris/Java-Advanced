package StreamsFilesAndDirectories;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class sumLines {
    public static void main(String[] args) throws IOException {//може да се премахне ако има try/catch


        //String path = "C:\\Users\\fragkris\\Desktop\\Java\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        Path path = Path.of("C:\\Users\\fragkris\\Desktop\\Java\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Error while reading file");
            // ако има try\catch, не е нужно да exception-a да е заявен в мейн метода
        }
        for (String line : lines) {
            int sum = 0;
            for (char symbol : line.toCharArray()) {
                sum+=symbol;
            }
            System.out.println(sum);
        }

    }
}
