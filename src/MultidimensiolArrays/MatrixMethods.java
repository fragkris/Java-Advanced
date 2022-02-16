package MultidimensiolArrays;

import java.util.Scanner;

public class MatrixMethods {
    public static void main(String[] args) {


    }
    public static int getElementsSum(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                sum += matrix[row][col];
            }

        }
        System.out.println();
        return sum;
    }

    public static int[][] getMaxSumSubMatrix2X2(int[][] matrix) {
        int maxSum = 0;
        int bestRow = 0;
        int bestCol = 0;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[0].length - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] +
                        matrix[row + 1][col] + matrix[row + 1][col + 1];

                if (maxSum < sum) {
                    maxSum = sum;
                    bestRow = row;
                    bestCol = col;
                }
            }
        }
        return new int[][]{
                {matrix[bestRow][bestCol], matrix[bestRow][bestCol + 1]},
                {matrix[bestRow + 1][bestCol], matrix[bestRow + 1][bestCol + 1]}
        };
    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            System.out.println();
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }

        }
    }

    public static int[][] getMatrix(Scanner scanner, String regex) {
        String[] rowsAndCols = scanner.nextLine().split(regex);
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] element = scanner.nextLine().split(regex);
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(element[col]);
            }
        }
        return matrix;


    }

    public static int[][] getSquareMatrix(Scanner scanner, String regex) {
        String[] rowsAndCols = scanner.nextLine().split(regex);
        int rowsCols = Integer.parseInt(rowsAndCols[0]);
        int[][] matrix = new int[rowsCols][rowsCols];

        for (int row = 0; row < rowsCols; row++) {
            String[] element = scanner.nextLine().split(regex);
            for (int col = 0; col < rowsCols; col++) {
                matrix[row][col] = Integer.parseInt(element[col]);
            }
        }
        return matrix;


    }
}
