package gr.aueb.cf.ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Project8 {

    private static int[][] board = new int[3][3];
    private static int currentPlayer = 1;

    public static void main(String[] args) {

        System.out.println("Welcome to the tic tac toe game!");
        Scanner in = new Scanner(System.in);
        boolean gameOver = false;
        int row, col;

        while (!gameOver) {
            System.out.println("Please enter row and column of your move, (integers between 1 - 3)");
            try {
                row = in.nextInt() - 1;
                col = in.nextInt() - 1;
            } catch (InputMismatchException e) {
                System.out.println("Not valid input, try again!");
                in.nextLine();
                continue;
            }
            if (isInputValid(row, col)) {
                if (makeMove(row, col)) System.out.println("Successful move.");
                else {
                    System.out.println("The seat is occupied, try again!");
                    continue;
                }
            } else {
                System.out.println("Not valid input, try again!");
                continue;
            }
            displayBoard(board);
            if (checkWin(board)) {
                System.out.printf("Player %d wins!!!\n", currentPlayer);
                gameOver = true;
            } else if (checkTie(board)) {
                System.out.println("The game is tied!");
                gameOver = true;
            } else {
                currentPlayer = switchPlayers(currentPlayer);
                System.out.printf("Time for player %d to make a move.", currentPlayer);
            }
        }
    }

    /*
     εμφανίζει κάθε φορά τον πίνακα της τρίλιζας
     */
    public static void displayBoard(int[][] board) {
        System.out.println("-----------");
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j ++) {
                if (board[i][j] == 1) System.out.print("O | ");
                else if (board[i][j] == 2) System.out.print("X | ");
                else System.out.print("  | ");
            }
            System.out.println();
        }
        System.out.print("-----------\n");
    }

    /*
     ελέγχει αν γίνεται η κίνηση και αν γίνεται την πραγματοποιεί
     */
    public static boolean makeMove(int row, int column) {
        if (board[row][column] != 0) return false;
        else {
            board[row][column] = currentPlayer;
            return true;
        }
    }

    public static boolean checkWin(int[][] board) {
        //ελέγχει τις σειρές
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][2] != 0) {
                return true;
            }
        }

        //ελέγχει τις διαγωνίους
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] != 0) {
            return true;
        } else if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] != 0) {
            return true;
        }

        //ελέγχει τις κάθετους
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[2][i] != 0) {
                return true;
            }
        }

        return false;
    }

    /*
     ελέγχει αν είναι ισοπαλία
     */
    public static boolean checkTie(int[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) return false;
            }
        }
        return true;
    }

    /*
     ελέγχει αν ο ακέραιος που δόθηκε είναι εντός εύρους
     */
    public static boolean isInputValid(int row, int col) {
        if (row < 0 || row > 2) return false;
        if (col < 0 || col > 2) return false;
        return true;
    }

    /*
     αλλάζει παίχτες
     */
    public static int switchPlayers(int currentPlayer) {
        if (currentPlayer == 1) return 2;
        else return 1;
    }
}
