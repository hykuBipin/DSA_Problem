class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int N=weights.length;
        if(N==0) return 0;
        int totalsum=0,maxsum=0;
        int ans=0;

        for(int num:weights)
        {
            totalsum= totalsum+num;
            maxsum= Math.max(maxsum,num);
        }
         int start=maxsum,end=totalsum;
         while(start <= end)
         {
             int mid=(start +end)/2;
            if(possible(weights,days,mid))
            {
                ans=mid;
                end=mid-1;
            }else
            {
                start=mid+1;
            }
          
         }
        
        return ans;
    }
    
    boolean possible(int[] weights, int days, int capacity)
    {
       int daysPlaced = 1;
        int currentLoad = 0;

        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                daysPlaced++;
                currentLoad = weight; 
                if (daysPlaced > days) {
                    return false; 
                }
            } else {
                currentLoad += weight; 
            }
        }

        return true;
    }
}
