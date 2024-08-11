class Solution {
    public String reversePrefix(String word, char ch) {
        // Find the index of the first occurrence of ch
        int index = word.indexOf(ch);
        
        // If the character ch is found in the word
        if (index != -1) {
            // Reverse the substring from the start to the index of ch
            StringBuilder reversedPart = new StringBuilder(word.substring(0, index + 1)).reverse();
            
            // Append the remaining part of the word
            return reversedPart.append(word.substring(index + 1)).toString();
        }
        
        // If ch is not found, return the original word
        return word;
    }
}