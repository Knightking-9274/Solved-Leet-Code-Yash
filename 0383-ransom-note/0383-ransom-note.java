class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letterCount = new int[26];
        
        // Count the frequency of each character in the magazine
        for (char c : magazine.toCharArray()) {
            letterCount[c - 'a']++;
        }
        
        // Check if we can construct the ransom note
        for (char c : ransomNote.toCharArray()) {
            letterCount[c - 'a']--;
            // If the count of any letter goes negative, we cannot construct the ransom note
            if (letterCount[c - 'a'] < 0) {
                return false;
            }
        }
        
        return true;
    }
}