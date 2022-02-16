package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile2 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\fragkris\\Desktop\\Java\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(path);

        try {
            int oneByte = fileInputStream.read();
            while (oneByte>=0){
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = fileInputStream.read();
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
