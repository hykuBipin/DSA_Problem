import java.util.HashSet;
import java.util.AbstractMap.SimpleEntry;

class Solution {
    public static int maxAreaOfIsland(int[][] grid) {
        HashSet<SimpleEntry<Integer, Integer>> visited = new HashSet<>();
        int m = grid.length;
        int n = grid[0].length;
        int maxArea = 0;

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 1 && !visited.contains(new SimpleEntry<>(r, c))) {
                    int area = calculateSize(r, c, grid, visited);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    public static int calculateSize(int r, int c, int[][] grid, HashSet<SimpleEntry<Integer, Integer>> visited) {
        boolean rowInbounds = 0 <= r && r < grid.length;
        boolean colInbounds = 0 <= c && c < grid[0].length;

        if (!rowInbounds || !colInbounds || grid[r][c] == 0) {
            return 0; 
        }

        SimpleEntry<Integer, Integer> pos = new SimpleEntry<>(r, c);
        if (visited.contains(pos)) {
            return 0;
        }

        visited.add(pos); 

        
        int totalSize = 1;
        totalSize += calculateSize(r + 1, c, grid, visited); 
        totalSize += calculateSize(r - 1, c, grid, visited); 
        totalSize += calculateSize(r, c + 1, grid, visited); 
        totalSize += calculateSize(r, c - 1, grid, visited); 

        return totalSize;
    }

}