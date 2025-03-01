class Solution {
    public int mySqrt(int x) {
        int start=1,end=x;
        int ans=0;
        if(x <=0) return 0;

        while(start <= end)
        {
           int mid=(start+end)/2; 
           if(mid <= x/mid)
           {
                 ans=mid;
                 start=mid+1;

           }else
           {
                  end=mid-1;
           }
        }
        return ans;
    }
}