package MultidimensiolArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = getMatrix(scanner, rows);
        int[] coordinates = Arrays.stream(scanner.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt).toArray();
        printMatrix(correctmartix(matrix, coordinates));


    }

    private static int[][] correctmartix(int[][] matrix, int[] coordinates) {
        int[][] corrected = new int[matrix.length][matrix[0].length];
        int row = coordinates[0];
        int col = coordinates[1];
        int indexInNumber = matrix[row][col];
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;
        //matrix[row][col] = sum;

        for (int iRow = 0; iRow < matrix.length; iRow++) {
            for (int iCol = 0; iCol < matrix[iRow].length; iCol++) {
                int current = matrix[iRow][iCol];
                corrected[iRow][iCol] = matrix[iCol][iCol];
                if (current == indexInNumber) {
                    up = 0;
                    down = 0;
                    left = 0;
                    right = 0;
                    if (iRow != 0 && iRow != matrix.length - 1) {
                        up = matrix[iRow - 1][iCol];
                        down = matrix[iRow + 1][iCol];
                    } else if (iRow == 0) {
                        down = matrix[iRow + 1][iCol];
                    } else if (iRow == matrix.length - 1) {
                        up = matrix[iRow - 1][iCol];
                    }

                    if (iCol != 0 && iCol != matrix[0].length - 1) {
                        left = matrix[iRow][iCol - 1];
                        right = matrix[iRow][iCol + 1];
                    } else if (iCol == 0) {
                        right = matrix[iRow][iCol + 1];
                    } else if (iCol == matrix[iRow].length - 1) {
                        left = matrix[iRow][iCol - 1];
                    }
                    int sum = up + down + left + right;
                    matrix[iRow][iCol] = sum;
                    corrected[iRow][iCol] = matrix[iCol][iCol];
                }

            }

        }

        return matrix;

}

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getMatrix(Scanner scanner, int rows) {
        int cols = 0;
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] element = scanner.nextLine().split(" ");
            matrix = new int[row][element.length];
            for (int col = 0; col < matrix[0].length-1; col++) {
                matrix[row][col] = Integer.parseInt(element[col]);
            }
        }
        return matrix;

    }
}
