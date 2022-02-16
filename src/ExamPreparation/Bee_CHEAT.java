package ExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class Bee_CHEAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] territory = new char[n][n];

        //B - bee
        //f - flower
        //O - bonus
        //. - empty
        int[] beePosition = new int[2];

        for (int row = 0; row < n; row++) {
            String line = scanner.nextLine();
            territory[row] = line.toCharArray();
            if (line.contains("B")) {
                beePosition[0] = row;
                beePosition[1] = line.indexOf("B");
            }
        }
        //        for (int row = 0; row < territory.length; row++) {
//            for (int col = 0; col < territory[row].length; col++) {
//                if (territory[row][col]== 'B'){
//                    beePosition[0]=row;
//                    beePosition[1]=col;
//                }
//            }
//        }
        String command = scanner.nextLine();
        int pollinated = 0;
        boolean outOfBound = false;

        while (!command.equals("End") && !outOfBound) {

            switch (command) {
                case "up":
                    if (beePosition[0] - 1 < 0) {
                        System.out.println("The bee got lost!");
                        territory[beePosition[0]][beePosition[1]] = '.';
                        outOfBound = true;
                        break;
                    } else {
                        territory[beePosition[0]][beePosition[1]] = '.';
                        beePosition[0] = beePosition[0] - 1;
                        if (territory[beePosition[0]][beePosition[1]] == 'O') {
                            territory[beePosition[0]][beePosition[1]] = '.';
                            beePosition[0] = beePosition[0] - 1;

                        }
                        if (territory[beePosition[0]][beePosition[1]] == 'f') {
                            territory[beePosition[0]][beePosition[1]] = '.';
                            pollinated++;
                        }
                        territory[beePosition[0]][beePosition[1]] = 'B';
                    }

                    break;

                case "down":
                    if (beePosition[0] + 1 > n - 1) {
                        System.out.println("The bee got lost!");
                        territory[beePosition[0]][beePosition[1]] = '.';
                        outOfBound = true;
                        break;
                    } else {
                        territory[beePosition[0]][beePosition[1]] = '.';
                        beePosition[0] = beePosition[0] + 1;
                        if (territory[beePosition[0]][beePosition[1]] == 'O') {
                            territory[beePosition[0]][beePosition[1]] = '.';
                            beePosition[0] = beePosition[0] + 1;
                        }
                        if (territory[beePosition[0]][beePosition[1]] == 'f') {
                            territory[beePosition[0]][beePosition[1]] = '.';
                            pollinated++;
                        }
                        territory[beePosition[0]][beePosition[1]] = 'B';
                    }
                    break;

                case "left":
                    if (beePosition[1] - 1 < 0) {
                        System.out.println("The bee got lost!");
                        territory[beePosition[0]][beePosition[1]] = '.';
                        outOfBound = true;
                        break;
                    } else {
                        territory[beePosition[0]][beePosition[1]] = '.';
                        beePosition[1] = beePosition[1] - 1;
                        if (territory[beePosition[0]][beePosition[1]] == 'O') {
                            territory[beePosition[0]][beePosition[1]] = '.';
                            beePosition[1] = beePosition[1] - 1;
                        }
                        if (territory[beePosition[0]][beePosition[1]] == 'f') {
                            territory[beePosition[0]][beePosition[1]] = '.';
                            pollinated++;
                        }

                        territory[beePosition[0]][beePosition[1]] = 'B';
                    }
                    break;

                case "right":
                    if (beePosition[1] + 1 > n - 1) {
                        System.out.println("The bee got lost!");
                        territory[beePosition[0]][beePosition[1]] = '.';
                        outOfBound = true;
                        break;
                    } else {
                        territory[beePosition[0]][beePosition[1]] = '.';
                        beePosition[1] = beePosition[1] + 1;
                        if (territory[beePosition[0]][beePosition[1]] == 'O') {
                            territory[beePosition[0]][beePosition[1]] = '.';
                            beePosition[1] = beePosition[1] + 1;
                        }
                        if (territory[beePosition[0]][beePosition[1]] == 'f') {
                            territory[beePosition[0]][beePosition[1]] = '.';
                            pollinated++;
                        }
                        territory[beePosition[0]][beePosition[1]] = 'B';
                    }
                    break;
            }
            if (!outOfBound) {
                command = scanner.nextLine();
            }else {
                break;
            }
        }

        if (pollinated>=5){
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n", pollinated);
        }else {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n", 5-pollinated);
        }
        printMatrix(territory);
    }

    private static void printMatrix(char[][] territory) {
        for (char[] array : territory) {
            for (char c : array) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
