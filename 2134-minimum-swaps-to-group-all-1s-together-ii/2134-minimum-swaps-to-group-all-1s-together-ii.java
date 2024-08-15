class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;

        // Step 1: Count the total number of 1's in the array.
        int totalOnes = 0;
        for (int num : nums) {
            if (num == 1) {
                totalOnes++;
            }
        }

        // Edge case: If there are no 1's or all elements are 1's, no swaps are needed.
        if (totalOnes == 0 || totalOnes == n) {
            return 0;
        }

        // Step 2: Create a new array of size 2 * n to handle the circular nature.
        int[] extendedNums = new int[2 * n];
        for (int i = 0; i < n; i++) {
            extendedNums[i] = nums[i];
            extendedNums[i + n] = nums[i];
        }

        // Step 3: Use sliding window technique to find the minimum swaps.
        int minSwaps = Integer.MAX_VALUE;
        int currentZeros = 0;

        // Count zeros in the first window of size totalOnes.
        for (int i = 0; i < totalOnes; i++) {
            if (extendedNums[i] == 0) {
                currentZeros++;
            }
        }
        minSwaps = currentZeros;

        // Slide the window through the extended array.
        for (int i = totalOnes; i < 2 * n; i++) {
            // Remove the element going out of the window.
            if (extendedNums[i - totalOnes] == 0) {
                currentZeros--;
            }
            // Add the new element coming into the window.
            if (extendedNums[i] == 0) {
                currentZeros++;
            }
            // Update the minimum swaps needed.
            minSwaps = Math.min(minSwaps, currentZeros);
        }

        return minSwaps;
    }
}