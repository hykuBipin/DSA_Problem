import java.util.*;
class Solution {
    public int maxOperations(int[] nums, int k) {
        int n=nums.length;
        int i=0;int j=n-1;
        int count=0;
        Arrays.sort(nums);
        while(i<j)
        {
            if(nums[i]+nums[j] == k)
            {
                count++;
                i++;
                j--;
            } else if(nums[i] +nums[j] < k)
            {
                i++;
            } else
            {
                j--;
            }
                
        }
        return count;
    }
}