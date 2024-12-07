import java.util.HashMap;
class Solution {
public static int minPathSum(int[][] grid) {
    return minPathSum(0, 0, grid, new HashMap<>());
    }

    public static int minPathSum(int r, int c, int[][] grid, HashMap<String, Integer> memo) {
        if (r >= grid.length || c >= grid[0].length) {
            return Integer.MAX_VALUE;
        }

        if (r == grid.length - 1 && c == grid[0].length - 1) {
            return grid[r][c];
        }

        String pos = r + "," + c;
        if (memo.containsKey(pos)) {
            return memo.get(pos);
        }

        int result = grid[r][c] + Math.min(
            minPathSum(r + 1, c, grid, memo), 
            minPathSum(r, c + 1, grid, memo)
        );

        memo.put(pos, result);
        return result;
    }
}