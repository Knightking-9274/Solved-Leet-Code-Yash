class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubledString = s + s;
        // Remove the first and the last character from the concatenated string
        String modifiedString = doubledString.substring(1, doubledString.length() - 1);
        // Check if the original string is a substring of the modified string
        return modifiedString.contains(s);
    }
}