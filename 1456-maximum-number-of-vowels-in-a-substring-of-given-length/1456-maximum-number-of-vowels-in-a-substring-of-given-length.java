class Solution {
    public int maxVowels(String s, int k) {
        if (s == null || s.length() == 0 || k <= 0) {
            return 0;
        }

        int maxVowels = 0;
        int currentVowels = 0;

        // Count vowels in the first substring of length k
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
        }

        maxVowels = currentVowels;

        // Slide the window through the rest of the string
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k))) {
                // If the character going out of the window was a vowel, decrease the count
                currentVowels--;
            }
            if (isVowel(s.charAt(i))) {
                // If the current character is a vowel, increase the count
                currentVowels++;
            }
            maxVowels = Math.max(maxVowels, currentVowels);
        }

        return maxVowels;
        
    }
    
     private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}