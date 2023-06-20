

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

    }

    private static void printGameTableOld(char[][] gameTable) {

    }

    private static void printGameTable(char[][] gameTable) {

    }


    private static void makeUserMove(char[][] gameTable) {

    }

    private static boolean makeUserMoveToCell(char[][] gameTable, char digit) {

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