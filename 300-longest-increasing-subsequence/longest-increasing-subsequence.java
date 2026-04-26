class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums==null) return -1;
        int n=nums.length;
        int maxlis=1;

        int[] dp =new int[n];
        Arrays.fill(dp,1);

        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                  if(nums[i] > nums[j])
                {
                    dp[i] =  Math.max(dp[i], dp[j]+1);
                }
            }
          maxlis = Math.max(maxlis,dp[i]);
        }
        return maxlis;
    }
}