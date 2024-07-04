class Solution {
    public int firstUniqChar(String s) {
         // Step 1: Create a hashmap to store the frequency of each character
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Step 2: Populate the hashmap with the frequency of each character
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        // Step 3: Traverse the string again to find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (charCountMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        // Step 4: If no unique character is found, return -1
        return -1;
    } 
}