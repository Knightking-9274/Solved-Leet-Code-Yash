class Solution {
    public char findTheDifference(String s, String t) {
         int sumS = 0, sumT = 0;

        // Calculate the sum of ASCII values for string s
        for (char c : s.toCharArray()) {
            sumS += c;
        }

        // Calculate the sum of ASCII values for string t
        for (char c : t.toCharArray()) {
            sumT += c;
        }

        // The difference will give us the extra character
        return (char)(sumT - sumS);
    }
}