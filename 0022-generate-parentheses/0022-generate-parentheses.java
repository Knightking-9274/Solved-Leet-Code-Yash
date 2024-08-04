class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisRecursive(result, "", 0, 0, n);
        return result;
    }
     private static void generateParenthesisRecursive(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            generateParenthesisRecursive(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            generateParenthesisRecursive(result, current + ")", open, close + 1, max);
        }
    }
}