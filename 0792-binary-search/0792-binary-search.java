class Solution {
    public int search(int[] nums, int target) {
       int n=nums.length;
       int low=0;
       int high=n-1;
       if(n==0 || nums==null)
       {
         throw new IllegalArgumentException("Array is Null");
       }

       while(low <= high)
       {
          int mid= low + (high -low)/2;
          if(nums[mid]==target)
          {
             return mid;
          }else if(nums[mid] < target)
          {
             low=mid+1;
          }else
          {
            high=mid-1;
          }
       }
       return -1;
    }

}