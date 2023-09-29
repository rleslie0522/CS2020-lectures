import java.util.Scanner;


public class TicTacToe {
    private static char[][] board = {
        {'-','-',}
        {'-','-',}
        {'-','-',}
    };
    private static char currentPlayer = "X";
}

public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int moves = 0;

    while (moves < 9) {
        printBoard();

        System.out.println(currentPlayer + "enter row and column: ")
    }
}

private static void printBoard() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; i++) {
        
}