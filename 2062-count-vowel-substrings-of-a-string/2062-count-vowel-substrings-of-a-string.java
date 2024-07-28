class Solution {
    public int countVowelSubstrings(String word) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int n = word.length();
        int count = 0;

        for (int start = 0; start < n; start++) {
            if (vowels.contains(word.charAt(start))) {
                Set<Character> seenVowels = new HashSet<>();
                for (int end = start; end < n; end++) {
                    char currentChar = word.charAt(end);
                    if (vowels.contains(currentChar)) {
                        seenVowels.add(currentChar);
                        if (seenVowels.size() == 5) {
                            count++;
                        }
                    } else {
                        break;
                    }
                }
            }
        }

        return count;
    }
}