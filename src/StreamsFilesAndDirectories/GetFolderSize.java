package StreamsFilesAndDirectories;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class GetFolderSize {
    public static void main(String[] args) {

        String path = "C:\\Users\\fragkris\\Desktop\\Java\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File folder = new File(path);

        int size = 0;
        for (File file : folder.listFiles()) {
            size += file.length();

        }
        System.out.println("Folder size: "+ size);
    }
}
