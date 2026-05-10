class Solution {
    public int[] countBits(int n) {
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

// Time Complexity: O(n). Each number from 1 to n is processed once, and the bitwise operation is O(1).
// Space Complexity: O(n) for the result array.