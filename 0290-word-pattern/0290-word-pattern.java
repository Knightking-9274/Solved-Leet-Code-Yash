class Solution {
    public boolean wordPattern(String pattern, String s) {
         String[] words = s.split(" ");
        
        // If the number of pattern characters doesn't match the number of words, return false
        if (pattern.length() != words.length) {
            return false;
        }
        
        Map<Character, String> charToWordMap = new HashMap<>();
        Map<String, Character> wordToCharMap = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = words[i];
            
            // Check if the mapping from char to word exists
            if (charToWordMap.containsKey(currentChar)) {
                // If it exists, it should match the current word
                if (!charToWordMap.get(currentChar).equals(currentWord)) {
                    return false;
                }
            } else {
                // If it doesn't exist, create a new mapping
                charToWordMap.put(currentChar, currentWord);
            }
            
            // Check if the mapping from word to char exists
            if (wordToCharMap.containsKey(currentWord)) {
                // If it exists, it should match the current character
                if (wordToCharMap.get(currentWord) != currentChar) {
                    return false;
                }
            } else {
                // If it doesn't exist, create a new mapping
                wordToCharMap.put(currentWord, currentChar);
            }
        }
        
        return true;
    }
}