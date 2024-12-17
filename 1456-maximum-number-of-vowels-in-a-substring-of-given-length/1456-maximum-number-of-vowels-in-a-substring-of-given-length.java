class Solution {
    public int maxVowels(String s, int k)
{
      int N = s.length();
        int windowCount = 0;
        int result = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                windowCount++;
            }
        }
        
        result = windowCount; 
        for (int i = k; i < N; i++) {
            char enteringChar = s.charAt(i); 
            char exitingChar = s.charAt(i - k); 
            
            if (vowels.indexOf(enteringChar) != -1) {
                windowCount++;
            }

            if (vowels.indexOf(exitingChar) != -1) {
                windowCount--;
            }
            
            result = Math.max(result, windowCount);
        }
        
        return result;
    }
}