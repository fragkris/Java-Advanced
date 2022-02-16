package StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumBytes {
    public static void main(String[] args) {


        Path path = Path.of("C:\\Users\\fragkris\\Desktop\\Java\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Error while reading file");
            // ако има try\catch, не е нужно да exception-a да е заявен в мейн метода
        }
        int sumLines = 0;
        for (String line : lines) {
            sumLines += printSumOfASCII(line);
        }
        System.out.println(sumLines);

    }

    private static int printSumOfASCII(String line) {
        int sum = 0;
        for(char symbol : line.toCharArray()){
            sum+=symbol;
        }
        return sum;
    }
}
