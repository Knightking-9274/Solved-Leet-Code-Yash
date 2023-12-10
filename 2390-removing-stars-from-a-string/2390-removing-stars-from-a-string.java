class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder s1 = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        for(char c: stack){
            s1.append(c);
        }
        return s1.toString();
    
    }
}