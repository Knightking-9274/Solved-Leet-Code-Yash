class Solution {
    public boolean detectCapitalUse(String word) {
       int n = word.length();
        
        // If the word is one character long, it's always correct
        if (n == 1) return true;
        
        // Check if the first character is uppercase
        boolean isFirstCapital = Character.isUpperCase(word.charAt(0));
        
        // Count the number of uppercase letters
        int capitalCount = 0;
        
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                capitalCount++;
            }
        }
        
        // All letters are capital
        if (capitalCount == n) return true;
        
        // All letters are not capital
        if (capitalCount == 0) return true;
        
        // Only the first letter is capital
        if (isFirstCapital && capitalCount == 1) return true;
        
        // Otherwise, usage is incorrect
        return false;
    }
}