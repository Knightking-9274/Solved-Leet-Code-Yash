class Solution {
    public int percentageLetter(String s, char letter) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        
        int occurrences = 0;
        
        // Count occurrences of the specified letter
        for (int i = 0; i < s.length(); i++) {
            if (letter == s.charAt(i)) {
                occurrences++;
            }
        }
        
        // If there are no occurrences, return 0
        if (occurrences == 0) {
            return 0;
        }
        
        // Calculate the percentage as a floating-point number
        double percentage = ((double) occurrences / s.length()) * 100;
        
        // Convert the percentage to an integer (if needed)
        return (int) Math.floor(percentage);
    }
}