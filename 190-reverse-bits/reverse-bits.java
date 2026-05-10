class Solution {
    public int reverseBits(int n) {
       if(n==0) return 0;
       if(n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) return -1;
       int result=0;
       
       for(int i=0;i<32;i++)
       {
            //signed left shift
            result <<= 1;

            result |= (n&1);

            //unsigned right shift
            n>>>=1;
       }
            return result;
    }
}

//Time complexity is O(32) = O(1), which is optimal since the integer size is fixed.
//Space complexity is O(1), using only a few variables.