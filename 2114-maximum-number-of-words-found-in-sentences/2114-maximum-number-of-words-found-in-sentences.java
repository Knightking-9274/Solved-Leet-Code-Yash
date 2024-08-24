class Solution {
    public int mostWordsFound(String[] sentences) {
        int mostWordsFound = 0;
    
    for (String s : sentences) {
        // Split the sentence by spaces and count the number of words
        int wordCount = s.split("\\s+").length;
        // Update the maximum word count found
        mostWordsFound = Math.max(mostWordsFound, wordCount);
    }
    
    return mostWordsFound;
        
    }
}