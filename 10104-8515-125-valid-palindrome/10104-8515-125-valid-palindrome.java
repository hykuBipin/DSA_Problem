class Solution {
    public boolean isPalindrome(String s) {
        int N=s.length();
        if(N<=0) return true;
        StringBuilder strnew =new StringBuilder();
        for(char ch: s.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
            {
                strnew.append(Character.toLowerCase(ch));
            }
        }

        String strfilter = strnew.toString();
        int start=0,end=strfilter.length()-1;

        while(start<end)
        {   
            if(strfilter.charAt(start)!=strfilter.charAt(end))
            {
             return false;
            }
            start++;end--;
        }
      return true;
    }
}