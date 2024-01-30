class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
       int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); // Initialize the result array with -1
        Stack<Integer> stack = new Stack<>();

        // Iterate twice to handle circular array
        for (int i = 0; i < n * 2; i++) {
            int index = i % n;

            // Pop elements from the stack until the stack is empty or the current element is greater than the top of the stack
            while (!stack.isEmpty() && nums[index] > nums[stack.peek()]) {
                result[stack.pop()] = nums[index];
            }

            // Push the current element's index onto the stack
            stack.push(index);
        }

        return result;
    }
}