package MultidimensiolArrays.SecondTries.CompareMatrices;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix1 = fillMatrix(dimensions, scanner);
        dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[][] matrix2 = fillMatrix(dimensions, scanner);


        checkEqual(matrix1, matrix2);


    }

    private static void checkEqual(int[][] matrix1, int[][] matrix2) {
        boolean isEqual = true;

        if (matrix1.length != matrix2.length) {
            isEqual = false;
        }

        for (int row = 0; row < matrix1.length; row++) {
            if (matrix1[row].length != matrix2[row].length) {
               isEqual = false;
                break;

            }
            for (int col = 0; col < matrix1[row].length; col++) {
                if (matrix1[row][col] != matrix2[row][col]) {
                    isEqual = false;
                }
            }
        }
        if (isEqual){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }


    }

    private static int[][] fillMatrix(int[] dimensions, Scanner scanner) {
        int[][] current = new int[dimensions[0]][dimensions[1]];
        for (int i = 0; i < dimensions[0]; i++) {
            int[] components = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            current[i] = components;
        }
        return current;
    }
}
