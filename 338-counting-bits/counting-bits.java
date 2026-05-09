class Solution {
    public int[] countBits(int n) {
        //Brian Kernighan's Algorithm
       if(n<0) return new int[]{};
       int[] result = new int[n+1];
       result[0]=0;

       for(int i=1;i<=n;i++)
       {
         result[i] = result[i & (i-1)] + 1;
       }
       return result;
    }
}