class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;

        int xor1=0;   
        for(int num: nums)
        {
           xor1 = xor1 ^ num; 
        }
        return xor1;
    }
}