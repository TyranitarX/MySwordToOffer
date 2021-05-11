/**
 * @description:
 * @author: Tyranitar
 * @date: 2021/5/10 8:42
 **/
public class Offer12_exist {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean judge;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                judge = find(i, j, board, word, 0);
                if (judge)
                    return true;
            }
        }
        return false;
    }

    public boolean find(int m, int n, char[][] board, String word, int pos) {
        if (m < 0 || n < 0 || m >= board.length || n >= board[0].length || board[m][n] != word.charAt(pos))
            return false;
        if (pos == word.length() - 1)
            return true;
        board[m][n] = '¿';
        boolean res = find(m - 1, n, board, word, pos + 1)
                || find(m + 1, n, board, word, pos + 1)
                || find(m, n - 1, board, word, pos + 1)
                || find(m, n + 1, board, word, pos + 1);
        board[m][n] = word.charAt(pos);
        return res;
    }

    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        char[][] board1 = {{'A', 'B'}, {'C', 'D'}};
        String word = "abcd";
        System.out.println(new Offer12_exist().exist(board1, word));
    }
}
