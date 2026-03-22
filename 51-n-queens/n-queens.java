class Solution {
     List<List<String>> result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        if(n<=0) return new ArrayList<>();
        HashSet<Integer> column = new HashSet<>();
        HashSet<Integer> diagonal1 = new HashSet<>();
        HashSet<Integer> diagonal2 = new HashSet<>();

        //construct board
        char[][] board =new char[n][n];
        for(int i=0;i<n;i++)
        {
          Arrays.fill(board[i],'.');
        }

        backtrack(0,n,board,column,diagonal1,diagonal2);

        return result;
    }

    public void backtrack(int row,int n, char[][] board, HashSet<Integer> column, HashSet<Integer> diagonal1, HashSet<Integer> diagonal2)
    {
        if(row==n)
        {
            result.add(construct(board));
            return;
        }

        //Skipping conditions
        for(int col=0;col<n;col++)
        {
            if((column.contains(col)) || (diagonal1.contains(row-col)) || (diagonal2.contains(row+col)))
            {
                continue;
            }

        //place queen
        board[row][col]='Q';
        column.add(col);
        diagonal1.add(row-col);
        diagonal2.add(row+col);

        backtrack(row+1,n,board,column,diagonal1,diagonal2);

        //unset the invalid with backtrack
        board[row][col]='.';
        column.remove(col);
        diagonal1.remove(row-col);
        diagonal2.remove(row+col);
       }
    }

    public List<String> construct(char[][] board)
    {
        List<String> list =new ArrayList<>();

        for(char[] row: board)
        {
            list.add(new String(row));
        }
        return list;
    }
}