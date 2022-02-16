package StreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <=100 ; i++) { // копираме фаил много пъти в дадена директория
            File file = new File("C:\\Users\\fragkris\\Desktop\\Java\\100Files\\file_"+i+ ".txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            int n = i;
            writer.write(file.getName());
            writer.newLine();
            writer.write(file.getPath());
            writer.newLine();
            writer.write(n);
            writer.newLine();
            writer.close();
        }

    }
}
