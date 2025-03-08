class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int original=x;
        if(x<0 )
        {
            return false;
        }
        while(original!=0)
        {
            int digit = original%10;
            original/=10;
            rev=rev*10+digit;
        }

        if(x==rev) { return true;}
        System.out.print(x+" "+rev+" "+original);
        return false;
    }
}