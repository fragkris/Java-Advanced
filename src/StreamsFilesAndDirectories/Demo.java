package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\fragkris\\Desktop\\Java\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
//            int readByte = inputStream.read();
//            while (readByte != -1) {
//                System.out.print((char) readByte + "");
//                readByte = inputStream.read();
//            }                                                                 ако няма скенер

        inputStream.close();
    }
}
