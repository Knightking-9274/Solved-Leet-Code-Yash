import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!stk1.isEmpty()) {
                    stk1.pop();
                }
            } else {
                stk1.push(s.charAt(i));
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!stk2.isEmpty()) {
                    stk2.pop();
                }
            } else {
                stk2.push(t.charAt(i));
            }
        }

        return stk1.equals(stk2);
    }
}
