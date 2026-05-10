class Solution {
    public int getSum(int a, int b) {
       if(a<-1000 || b>1000) return -1;
       int sum=0,carry=0;

       while(b!=0)
       {
          sum =  a ^ b;
          carry = (a & b) <<1;
          a=sum;
          b=carry;
       }
       return a;
    }
}

// Complexity	Value:
// Time Complexity	 : O(1)
// Space Complexity : O(1)