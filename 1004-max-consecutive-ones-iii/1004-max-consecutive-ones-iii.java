class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0; // Left pointer of the window
        int maxConsecutiveOnes = 0; // Maximum consecutive 1's

        // Iterate through the array with the right pointer
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                k--; // Decrement the count of remaining flips
            }

            // If the count of remaining flips becomes negative, move the left pointer
            while (k < 0) {
                if (nums[left] == 0) {
                    k++; // Increment the count of remaining flips as we move the left pointer
                }
                left++; // Move the left pointer to shrink the window
            }

            // Update the maximum consecutive 1's
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, right - left + 1);
        }

        return maxConsecutiveOnes;
    }
}