class Solution {
    public boolean isPalindrome(String s) {
         int left = 0, right = s.length() - 1;
        
        while (left < right) {
            // Move left pointer forward if it's not pointing to a letter or digit
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move right pointer backward if it's not pointing to a letter or digit
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            
            // Compare the characters, ignoring case
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            
            // Move both pointers towards the center
            left++;
            right--;
        }
        
        return true;
    }
}