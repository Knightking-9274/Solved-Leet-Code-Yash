class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character, Integer> charCounts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            charCounts.put(s.charAt(i), charCounts.getOrDefault(s.charAt(i), 0) + 1);
            charCounts.put(t.charAt(i), charCounts.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int count : charCounts.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
        
    }
}