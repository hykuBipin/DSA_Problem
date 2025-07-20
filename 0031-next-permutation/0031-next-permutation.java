class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        if(nums==null || n==0)
        {
            throw new IllegalArgumentException("Array is null");
        }

       int i=n-2;

       while(i>=0 && nums[i] >= nums[i+1])
       {
          i--;
       }

       if(i>=0)
       {
          int j=n-1;
          while(nums[j] <= nums[i])
          {
            j--;
          }
          swap(nums,i,j);
       }
       reverse(nums,i+1);
    }

    public static void reverse(int[] nums, int start)
    {
        int left=start,right=nums.length-1;
        while(left< right)
        {
            swap(nums,left,right);
            left++;
            right--;
        }
    }

    public static void swap(int[] nums, int i, int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp; 
    }
}