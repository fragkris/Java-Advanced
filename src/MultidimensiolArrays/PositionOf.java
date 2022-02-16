package MultidimensiolArrays;

import java.util.Scanner;

public class PositionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][]matrix = getMatrix(scanner);

        foundMatch(matrix,scanner);



    }

    private static void foundMatch(int[][] matrix, Scanner scanner) {
        int toBeFound = scanner.nextInt();
        boolean isFound =false;
        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col]==toBeFound){
                    System.out.println(row + " " + col);
                    isFound=true;
                }
            }
        }
        if (!isFound){
            System.out.println("not found");
        }

    }

    public static int[][] getMatrix (Scanner scanner){
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int [][] matrix= new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] =scanner.nextInt();
            }
        }

        return matrix;
    }
}
