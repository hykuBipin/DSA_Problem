import java.util.List;
import java.util.HashSet;
import java.util.AbstractMap.SimpleEntry;
class Solution {
    public int numIslands(char[][] grid) {
        HashSet<SimpleEntry<Integer,Integer>> visited=new HashSet<>();
        int count=0;
        for(int r=0;r < grid.length; r++)
        {
            for(int c=0;c < grid[0].length; c++)
            {
                if(explore(r,c,grid,visited))
                {
                    count++;
                }
            }
        }
          return count;
    }

    public static boolean explore(int row, int column, char[][] grid, HashSet<SimpleEntry<Integer,Integer>> visited)
    {
    boolean rowInbounds = 0 <= row && row < grid.length;
    boolean colInbounds = 0 <= column && column < grid[0].length;
    if(!rowInbounds || !colInbounds)
    {
        return false;
    }
    
    if(grid[row][column]=='0')
    {
        return false;
    }

    SimpleEntry<Integer,Integer> pos =new SimpleEntry<>(row,column);
    if(visited.contains(pos))
    {
        return false;
    }
    visited.add(pos);

    explore(row+1,column,grid,visited);
    explore(row-1,column,grid,visited);
    explore(row,column-1,grid,visited);
    explore(row,column+1,grid,visited);
    return true;

    }
}