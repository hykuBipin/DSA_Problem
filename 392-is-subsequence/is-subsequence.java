class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s==null || t==null) return false;
        if(s.length() == 0) return true;
        if(s.length() > t.length()) return false; 

        int n=t.length();
                    
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(j < s.length() && s.charAt(j)==t.charAt(i))
            {
                j++;
            }
        }
        return j==s.length();
    }
}