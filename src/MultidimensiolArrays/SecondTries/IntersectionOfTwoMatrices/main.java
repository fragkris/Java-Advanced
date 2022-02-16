package MultidimensiolArrays.SecondTries.IntersectionOfTwoMatrices;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class main {
    static int rows = -1;
    static int cols = -1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char[][] matrix1 = createMatrix(scanner);
        char[][] matrix2 = createMatrix(scanner);

        compareMatrices(matrix1, matrix2);
    }

    private static void compareMatrices(char[][] matrix1, char[][] matrix2) {

        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                if (matrix1[row][col] == matrix2[row][col]) {
                    System.out.print(matrix1[row][col] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    private static char[][] createMatrix(Scanner scanner) {

        if (rows == -1 || cols == -1){
            rows = Integer.parseInt(scanner.nextLine());
            cols = Integer.parseInt(scanner.nextLine());
        }

        char[][] returnable = new char[rows][cols];

        for (int row = 0; row < returnable.length; row++) {
            String[] chars = scanner.nextLine().split("\\s+");
            for (int col = 0; col < returnable[0].length; col++) {
                returnable[row][col] = chars[col].charAt(0);
            }
        }
        return returnable;
    }
}
