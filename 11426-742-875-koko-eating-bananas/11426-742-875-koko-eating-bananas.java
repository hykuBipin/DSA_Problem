class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int start=1,end=1000000000;
        while(start <= end)
        {
            int result=0;
            int mid=start+(end-start)/2;
            for(int i=0;i<n;i++)
            {
              result +=Math.ceil((1.0 * piles[i])/mid);
            }

                 if(result <= h)
                    {
                        end=mid-1;
                    }else
                    {
                        start=mid+1;
                    }
        }
        return start;
    }
}