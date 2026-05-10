class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums==null || nums.length <= 0) return new int[]{};
        int xorr=0;
        long rightmost = 0L;
        int bucket1=0,bucket2=0;

        for(int num: nums)
        {
           xorr ^= num; 
        }

        rightmost =  (xorr & (xorr - 1)) ^ xorr;

        for(int i=0;i<nums.length;i++)
        {
            if((nums[i] & rightmost)==0)
            {
               bucket1 = bucket1 ^ nums[i];     
            }else
            {
               bucket2 = bucket2 ^ nums[i];
            }
        }
        return new int[]{bucket1,bucket2};
    }
}

// Complexity	Value:
// Time Complexity	 : O(n)
// Space Complexity : O(1)