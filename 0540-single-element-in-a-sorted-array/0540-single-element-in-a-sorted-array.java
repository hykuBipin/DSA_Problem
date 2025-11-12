class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n <= 0)
        {
           throw new IllegalArgumentException("Array is null or empty"); 
        }
        int temp=nums[0];
        for(int i=1;i<n;i++)
        {
           int result = nums[i] ^ temp;
           temp=result;
        }
        return temp;
    }
}