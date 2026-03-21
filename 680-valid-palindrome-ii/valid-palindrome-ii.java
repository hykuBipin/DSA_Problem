class Solution {
    public boolean validPalindrome(String s) {
        if(s==null) return true;

        int n=s.length();
        if(n<=1) return true;

        int start=0,end=n-1;

        while(start<end)
        {

            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
               {
                 return isPalindrome(s,start+1,end) || isPalindrome(s,start,end-1);
               }

               start++;
               end--;
        }
          return true;
    }

    public static boolean isPalindrome(String s, int start, int end)
    {
        while(start < end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}