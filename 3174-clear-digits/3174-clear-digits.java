class Solution {
    public String clearDigits(String s) {
         Stack<Character> stk = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // Remove the closest non-digit character to the left
                while (!stk.isEmpty() && Character.isDigit(stk.peek())) {
                    stk.pop();
                }
                if (!stk.isEmpty()) {
                    stk.pop();
                }
            } else {
                stk.push(c);
            }
        }
        
        // Rebuild the resulting string from the stack
        StringBuilder result = new StringBuilder();
        for (char c : stk) {
            result.append(c);
        }
        
        return result.toString();
    }
}