class Solution {
    public int rob(int[] nums) {
        int m=nums.length;
        int[] dp=new int[m];
        if(nums.length==0 || nums==null) return 0;
        if(nums.length==1)return nums[0];
        dp[0]=nums[0];dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<m;i++)
        {
            dp[i]=Math.max(nums[i] + dp[i-2],dp[i-1]);
        }
        return dp[m-1];
    }
}