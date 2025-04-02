class Solution {
    public int findKthNumber(int m, int n, int k) {
        int start=1,end=m*n;
        while(start <= end)
        {
            int mid=(start + end)/2;
            if(!possible(m,n,k,mid))
            {
                start=mid+1;
            }else
            {
                end=mid-1;
            }
        }
        return start;
    }

    boolean possible(int m, int n, int k, int target)
    {
        int count=0;
        for(int i=1;i<=m;i++)
        {
           count += Math.min(target/i,n);    
        }
        return count >= k;
    }
}