class Solution {
    public int rob(int[] nums) {
        if(nums==null) return -1;
        int n=nums.length;

        if(n==1) return nums[0];

        int case1 = robrange(nums,0,n-2);
        int case2 = robrange(nums,1,n-1);
        
        return Math.max(case1,case2);
    }

    public int robrange(int[] nums, int start, int end)
    {
        int size=end-start+1;
        int[] dp = new int[size];

        if(size==1) return nums[start];

        dp[0] = nums[start];
        dp[1] = Math.max(nums[start],nums[start+1]);    

        for(int i=2 ;i <size;i++)
        {
             dp[i] = Math.max(nums[start+i]+dp[i-2],dp[i-1]);
        }

        return dp[size-1];
    }
}