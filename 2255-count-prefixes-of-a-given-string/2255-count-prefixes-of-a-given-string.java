class Solution {
    public int countPrefixes(String[] words, String s) {
        int countPrefixes = 0;
        for(int i=0; i<words.length; i++){
            int n = words[i].length();
            if(n<=s.length() && s.substring(0,n).equals(words[i])){
                countPrefixes++;
            }
        }
        return countPrefixes;
    }
}