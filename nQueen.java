import java.util.Scanner;

public class nQueen {

    // static int getCount(boolean[][] board) {
    // int countDown = 0;
    // for (int row = 0; row < board.length; row++) {
    // for (int col = 0; col < board[row].length; col++) {
    // if (board[row][col]) {
    // System.out.println(board[row][col] + "\t" + row + "," + col);
    // countDown++;
    // }
    // }
    // }
    // return countDown;
    // }

    // static int countWays(boolean[][] board, int currentRow) {
    // int count = 0;

    // if (currentRow == board.length) {
    // System.out.println("Total Queen Placed : " + getCount(board));
    // return 1;
    // }

    // // Traverse all columns of board
    // for (int col = 0; col < board[currentRow].length; col++) {
    // if (isSafeArea(board, currentRow, col)) {
    // board[currentRow][col] = true;
    // count += countWays(board, currentRow + 1);
    // board[currentRow][col] = false;
    // }
    // }

    // return count;
    // }

    // static boolean isSafeArea(boolean[][] board, int row, int col) {
    // // Case 1 : Checking on above row on same column -> row--
    // for (int i = row; i >= 0; i--) {
    // if (board[i][col]) {
    // return false;
    // }
    // }
    // // Case 2 : Checking on upper left diagonal -> row--, col--
    // for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
    // if (board[i][j]) {
    // return false;
    // }
    // }
    // // Case 3 : Checking on upper right diagonal -> row--, col++
    // for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
    // if (board[i][j]) {
    // return false;
    // }
    // }
    // return true;
    // }

    // public static void main(String[] args) {
    // boolean[][] board = new boolean[4][4];
    // System.out.println(countWays(board, 0));
    // }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] chees = new int[n][n];
        printnQueen(chees, "", 0);
    }

    static void printnQueen(int[][] chees, String qsf, int row) {
        if (row == chees.length) {
            System.err.println(qsf);
            return;
        }
        for (int col = 0; col < chees.length; col++) {
            if (isItaSafePlaceforQueen(chees, row, col)) {
                chees[row][col] = 1;
                printnQueen(chees, qsf + row + "-" + col + ",", row + 1);
                // m printnQueen(chees, qsf + row + "-" + col + "," , row +1);

                chees[row][col] = 0;
            }
        }
    }

    static boolean isItaSafePlaceforQueen(int[][] chees, int row, int col) {
        // check vertivaaly if any queen is at position
        for (int i = row - 1, j = col; i >= 0; i--) {
            if (chees[i][j] == 1) {
                return false;
            }
        }

        // check for diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chees[i][j] == 1) {
                return false;
            }
        }

        //
        for (int i = row - 1, j = col + 1; i >= 0 && j < chees.length; i--, j++) {
            if (chees[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}
