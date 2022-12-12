public class WordSearch {
    static char board[][]={
        {'A','C','B','D'},
        {'E','E','H','D'},
        {'R','E','Y','S'},
    };
    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, int i, int j, int count, String word) {
        if (count == word.length())
            return true;
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(count))
            return false;
        char temp = board[i][j];
        board[i][j] = '*';  //BACKTRACK VISITED CHAR
        boolean found = dfs(board, i + 1, j, count + 1, word) || dfs(board, i - 1, j, count + 1, word)
                || dfs(board, i, j + 1, count + 1, word) || dfs(board, i, j - 1, count + 1, word);
        board[i][j] = temp;
        return found;
    }

    public static void main(String[] args) {
        // char[][] board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]];
        String word="YH";
        System.out.println(exist( board,  word));
    }
}
