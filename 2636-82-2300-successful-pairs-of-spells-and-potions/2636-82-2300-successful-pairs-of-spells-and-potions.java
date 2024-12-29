class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length;
        int m=potions.length;
        int[] pairs=new int[n];
        Arrays.sort(potions);
        for(int i=0;i<n;i++)
        {
            int start=0,end=m-1;
            while(start<=end)
            {
                int mid= start + (end-start)/2;
                long product = (long) spells[i] * potions[mid];
                if(product >= success)
                {
                   end=mid-1;
                }else
                {
                   start=mid+1;
                }
            }
            pairs[i] = m-start;
        }
        return pairs;
    }
}