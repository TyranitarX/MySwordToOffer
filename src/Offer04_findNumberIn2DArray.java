/**
 * @description:
 * @author: Tyranitar
 * @date: 2021/5/7 8:54
 **/

public class Offer04_findNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col <= matrix[0].length - 1) {
            if (target < matrix[row][col])
                row--;
            else if (target > matrix[row][col])
                col++;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int[][] matrix2 = {
                {-5},
        };
        System.out.println(new Offer04_findNumberIn2DArray().findNumberIn2DArray(matrix2, -5));
    }
}
