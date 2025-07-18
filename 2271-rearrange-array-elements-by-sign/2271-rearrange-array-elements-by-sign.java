class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        if(nums==null || n==0)
        {
         throw new IllegalArgumentException("Array is empty");
        }

        int pos=0,neg=1;
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
        {
           if(nums[i] > 0)
           {
             ans[pos]=nums[i];
             pos+=2;
           }else
           {
             ans[neg]=nums[i];
             neg+=2;
           }
        }
      return ans;
    }
}