class Solution {
    public String decodeString(String s) {
         Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        int currentNum = 0;
        StringBuilder currentStr = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNum = currentNum * 10 + (ch - '0');
            } else if (ch == '[') {
                numStack.push(currentNum);
                strStack.push(currentStr.toString());
                currentNum = 0;
                currentStr = new StringBuilder();
            } else if (ch == ']') {
                int num = numStack.pop();
                StringBuilder prevStr = new StringBuilder(strStack.pop());
                currentStr = prevStr.append(String.valueOf(currentStr).repeat(Math.max(0, num)));
            } else {
                currentStr.append(ch);
            }
        }

        return currentStr.toString();
        
    }
}