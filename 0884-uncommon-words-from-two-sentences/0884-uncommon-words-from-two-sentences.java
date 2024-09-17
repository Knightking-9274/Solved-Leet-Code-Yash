class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] s1Array = s1.split(" ");
        String[] s2Array = s2.split(" ");
        
        Map<String, Integer> wordCount = new HashMap<>();
        
        for(String string1: s1Array){
            wordCount.put(string1,wordCount.getOrDefault(string1,0)+1);
        }
        for(String string2: s2Array){
            wordCount.put(string2,wordCount.getOrDefault(string2,0)+1);
        }
        List<String> ans = new ArrayList<>();
        
        for(Map.Entry<String, Integer> uncommon: wordCount.entrySet()){
            if(uncommon.getValue()==1){
                ans.add(uncommon.getKey());
            }
        }
        return ans.toArray(new String[0]);
    }
}