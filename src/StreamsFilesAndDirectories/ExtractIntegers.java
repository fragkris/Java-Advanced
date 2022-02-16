package StreamsFilesAndDirectories;

import javax.xml.xpath.XPath;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\fragkris\\Desktop\\Java\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileReader reader = new FileReader(path);

        Scanner scanner= new Scanner(reader);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                System.out.println(scanner.nextInt());
            }
            scanner.next();
        }
    }
}
