class Solution {
    public String mergeAlternately(String word1, String word2) {
        // StringBuilder res = new StringBuilder();
        String res ="";
        
      for(int i=0; i<word1.length() || i<word2.length(); i++){
          if(i<word1.length()){
             res+=word1.charAt(i);
          }
           if(i<word2.length()){
              res+=word2.charAt(i);
          }
      }
        return res;
        
         
    }
}