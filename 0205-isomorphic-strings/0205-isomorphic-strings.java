class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Check if both strings are of the same length
        if (s.length() != t.length()) {
            return false;
        }
        
        // Create two hash maps to track character mappings
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();
        
        // Iterate over the strings
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            // Check if there's an existing mapping for charS -> charT
            if (mapS.containsKey(charS)) {
                // If the current mapping doesn't match charT, return false
                if (mapS.get(charS) != charT) {
                    return false;
                }
            } else {
                // Add the mapping from s to t
                mapS.put(charS, charT);
            }
            
            // Similarly, check the mapping from charT -> charS
            if (mapT.containsKey(charT)) {
                // If the current mapping doesn't match charS, return false
                if (mapT.get(charT) != charS) {
                    return false;
                }
            } else {
                // Add the mapping from t to s
                mapT.put(charT, charS);
            }
        }
        
        // If we pass through the whole string without conflicts, return true
        return true;
    }
}