package MultidimensiolArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        char[][] matrix1 = getMatrix(rows, cols, scanner);
        char[][] matrix2 = getMatrix(rows, cols, scanner);

        char[][] matrix3 = (isSimiliar(matrix1, matrix2));
        for (int row = 0; row < matrix3.length; row++) {
            for (int col = 0; col < matrix3[0].length; col++) {
                System.out.print(matrix3[row][col] + " ");
            }
            System.out.println();
        }

    }

    private static char[][] isSimiliar(char[][] matrix1, char[][] matrix2) {
        char[][] matrix = new char[matrix1.length][matrix1[0].length];

        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                if (matrix1[row][col] == matrix2[row][col]) {
                    matrix[row][col] = (char) matrix1[row][col];
                } else {
                    matrix[row][col] = '*';
                }
            }

        }

        return matrix;
    }

    private static char[][] getMatrix(int rows, int cols, Scanner scanner) {

        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char a = scanner.next().charAt(0);
                matrix[row][col] = a;
            }
        }
        return matrix;
    }
}
