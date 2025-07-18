class Solution {
    public void sortColors(int[] nums) {
        //Dutch National flag algorithm - 3 pointer
        int n=nums.length;
        if(nums==null || n==0)
        {
          throw new IllegalArgumentException("Array should not be null");
        }

        int low=0,mid=0,high=n-1;
        int cout0=0,cout1=0,cout2=0;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
               int temp=nums[low];
               nums[low]=nums[mid];
               nums[mid]=temp;
               low++;
               mid++;
            }else if(nums[mid]==1)
            {
                mid++;
            }else if(nums[mid]==2)
            {
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
    }
}