/**
 * @description:
 * @author: Tyranitar
 * @date: 2021/5/11 8:44
 **/
public class Offer13_movingCount {
    boolean[][] visit;

    public int movingCount(int m, int n, int k) {
        visit = new boolean[m][n];
        int count = 0;
        count = dfs(m, n, 0, 0, k, count);
        return count;
    }

    public int dfs(int m, int n, int i, int j, int k, int count) {
        int num = i / 10 + i % 10 + j / 10 + j % 10;
        if (i < 0 || i >= m || j < 0 || j >= n || num > k || visit[i][j])
            return count;
        count++;
        visit[i][j] = true;
        count = dfs(m, n, i + 1, j, k, count);
        count = dfs(m, n, i - 1, j, k, count);
        count = dfs(m, n, i, j + 1, k, count);
        count = dfs(m, n, i, j - 1, k, count);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Offer13_movingCount().movingCount(1, 2, 1));
    }
}
