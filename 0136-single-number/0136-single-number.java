class Solution {
    public int singleNumber(int[] nums) {
        int N=nums.length;
        int result=0;
        
        for(int i=0; i<N;i++)
        {
            result = result^nums[i];
        }
        return result;
    }
}