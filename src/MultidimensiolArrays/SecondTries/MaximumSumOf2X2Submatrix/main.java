package MultidimensiolArrays.SecondTries.MaximumSumOf2X2Submatrix;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = createMatrix(scanner);
        printMatrix(findBiggest2x2(matrix));
        printSumOfMatrix(findBiggest2x2(matrix));

    }

    private static int[][] findBiggest2x2(int[][] matrix) {
        int[][] biggestDimensions = new int[0][];
        int sum = 0;
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int currentSum = matrix[row][col] + matrix[row + 1][col]
                        + matrix[row][col + 1] + matrix[row + 1][col + 1];
                if (currentSum > sum) {
                    sum = currentSum;
                    biggestDimensions = new int[][]{
                            {matrix[row][col], matrix[row][col + 1]},
                            {matrix[row + 1][col], matrix[row + 1][col + 1]}
                    };
                }
            }
        }
        return biggestDimensions;
    }

    private static void printSumOfMatrix(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int e : row) {
                sum += e;
            }
        }
        System.out.println(sum);
    }

    private static void printMatrix(int[][] biggestDimensions) {
        for (int[] biggestDimension : biggestDimensions) {
            for (int i : biggestDimension) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static int[][] createMatrix(Scanner scanner) {
        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimensions[0], cols = dimensions[1];
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] nums = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = nums;
        }
        return matrix;
    }

}
