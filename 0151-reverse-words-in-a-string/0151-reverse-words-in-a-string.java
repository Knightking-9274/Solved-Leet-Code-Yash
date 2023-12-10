class Solution {
    public String reverseWords(String s) {
     StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            // Find the end of the word
            int end = i;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // Append the word to the result (if not empty)
            int start = i + 1;
            for (int j = start; j <= end; j++) {
                result.append(s.charAt(j));
            }

            // Append a space if it's not the first word and the result is not empty
            if (i >= 0 && result.length() > 0) {
                result.append(' ');
            }
        }

        return result.toString().trim();
        
        
    }
}