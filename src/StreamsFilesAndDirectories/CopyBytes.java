package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Set;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = "C:\\Users\\fragkris\\Desktop\\Java\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        Set<Character> separators = Set.of( ' ', '\r', '\n');
        int nextByte = inputStream.read();

        PrintStream printStream = new PrintStream("out.txt");

        while (nextByte!=-1){

            if (nextByte == ' '){
                printStream.print((char) nextByte);
            }else if (nextByte==10){
                printStream.println();
            }
            else {
                printStream.print(nextByte);
            }

            nextByte= inputStream.read();
        }
    }
}
