

import java.util.Random;
import java.util.Scanner;

public class game_noughts_and_crosses {
    public static void main(String[] args) {
        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9:");
        printTableMapping();
        char[][] gameTable = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        if (new Random().nextBoolean()) {
            makeComputerMove(gameTable);
            printGameTable(gameTable);
        }
        while (true) {
            makeUserMove(gameTable);
            printGameTable(gameTable);
            if (isUserWin(gameTable)) {
                System.out.println("YOU WIN");
                break;
            }
            if (isDraw(gameTable)) {
                System.out.println("Sorry ,DRAW");
                break;
            }
            makeComputerMove(gameTable);
            printGameTable(gameTable);
            if (isComputerWin(gameTable)) {
                System.out.println("COMPUTER WIN");
                break;
            }
            if (isDraw(gameTable)) {
                System.out.println("Sorry ,DRAW");
                break;
            }
        }
        System.out.println("GAME OVER");
    }


    private static void printTableMapping() {
        char[][] mappingTable = {
                {'7', '8', '9'},
                {'4', '5', '6'},
                {'1', '2', '3'}
        };
        printGameTable(mappingTable);
//        for (int i = 0; i < 3; i++) {
//            System.out.println("-------------");
//            for (int j = 0; j < 3; j++) {
//                System.out.print("| " + mappingTable[i][j] + " ");
//            }
//            System.out.println("|");
//        }
//        System.out.println("-------------");
    }

    private static void printGameTableOld(char[][] gameTable) {
        System.out.println("-------------");
        System.out.println("| " + gameTable[0][0] + " | " + gameTable[0][1] + " | " + gameTable[0][2] + " |");
        System.out.println("-------------");
        System.out.println("| " + gameTable[1][0] + " | " + gameTable[1][1] + " | " + gameTable[1][2] + " |");
        System.out.println("-------------");
        System.out.println("| " + gameTable[2][0] + " | " + gameTable[2][1] + " | " + gameTable[2][2] + " |");
        System.out.println("-------------");
    }

    private static void printGameTable(char[][] gameTable) {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + gameTable[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }


    private static void makeUserMove(char[][] gameTable) {
        while (true) {
            System.out.println("Please type number between 1 and 9:");
//            Scanner userNum = new Scanner(System.in);
            String string = new Scanner(System.in).nextLine();
            if (string.length() == 1) {
                char ch1 = string.charAt(0);
//                int number = userNum.nextInt();
//                char ch = Character.forDigit(number, 10);
                if (ch1 >= '1' & ch1 <= '9') {
                    if (makeUserMoveToCell(gameTable, ch1)) {
                        return;
                    }
                }
            }
        }
    }


    private static boolean makeUserMoveToCell(char[][] gameTable, char digit) {
        char[][] mappingTable = {
                {'7', '8', '9'},
                {'4', '5', '6'},
                {'1', '2', '3'}
        };
        for (int i = 0; i < mappingTable.length; i++) {
            for (int j = 0; j < mappingTable[i].length; j++) {
                if (mappingTable[i][j] == digit) {
                    if (gameTable[i][j] != '0' && gameTable[i][j] != 'X') {
                        gameTable[i][j] = 'X';
                        return true;
                    } else {

                        System.out.println("Can't make a move, because the cell is not free! Try again!");
                        return false;
                    }
                }
            }
        }
        return false;
    }

    private static void makeComputerMove(char[][] gameTable) {

    }

    private static boolean isUserWin(char[][] gameTable) {
        return false;

    }

    private static boolean isComputerWin(char[][] gameTable) {
        return false;
    }

    private static boolean isWinner(char[][] gameTable, char ch) {
        return false;
    }

    private static boolean isDraw(char[][] gameTable) {
        return false;

    }
}