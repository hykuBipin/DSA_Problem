class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1=word1.length();
        int w2=word2.length();
        int pointer1=0;int pointer2=0; int resultpointer=0;
        char[] result = new char[w1+w2];
        while(pointer1 < w1 || pointer2 < w2)
        {
            if(pointer1 < w1)
            {
                result[resultpointer++] = word1.charAt(pointer1++);
            }
            if(pointer2 < w2)
            {
                result[resultpointer++] = word2.charAt(pointer2++);
            }
        }
        return new String(result);
    }
}