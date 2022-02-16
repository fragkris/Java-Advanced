package StreamsFilesAndDirectories;


import java.io.IOException;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) throws IOException {


        String numberAsString = new Scanner(System.in).nextLine();

        try {
            int number = Integer.parseInt(numberAsString);

            System.out.println("Valid Number: "+ number);
        }catch (NumberFormatException exception){
            System.out.println("Invalid number "+ exception.getMessage());
        }finally {
            //изпълнява код, независимо дали мине през try или catch
            System.out.println("Always executed");
        }
        //catch (Exception exception){
        //    System.out.println("Invalid number "+ exception.getMessage());
        //}catch ( Throwable exception){
        //   System.out.println("Invalid number "+ exception.getMessage());
        //}

    }
}