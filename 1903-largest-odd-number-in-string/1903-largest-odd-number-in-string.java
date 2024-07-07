class Solution {
    public String largestOddNumber(String num) {
        // Scan the string from the end to find the first odd digit
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if (c == '1' || c == '3' || c == '5' || c == '7' || c == '9') {
                // Return the substring from the beginning to this odd digit (inclusive)
                return num.substring(0, i + 1);
            }
        }
        // If no odd digit is found, return an empty string
        return "";
    }
}