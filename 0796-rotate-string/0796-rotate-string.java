class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (sb.toString().equals(goal)) return true;

            // Rotate the string by moving the first character to the end
            char firstChar = sb.charAt(0);
            sb.deleteCharAt(0).append(firstChar);
        }
        return false;
    }
}