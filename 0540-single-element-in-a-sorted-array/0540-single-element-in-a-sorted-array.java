class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n <= 0)
        {
           throw new IllegalArgumentException("Array is null or empty"); 
        }
        int result=0;
        for(int i=0;i<n;i++)
        {
           result = nums[i] ^ result;
        }
        return result;
    }
}