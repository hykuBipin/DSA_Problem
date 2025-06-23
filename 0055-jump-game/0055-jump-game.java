class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int minindex = n-1;

        for(int i=n-2; i >=0 ; i--)
        {
            if(i + nums[i] >= minindex)
            {
                minindex=i;
            }
        }
        return minindex==0;
    }
}