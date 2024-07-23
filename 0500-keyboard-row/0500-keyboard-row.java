class Solution {
    public String[] findWords(String[] words) {
        
        // Map each letter to the corresponding row number
        int[] rowMap = new int[26];
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        // Map each letter to its respective row number
        for (char c : row1.toCharArray()) {
            rowMap[c - 'a'] = 1;
        }
        for (char c : row2.toCharArray()) {
            rowMap[c - 'a'] = 2;
        }
        for (char c : row3.toCharArray()) {
            rowMap[c - 'a'] = 3;
        }

        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (canBeTyped(word.toLowerCase(), rowMap)) {
                result.add(word);
            }
        }
        
        // Convert the result list to an array and return it
        return result.toArray(new String[0]);
    }

    private boolean canBeTyped(String word, int[] rowMap) {
        int row = rowMap[word.charAt(0) - 'a']; // Determine the row of the first letter
        for (char c : word.toCharArray()) {
            if (rowMap[c - 'a'] != row) {
                return false; // If any letter is not in the same row, return false
            }
        }
        return true;
    }
}