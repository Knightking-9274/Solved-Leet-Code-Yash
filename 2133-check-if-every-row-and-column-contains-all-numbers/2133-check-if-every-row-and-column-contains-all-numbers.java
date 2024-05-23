class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        
        // Check every row
        for (int i = 0; i < n; i++) {
            Set<Integer> rowSet = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < 1 || matrix[i][j] > n || !rowSet.add(matrix[i][j])) {
                    return false;
                }
            }
        }
        
        // Check every column
        for (int j = 0; j < n; j++) {
            Set<Integer> colSet = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] < 1 || matrix[i][j] > n || !colSet.add(matrix[i][j])) {
                    return false;
                }
            }
        }
        
        return true;
    }
}