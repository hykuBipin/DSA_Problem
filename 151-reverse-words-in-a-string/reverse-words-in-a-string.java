class Solution {
    public String reverseWords(String s) {
        if(s==null) return "";

        s=s.trim();
        if(s.isEmpty()) return "";
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();

        for(int i=words.length-1;i>=0;i--)
        {
            result.append(words[i]);

             if(i!=0)
             {
                result.append(" ");
             }
        }
        return result.toString();
    }
}