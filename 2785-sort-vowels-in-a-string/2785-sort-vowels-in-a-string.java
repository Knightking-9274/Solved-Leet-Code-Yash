class Solution {
    public String sortVowels(String s) {
         List<Character> vowels = new ArrayList<>();
        
        // Step 1: Extract all vowels from the string
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowels.add(c);
            }
        }
        
        // Step 2: Sort the extracted vowels
        Collections.sort(vowels);

        StringBuilder result = new StringBuilder(s);
        int vowelIndex = 0;

        // Step 3: Reinsert the sorted vowels into their original positions
        for (int i = 0; i < result.length(); i++) {
            if (isVowel(result.charAt(i))) {
                result.setCharAt(i, vowels.get(vowelIndex++));
            }
        }

        return result.toString();
    }

    // Helper method to check if a character is a vowel
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }        
    
}