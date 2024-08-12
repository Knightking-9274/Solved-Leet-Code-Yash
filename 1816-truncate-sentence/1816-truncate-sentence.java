class Solution {
    public String truncateSentence(String s, int k) {
       // Split the sentence into words
        String[] words = s.split(" ");

        // Join the first k words into a single string
        String truncated = String.join(" ", java.util.Arrays.copyOfRange(words, 0, k));

        return truncated;
        
    }
}