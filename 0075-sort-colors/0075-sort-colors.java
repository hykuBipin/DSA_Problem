class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        if( n < 2) return;
        int left=0,right=n-1,current=0;
        while(current <= right)
        {
            if(nums[current]==0)
            {
                swap(nums,left,current);
                left++;
                current++;
            }else if(nums[current]==1)
            {
                current++;
            }else
            {
                swap(nums,right,current);
                right--;
            }
        }
    }

    public static void swap(int[] nums, int left, int right)
    {
        int temp = nums[right];
        nums[right]=nums[left];
        nums[left] =temp;
    }
}