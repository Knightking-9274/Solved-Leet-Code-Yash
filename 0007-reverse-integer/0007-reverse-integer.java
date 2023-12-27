class Solution {
    public int reverse(int x) {
        
      int INT_MAX = Integer.MAX_VALUE;
        int INT_MIN = Integer.MIN_VALUE;

        // Handle the sign of the input
        int sign = (x > 0) ? 1 : -1;
        x = Math.abs(x);

        // Reverse the digits
        int reversedX = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow before updating the reversed value
            if (reversedX > (INT_MAX - digit) / 10) {
                return 0;
            }

            reversedX = reversedX * 10 + digit;
        }

        // Restore the sign
        reversedX *= sign;

        // Check for overflow after restoring the sign
        if (reversedX > INT_MAX || reversedX < INT_MIN) {
            return 0;
        }

        return reversedX;
    }   
}