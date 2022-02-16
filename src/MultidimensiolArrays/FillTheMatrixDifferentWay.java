package MultidimensiolArrays;

import java.util.Scanner;

public class FillTheMatrixDifferentWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String pattern = input[1]; // A or B
        int[][] matrix = new int[size][size];

        if (pattern.equals("A")) {
            fillMatrixPatternA(matrix, size);
        } else if (pattern.equals("B")) {
            fillMatrixPatternB(matrix, size);
        }
        printMatrix(matrix, size, size);

    }

    private static void fillMatrixPatternB(int[][] matrix, int size) {
        int startNumber = 1;
        for (int col = 0; col < size; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = startNumber++;
                }
            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = startNumber++;
                }
            }

        }
    }

    private static void fillMatrixPatternA(int[][] matrix, int size) {
        int startNumber = 1;
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] = startNumber;
                startNumber++;
            }
        }
    }


    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
