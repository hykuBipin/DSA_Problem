class Solution {
    public void setZeroes(int[][] matrix) {
        //Optimal solution
        int n=matrix.length;
        int m=matrix[0].length;

        if(n==0||m==0||matrix==null)
        {
           throw new IllegalArgumentException("Array is null");
        }

        int col0=1;

    //setting up mrk for 1st row and column
        for(int i=0;i<n;i++)
        {
            if (matrix[i][0] == 0)
            {
                col0=0;
            }

            for(int j=1;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        //traverse from 1 to n-1,m-1
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }

        //handle first row
        if (matrix[0][0] == 0) 
        {
            for(int j=0;j<m;j++)
            {
               matrix[0][j]=0;
            }
        }

       //Handle first column
        if (col0==0)
        {
           for(int i=0;i<n;i++)
            {
               matrix[i][0]=0;
            }
        }
  
    }
}