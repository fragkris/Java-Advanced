package StreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AllCapitals {
    public static void main(String[] args) {

        Path path = Path.of("C:\\Users\\fragkris\\Desktop\\Java\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        try {
            //File file = new File("C:\\Users\\fragkris\\Desktop\\outputFile.txt");   new FileWriter(file)
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            for (String line : lines) {
               writer.write(line.toUpperCase(Locale.ROOT));
               writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
