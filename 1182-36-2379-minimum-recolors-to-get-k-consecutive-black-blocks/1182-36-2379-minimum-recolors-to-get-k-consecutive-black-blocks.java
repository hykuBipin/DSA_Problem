class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int minops=Integer.MAX_VALUE;
        int currWcount=0;

        for(int i=0;i<k;i++)
        {
            if(blocks.charAt(i)=='W')
            {
                currWcount++;
            }
        }

        minops=currWcount;
        for(int i=k;i<n;i++)
        {
            if(blocks.charAt(i-k)=='W')
            {
                currWcount--;
            }

            if(blocks.charAt(i)=='W')
            {
                currWcount++;
            }

            minops=Math.min(minops,currWcount);
        }
        return minops;
    }
}