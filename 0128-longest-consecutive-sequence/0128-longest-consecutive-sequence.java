class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;

        HashSet<Integer> set =new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }

        int count=0,current=0,longest=0;
        for(int num: set)
        {
            if(!set.contains(num-1))
            {
                count=1;
                current=num;
            while(set.contains(current+1))
            {
                count++;
                current++;
            }
           longest=Math.max(longest,count);
          }
        }
        return longest;
    }
}