class Solution {
    public long maxRunTime(int n, int[] batteries) {
        int m=batteries.length;
        long left=1,right=0;
        long result=0;

        for(int power: batteries)
        {
            right += power;
        }

     //binar search tree
      while(left <= right)
      {
        long total=0;
        long mid = left + (right - left)/2;
         for(int b: batteries)
         {
            total += Math.min(b,mid);
         }

         if(total >= mid * n)
         {
              result=mid;
              left=mid+1;
         }else
         {
              right=mid-1;
         }
      }
      return result;
    }
}