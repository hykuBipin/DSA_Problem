class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        if(m==0||n==0||matrix==null)
        {
        throw new IllegalArgumentException("Array Is null");
        }

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
               int temp=matrix[i][j];
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m/2;j++)
            {
               int temp=matrix[i][j];
               matrix[i][j]=matrix[i][n-1-j];
               matrix[i][n-1-j]=temp;
            }
        }
    }
}