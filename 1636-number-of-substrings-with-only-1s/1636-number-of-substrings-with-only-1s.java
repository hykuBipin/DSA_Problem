class Solution {
    public int numSub(String s) {
        int n=s.length();
        int MOD=1000000007;
        int count=0;
        int temp=0;
        int result=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
              count++;
              result = (result + count)% MOD; 
            }else
            {
              count=0;
            }
        }
        return result;
    }
}