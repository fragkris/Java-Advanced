package MultidimensiolArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = getSquareMatrix(scanner, "\\s+");

        Arrays.stream(returnDiagonal1(matrix)).forEach(e -> System.out.print(e + " "));
        System.out.println();
        Arrays.stream(returnDiagonal2(matrix)).forEach(e -> System.out.print(e + " "));

    }

    private static int[] returnDiagonal2(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        int col = 0;
        for (int i = matrix.length-1; i >= 0 ; i--) {
            int row = i;
                diagonal[col]=matrix[row][col++];


        }
        return diagonal;
    }

    private static int[] returnDiagonal1(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int i = 0; i <= matrix.length-1 ; i++) {
            int row = i;
            int col = i;
            diagonal[i]=matrix[row][col];
        }

        return diagonal;
    }
    public static int[][] getSquareMatrix(Scanner scanner, String regex) {
        String[] rowsAndCols = scanner.nextLine().split(regex);
        int rowsCols = Integer.parseInt(rowsAndCols[0]);
        int[][] matrix = new int[rowsCols][rowsCols];

        for (int row = 0; row < matrix.length; row++) {
            String [] e = scanner.nextLine().split(regex);
            for (int col = 0; col < e.length; col++) {
                matrix[row][col]= Integer.parseInt(e[col]);
            }
        }
//        for (int row = 0; row < matrix.length; row++) {
//            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//        }
        return matrix;


    }

}
