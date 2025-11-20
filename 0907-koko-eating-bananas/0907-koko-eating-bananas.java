class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1,high=1000000000;
        if(n<=0) return -1;

        while(low <= high)
        {  
            long result=0;
            int mid = low + (high-low)/2;

           for(int pile:piles)
           {
              result += (pile + mid - 1) / mid;
           }
              if(result <= h)
              {
                 high=mid-1;
              }else
              {
                 low=mid+1;
              }
        }
        return low;
    }
}