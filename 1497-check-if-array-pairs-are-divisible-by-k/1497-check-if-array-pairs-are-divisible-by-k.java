class Solution {
    public boolean canArrange(int[] arr, int k) {
         int[] remainderCount = new int[k];

        // Count the remainders when elements are divided by k
        for (int num : arr) {
            // Handle negative numbers correctly by adjusting the modulo
            int remainder = ((num % k) + k) % k;
            remainderCount[remainder]++;
        }

        // Check if the remainder counts can form valid pairs
        for (int i = 0; i <= k / 2; i++) {
            if (i == 0) {
                // Special case for remainder 0, there should be an even count
                if (remainderCount[i] % 2 != 0) {
                    return false;
                }
            } else {
                // For remainder i, it must match with remainder (k - i)
                if (remainderCount[i] != remainderCount[k - i]) {
                    return false;
                }
            }
        }

        return true;
    }
}