class Solution {
    public int minAddToMakeValid(String s) {
        int openCount = 0;   // Count of unmatched opening parentheses
        int closeCount = 0;  // Count of unmatched closing parentheses

        for (char c : s.toCharArray()) {
            if (c == '(') {
                openCount++;  // Increment openCount for each opening parenthesis
            } else if (c == ')') {
                if (openCount > 0) {
                    openCount--;  // Match closing parenthesis with an opening one
                } else {
                    closeCount++; // Increment closeCount if no matching opening parenthesis
                }
            }
        }

        // The total number of additions required is the sum of unmatched opening and closing parentheses
        return openCount + closeCount;
    }
}