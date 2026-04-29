class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null || nums.length <= 0) return;
        int n=nums.length;
        int insertpos=0;

        for(int num:nums)
        { 
           if(num!=0)
           {
              nums[insertpos++]=num;
           }
        }

        while(insertpos < n)
        {
            nums[insertpos++]=0;
        }
    }
}