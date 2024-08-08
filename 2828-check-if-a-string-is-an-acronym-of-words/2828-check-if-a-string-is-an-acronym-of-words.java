class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder acronym = new StringBuilder();

        // Build the acronym from the first letters of each word
        for (String word : words) {
            acronym.append(word.charAt(0));
        }

        // Check if the constructed acronym matches the given string s
        return acronym.toString().equals(s);
    }
}