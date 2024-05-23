class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        
        for(int i=0; i< board.length; i++){
            for(int j=0; j< board[0].length; j++){
                char curr = board[i][j];
                if(curr!='.'){
                    if(!set.add("row" + i + curr) ||
                       !set.add("col" + j + curr) ||                                                    !set.add("grid" + curr + i / 3 + j / 3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}