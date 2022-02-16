package MultidimensiolArrays;

import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] chessBoard = createMatrix(scanner);
        findRealQueen(chessBoard);

    }

    private static void findRealQueen(String[][] chessBoard) {
        int[] coordinates = new int[2];
        for (int row = 0; row < chessBoard.length; row++) {
            for (int col = 0; col < chessBoard[0].length; col++) {
                if (chessBoard[row][col].equals("q")) {
                    if (checkVertical(row, col, chessBoard)) {
                        if (checkHorizontal(row, col, chessBoard)) {
                            if (checkDiagonal(row, col, chessBoard)) {
                                coordinates[0] = row;
                                coordinates[1] = col;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(coordinates[0] + " " + coordinates[1]);
    }

    private static boolean checkDiagonal(int row, int col, String[][] chessBoard) {
        int currentCol = col;
        int currentRow = row;

        while (currentCol-- > 0 && currentRow-- > 0) {
            if (chessBoard[currentRow][currentCol].equals("q")) {
                return false;

            }
        }

        currentCol = col;
        currentRow = row;
        while (currentCol++ < chessBoard[0].length - 1 && currentRow++ < chessBoard.length - 1) {
            if (chessBoard[currentRow][currentCol].equals("q")) {
                return false;
            }
        }

        while (currentCol-- > 0 && currentRow++ < chessBoard.length - 1) {
            if (chessBoard[currentRow][currentCol].equals("q")) {
                return false;

            }
        }

        currentCol = col;
        currentRow = row;
        while (currentCol++ < chessBoard[0].length - 1 && currentRow-- > 0) {

            if (chessBoard[currentRow][currentCol].equals("q")) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkHorizontal(int row, int col, String[][] chessBoard) {
        int currentCol = col;

        while (currentCol > 0) {
            currentCol--;
            if (chessBoard[row][currentCol].equals("q")) {
                return false;
            }
        }

        currentCol = col;
        while (currentCol < chessBoard[0].length - 1) {
            currentCol++;
            if (chessBoard[row][currentCol].equals("q")) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkVertical(int row, int col, String[][] chessBoard) {
        int currentRow = row;

        while (currentRow > 0) {
            currentRow--;
            if (chessBoard[currentRow][col].equals("q")) {
                return false;
            }
        }

        currentRow = row;
        while (currentRow < chessBoard.length - 1) {
            currentRow++;
            if (chessBoard[currentRow][col].equals("q")) {
                return false;
            }
        }
        return true;
    }

    private static String[][] createMatrix(Scanner scanner) {
        String[][] matrix = new String[8][8];
        for (int row = 0; row < 8; row++) {
            String[] rowInput = scanner.nextLine().split(" ");
            matrix[row] = rowInput;
        }
        return matrix;
    }
}

