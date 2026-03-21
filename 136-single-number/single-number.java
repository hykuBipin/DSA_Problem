class Solution {
    public int singleNumber(int[] nums) {
        if(nums==null) return -1;
        int n=nums.length;
        int result=nums[0];

        for(int i=1;i<n;i++)
        {
            result = result ^ nums[i];
        }
        return result;
    }
}