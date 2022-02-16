package MultidimensiolArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[][] matrix1 = getMatrix(scanner);
        int[][] matrix2 = getMatrix(scanner);

        if (ifEquals(matrix1, matrix2)){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }



    }
    private static boolean ifEquals(int[][]matrix1, int [][]matrix2){
        if ((matrix1.length+matrix1[0].length) != (matrix2.length+matrix2[0].length)){
         return false;
        }else {
            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col <matrix1[0].length ; col++) {
                    if(matrix1[row][col]!=matrix2[row][col])
                        return false;
                }
            }
        }
        return true;
    }
    private static int matrixInputSize(Scanner scanner){
        int data = scanner.nextInt();

        return data;
    }

    public static int[][] getMatrix(Scanner scanner) {
        int rows = matrixInputSize(scanner);
        int cols = matrixInputSize(scanner);
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
        return matrix;

    }
}
