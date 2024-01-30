class Solution {
    public String removeDuplicates(String s) {
        
          Stack<Character> stack = new Stack<>();

        // Iterate through each character in the input string
        for (char c : s.toCharArray()) {
            // Check if the stack is not empty and the current character is equal to the top of the stack
            if (!stack.isEmpty() && c == stack.peek()) {
                // Pop the top element from the stack to remove the duplicate
                stack.pop();
            } else {
                // Push the current character onto the stack
                stack.push(c);
            }
        }

        // Build the final result string from the characters in the stack
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop()); // Insert at the beginning to maintain order
        }

        return result.toString();
    }
}