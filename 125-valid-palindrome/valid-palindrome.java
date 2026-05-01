class Solution {
    public boolean isPalindrome(String s) {
        if(s==null || s.length()<0) return true;
        int n=s.length();

        // String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // int n=str.length();
        // O(N) --> will replcae it !Character.isLetterOrDigits(left) --> O(1)

        int left=0,right=n-1;

        while(left < right)
        {
            while(left<right && !Character.isLetterOrDigit(s.charAt(left)))
            {
                 left++;
            }

            while(left<right && !Character.isLetterOrDigit(s.charAt(right)))
            {
                 right--;
            }    

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}