class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(nums==null || n==0) return -1;

        int i=0;
        for(int j=1; j < n; j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}