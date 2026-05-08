class Solution {
    public int hammingWeight(int n) {
        //Brian Kernighan’s algorithm to count set bits
        if(n==0) return 0;
        if(n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) return -1;
        
        int count=0;

        while(n!=0)
        {
            n = n & (n-1);
            count++;
        }
      return count;
    }
}