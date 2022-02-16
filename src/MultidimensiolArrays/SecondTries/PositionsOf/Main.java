package MultidimensiolArrays.SecondTries.PositionsOf;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimensions[0], cols = dimensions[1];

        int[][] matrix = createMatrix(rows, cols, scanner);

        int numberToCheck = Integer.parseInt(scanner.nextLine());

        checkMatrix(numberToCheck, matrix);

    }

    private static void checkMatrix(int numberToCheck, int[][] matrix) {
        int founds = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == numberToCheck){
                    System.out.println(row + " " + col);
                    founds++;
                }
            }
        }
        if (founds == 0){
            System.out.println("not found");
        }
    }

    private static int[][] createMatrix(int rows, int cols, Scanner scanner) {
        int[][] current = new int[rows][cols];
        for (int row = 0; row < current.length; row++) {

            current[row] = getComponents(scanner);
        }
        return current;
    }

    private static int[] getComponents(Scanner scanner) {
        int[] component = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        return component;
    }
}
