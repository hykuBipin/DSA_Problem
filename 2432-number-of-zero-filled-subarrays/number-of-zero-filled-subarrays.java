class Solution {
    public long zeroFilledSubarray(int[] nums) {
          if(nums==null || nums.length<=0) return 0;
          int n=nums.length;
          int count=0;
          long result=0;

          for(int num:nums)
          {
            if(num==0)
            {
                count++;
            }else
            {
                count=0;
            }
            result += count;
          }
          return result;
    }
}