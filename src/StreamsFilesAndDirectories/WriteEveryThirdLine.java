package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {


        String fileName = "C:\\Users\\fragkris\\Desktop\\Java\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        Path path = Paths.get(fileName);

        List<String> lines = Files.readAllLines(path);

        PrintStream printStream = new PrintStream("C:\\Users\\fragkris\\Desktop\\Java\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\third-line-out.txt");

        for (int i = 0; i < lines.size(); i++) {
            if ((i+1) % 3 == 0){
                printStream.print(lines.get(i));
            }
        }

//        String path = "C:\\Users\\fragkris\\Desktop\\Java\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
//        FileReader reader = new FileReader(path);
//
//        Scanner scanner = new Scanner(reader);
//
//        PrintStream printStream = new PrintStream("C:\\Users\\fragkris\\Desktop\\Java\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\third-line-out.txt");
//
//        int lineNum =0;
//
//        while (scanner.hasNext()){
//            lineNum++;
//            if (lineNum%3==0){
//                printStream.print(scanner.nextLine());
//            }else {
//                scanner.nextLine();
//            }
//        }
    }
}
