class Solution {
    public String compressedString(String word) {
         StringBuilder comp = new StringBuilder();
        int i = 0;
        
        while (i < word.length()) {
            char c = word.charAt(i);
            int count = 0;
            
            // Count occurrences of the same character, up to 9 times
            while (i < word.length() && word.charAt(i) == c && count < 9) {
                i++;
                count++;
            }
            
            // Append the count and the character to the compressed result
            comp.append(count).append(c);
        }
        
        return comp.toString();
    }
}