class Solution {
    public long minimumSteps(String s) {
        int zeroCount = 0;  // Counts the number of '0's encountered
        long swaps = 0;      // Total number of swaps required

        // Traverse the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                // Count white balls ('0')
                zeroCount++;
            } else {
                // When we encounter a black ball ('1'), it needs to move past all the '0's on its right
                swaps += zeroCount;
            }
        }

        return swaps;
    }
}