class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> previous = new ArrayList<>();
        
        previous.add(1);
        triangle.add(previous);
        
        for(int i=2; i<=numRows; i++){
            List<Integer> temp = new ArrayList<>(); 
            
            //adding to the first
            temp.add(1);
            
            //adding in the middle
            for(int j=0; j<previous.size()-1;j++){
                temp.add(previous.get(j)+previous.get(j+1));
            }
                
            //adding in the end
            temp.add(1);
            
            previous = temp;
            triangle.add(previous);
            
        }
        return triangle;    
    }
    
}