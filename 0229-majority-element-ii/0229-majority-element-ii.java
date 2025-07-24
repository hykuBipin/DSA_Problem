class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //extended moore's algorithm
        int n=nums.length;
        if(nums==null || n==0)
        {
          throw new IllegalArgumentException("array is null");
        }

        int count1=0,count2=0;
        int ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
        List<Integer> list =new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            if(count1==0 && ele2 != nums[i])
            {
                count1=1;
                ele1=nums[i];
            }else if(count2==0 && ele1 != nums[i])
            {
                count2=1;
                ele2=nums[i];
            }else if(ele1==nums[i])
            {
                count1++;
            }else if(ele2==nums[i])
            {
                count2++;
            }else
            {
                count1--;count2--;
            }
        }

        count1=0;count2=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==ele1) count1++;
            if(nums[i]==ele2) count2++;
        }

        int mini =(int) (n/3)+1;
        if(count1>=mini) list.add(ele1);
        if(count2>=mini) list.add(ele2);
        return list;
    }
}