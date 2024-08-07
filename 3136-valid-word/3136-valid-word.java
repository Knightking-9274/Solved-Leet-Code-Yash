class Solution {
    public boolean isValid(String word) {
         if (word.length() < 3) {
            return false;
        }

        // Initialize flags for vowels and consonants
        boolean hasVowel = false;
        boolean hasConsonant = false;

        // Loop through each character in the word
        for (char c : word.toCharArray()) {
            // Check if the character is valid (digit, uppercase, or lowercase letter)
            if (!(Character.isLetterOrDigit(c))) {
                return false;
            }

            // Check if the character is a vowel
            if (isVowel(c)) {
                hasVowel = true;
            }

            // Check if the character is a consonant
            if (isConsonant(c)) {
                hasConsonant = true;
            }
        }

        // Return true if the word contains at least one vowel and one consonant
        return hasVowel && hasConsonant;
    }

    // Helper method to check if a character is a vowel
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    // Helper method to check if a character is a consonant
    private boolean isConsonant(char c) {
        return Character.isLetter(c) && !isVowel(c);
    }
}