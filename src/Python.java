import java.util.Scanner;

public class Python {
    static int snakeRow = 0, snakeCol = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(", ");

        char[][] matrix = new char[n][n];
        int foodEaten = 0;
        int counterFood= 0;
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().replaceAll(" ", "");
            matrix[i] = line.toCharArray();

            if (line.contains("s")) {
                snakeRow = i;
                snakeCol = line.indexOf("s");
            }
        }
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                if (aChar=='f'){
                    counterFood++;
                }
            }
        }

        boolean isAlive = true;
            for (int i = 0; i < commands.length; i++) {
                String command = commands[i];
                switch (command) {
                    case "up":
                        if (snakeRow - 1 < 0) {
                            snakeRow = matrix.length - 1;
                        } else {
                            snakeRow--;
                        }
                        break;

                    case "down":
                        if (snakeRow + 1 > matrix.length - 1) {
                            snakeRow = 0;
                        } else {
                            snakeRow++;
                        }
                        break;

                    case "left":
                        if (snakeCol - 1 < 0) {
                            snakeCol = matrix.length - 1;
                        } else {
                            snakeCol--;
                        }
                        break;

                    case "right":
                        if (snakeCol + 1 > matrix.length - 1) {
                            snakeCol = 0;
                        } else {
                            snakeCol++;
                        }
                        break;
                }
                if (matrix[snakeRow][snakeCol] == 'f') {
                    foodEaten++;
                } else if (matrix[snakeRow][snakeCol] == 'e') {
                    System.out.println("You lose! Killed by an enemy!");
                    return;
                }
                if (counterFood == foodEaten) {
                    System.out.printf("You win! Final python length is %d%n", foodEaten + 1);
                    return;
                }
                matrix[snakeRow][snakeCol] = '*';
            }
            if (foodEaten<counterFood){
                System.out.printf("You lose! There is still %d food to be eaten.%n", counterFood-foodEaten);
            }
    }
}