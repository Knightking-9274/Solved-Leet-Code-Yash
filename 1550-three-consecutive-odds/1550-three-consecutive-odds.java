class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
         int count = 0;

        for (int num : arr) {
            // Check if the current number is odd
            if (num % 2 != 0) {
                count++;
                // Check if there are three consecutive odd numbers
                if (count == 3) {
                    return true;
                }
            } else {
                // Reset the count if the current number is even
                count = 0;
            }
        }

        return false;
    }
}