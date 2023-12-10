class Solution {
    public boolean canJump(int[] nums) {
        int maxReachable = 0;
        int lastIdx = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            // Check if the current index is not reachable
            if (i > maxReachable) {
                return false;
            }

            // Update the maximum reachable index
            maxReachable = Math.max(maxReachable, i + nums[i]);

            // If the last index is reachable, return true
            if (maxReachable >= lastIdx) {
                return true;
            }
        }

        // If the loop completes, it means the last index is not reachable
        return false;
       
        
    }
}