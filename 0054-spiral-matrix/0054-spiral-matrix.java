class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        if(n==0 || m==0 || matrix==null)
        {
          throw new IllegalArgumentException("Array is null");
        }

        int left=0,right=m-1,top=0,bottom=n-1;
        ArrayList<Integer> list=new ArrayList<>();

        while(top <= bottom && left <= right)
        {
            for(int i=left;i<=right;i++)
            {
               list.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++)
            {
               list.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    list.add(matrix[bottom][i]);
                }
                bottom--;                
            }

            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    list.add(matrix[i][left]);
                }
                left++;                
            }

        }
        return list;
    }
}