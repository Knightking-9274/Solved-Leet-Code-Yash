class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        // Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        // Handle empty string or string with only whitespaces
        if (i == n) {
            return 0;
        }

        // Check the sign
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        int result = 0;
        // Convert the digits to an integer
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check for overflow and underflow conditions
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
        
    }
}