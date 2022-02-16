package MultidimensiolArrays;

import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] matrix = getMatrix(scanner, ", ");

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(sumElements(matrix));




    }

    private static int sumElements(int[][] matrix) {
        int sum=0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col <matrix[0].length ; col++) {
                sum+=matrix[row][col];
            }
        }
        return sum;
    }

    public static int[][] getMatrix(Scanner scanner, String regex) {
        String[] rowsAndCols = scanner.nextLine().split(regex);
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] element = scanner.nextLine().split(regex);
            for (int col = 0; col < cols; col++) {
                matrix[row][col]=Integer.parseInt(element[col]);
            }
        }
        return matrix;
    }

}
