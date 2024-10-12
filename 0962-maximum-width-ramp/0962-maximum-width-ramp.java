class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        
        // Build the decreasing stack
        for (int i = 0; i < n; i++) {
            // Only push the index if nums[i] is smaller than the top of the stack
            if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                stack.push(i);
            }
        }

        int maxWidth = 0;
        
        // Traverse from the end of the array to the beginning
        for (int j = n - 1; j >= 0; j--) {
            // Try to find the widest ramp for each j
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[j]) {
                maxWidth = Math.max(maxWidth, j - stack.pop());
            }
        }
        
        return maxWidth;

        
    }
}