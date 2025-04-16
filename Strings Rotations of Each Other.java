class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
      int n = s1.length();
        if (n != s2.length()) {
            return false;
        }
        if (n == 0) {
            return true; // Both are empty strings
        }
        
        int[] failure = computeFailure(s2);
        int j = 0; // Index for s2
        
        // Iterate through the virtual concatenated string s1 + s1
        for (int i = 0; i < 2 * n; i++) {
            char currentChar = s1.charAt(i % n);
            
            // Adjust j using failure function until characters match or j is 0
            while (j > 0 && currentChar != s2.charAt(j)) {
                j = failure[j - 1];
            }
            
            // If characters match, move to next character in s2
            if (currentChar == s2.charAt(j)) {
                j++;
            }
            
            // If all characters of s2 are matched
            if (j == n) {
                return true;
            }
        }
        
        return false;
    }
    
    // Computes the failure function (partial match table) for KMP algorithm
    private static int[] computeFailure(String pattern) {
        int n = pattern.length();
        int[] failure = new int[n];
        int j = 0;
        
        for (int i = 1; i < n; i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = failure[j - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                failure[i] = ++j;
            } else {
                failure[i] = 0;
            }
        }
        return failure;
    }
}
