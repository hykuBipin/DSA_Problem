class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1==null && word2==null) return null;
        if(word1==null) return word2;
        if(word2==null) return word1;

        int start1 = 0;
        int start2 = 0;
        StringBuilder sb = new StringBuilder();

        while(start1 < word1.length() && start2 < word2.length())
        {
            sb.append(word1.charAt(start1));
            sb.append(word2.charAt(start2));
            start1++;
            start2++;
        }

        while(start1 < word1.length())
        {
            sb.append(word1.charAt(start1));
            start1++;
        }

        while(start2 < word2.length())
        {
            sb.append(word2.charAt(start2));
            start2++;
        }

        return sb.toString();
    }
}