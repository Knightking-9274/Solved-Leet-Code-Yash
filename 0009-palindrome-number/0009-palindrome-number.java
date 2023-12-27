class Solution {
    public boolean isPalindrome(int x) {
       if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow before updating the reversed value
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return false;
            }

            reversed = reversed * 10 + digit;
        }

        return original == reversed;
        
    }
}