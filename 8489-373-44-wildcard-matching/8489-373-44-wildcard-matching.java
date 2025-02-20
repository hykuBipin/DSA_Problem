class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[m][n] = true;

        for (int j = n - 1; j >= 0; j--) {
            if (p.charAt(j) == '*') {
                dp[m][j] = dp[m][j + 1]; 
            } else {
                break; 
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') {
                    dp[i][j] = dp[i + 1][j + 1]; 
                } else if (p.charAt(j) == '*') {
                    dp[i][j] = dp[i + 1][j] || dp[i][j + 1]; 
                } else {
                    dp[i][j] = false; 
                }
            }
        }

        return dp[0][0]; 
    }
}