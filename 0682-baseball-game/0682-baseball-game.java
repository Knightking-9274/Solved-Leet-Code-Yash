import java.util.Stack;

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        
        for (String op : ops) {
            if (op.equals("C")) {
                stack.pop(); // Remove the previous score
            } else if (op.equals("D")) {
                int prev = stack.peek();
                stack.push(2 * prev); // Double the previous score
            } else if (op.equals("+")) {
                int prev1 = stack.pop();
                int prev2 = stack.peek();
                stack.push(prev1);
                stack.push(prev1 + prev2); // Add the last two scores
            } else {
                stack.push(Integer.parseInt(op)); // Record a new score
            }
        }
        
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        
        return sum;
    }
}

