class Solution {
    public int countSegments(String s) {
         // Trim the string to remove leading and trailing spaces
        s = s.trim();

        // If the string is empty after trimming, there are no segments
        if (s.isEmpty()) {
            return 0;
        }

        // Split the string by one or more spaces and return the length of the resulting array
        String[] segments = s.split("\\s+");
        return segments.length;
    }
}