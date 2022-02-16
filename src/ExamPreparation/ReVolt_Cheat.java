package ExamPreparation;

import java.util.Scanner;

public class ReVolt_Cheat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int linesCount = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];
        int[] playerPosition = new int[2];
        //index 0 is the row of the player
        //index 1 is the col

        for (int row = 0; row < size; row++) {
            String line = scanner.nextLine();
            matrix[row] = line.toCharArray();

            if (line.contains("f")) {
                playerPosition[0] = row;
                playerPosition[1] = line.indexOf("f");
            }

        }
        boolean playerWon = false;
        while (linesCount-- > 0 && !playerWon) {
            String command = scanner.nextLine();

            if (command.equals("up")) {
                playerWon = movePlayer(playerPosition, matrix,-1,0);

            } else if (command.equals("down")) {
                playerWon = movePlayer(playerPosition, matrix,+1,0);


            } else if (command.equals("left")) {
                playerWon = movePlayer(playerPosition, matrix,0,-1);


            } else if (command.equals("right")) {
                playerWon = movePlayer(playerPosition, matrix,0,+1);


            }
        }

        if (playerWon) {
            System.out.println("Player won!");
        } else {
            System.out.println("Player lost!");
        }
        printMatrix(matrix);

    }

    private static boolean movePlayer(int[] playerPosition, char[][] matrix, int rowModification, int colModification) {
        //up - 1
        int row = playerPosition[0];
        int col = playerPosition[1];
        int newRow = ensureIndexIsInBounds(row + rowModification, matrix.length);
        int newCol = ensureIndexIsInBounds(col + colModification, matrix.length);
        boolean hasWon = false;


         if (matrix[newRow][newCol] == 'B') {
            newRow = ensureIndexIsInBounds(newRow+rowModification,matrix.length);
            newCol = ensureIndexIsInBounds(newCol+colModification,matrix.length);

        } else if (matrix[newRow][newCol] == 'T') {
            newRow = row;
            newCol = col;
        }
        if (matrix[newRow][newCol] == 'F') {
            hasWon = true;
        }

        matrix[row][col] = '-';
        matrix[newRow][newCol] = 'f';
        playerPosition[0] = newRow;
        playerPosition[1] = newCol;
        return hasWon;
    }

    private static int ensureIndexIsInBounds(int index, int bounds) {
        if (index<0||index>=bounds){
            index=bounds-1;
        }else if (index>=bounds){
            index=0;
        }
        return index;

    }

    private static void printMatrix(char[][] matrix) {
        for (char[] array : matrix) {
            for (char c : array) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
