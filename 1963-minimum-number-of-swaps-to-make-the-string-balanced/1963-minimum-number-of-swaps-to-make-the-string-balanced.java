class Solution {
    public int minSwaps(String s) {
        int imbalance = 0;
        int maxImbalance = 0;

        // Traverse the string to calculate imbalance
        for (char c : s.toCharArray()) {
            if (c == '[') {
                imbalance--;  // Decrease imbalance for opening bracket
            } else {
                imbalance++;  // Increase imbalance for closing bracket
            }
            // Track the maximum imbalance encountered
            maxImbalance = Math.max(maxImbalance, imbalance);
        }

        // The number of swaps required is half of the maximum imbalance
        return (maxImbalance + 1) / 2;
    }
}