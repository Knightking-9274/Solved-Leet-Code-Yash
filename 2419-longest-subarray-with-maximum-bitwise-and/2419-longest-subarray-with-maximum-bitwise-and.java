class Solution {
    public int longestSubarray(int[] nums) {
        int maxValue = 0;
        for(int i=0; i< nums.length; i++){
            maxValue = Math.max(maxValue,nums[i]);
        }
        int longestLength = 0;
        int currentLength = 0;

        for (int num : nums) {
            if (num == maxValue) {
                currentLength++;
                longestLength = Math.max(longestLength, currentLength);
            } else {
                currentLength = 0;  // Reset the length counter
            }
        }

        return longestLength;
    }
}