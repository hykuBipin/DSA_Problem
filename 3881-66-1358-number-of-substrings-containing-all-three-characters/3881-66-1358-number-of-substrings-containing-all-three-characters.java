class Solution {
    public int numberOfSubstrings(String s) {
        int N=s.length(); 
        int ans=0;
        int a_index=-1;
        int b_index=-1;
        int c_index=-1;
     for (int i = 0; i < N; i++) {
            char currentChar = s.charAt(i);
            if (currentChar == 'a') {
                a_index = i;
            } else if (currentChar == 'b') {
                b_index = i;
            } else if (currentChar == 'c') {
                c_index = i;
            }

            if (a_index != -1 && b_index != -1 && c_index != -1) {
                int minIndex = Math.min(a_index, Math.min(b_index, c_index));
                ans += minIndex + 1; 
            }
        }
        return ans;
    }
}