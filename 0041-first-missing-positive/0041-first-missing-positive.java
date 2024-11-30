class Solution {
    public int firstMissingPositive(int[] nums) 
    {
         int n = nums.length;
         boolean[] seen = new boolean[n+1];
           for(int num: nums)
           {
               if(num > 0 && num <= n)
               {
                   seen[num] = true;
               }

           }
        
          for(int j=1; j <= n; j++)
          {
              if(!seen[j])
              {
                  return j;
              }
          }
        return n+1;
    }
}