class Solution {
    public String longestCommonPrefix(String[] strs) {
         if (strs == null || strs.length == 0) return "";
        
        // Loop through each character index of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);
            
            // Compare the character at position i of each string
            for (int j = 1; j < strs.length; j++) {
                // If the current index is out of bounds for any string or the character doesn't match
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return strs[0].substring(0, i);
                }
            }
        }
        
        // If all characters matched, return the first string as the common prefix
        return strs[0];
    }
    
}