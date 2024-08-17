class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] onesRowCount = new int[m];
        int[] onesColCount = new int[n];
       
        
        for(int i=0; i<m; i++){
            for(int j=0;j<n; j++){
                onesRowCount[i] += grid[i][j];
                onesColCount[j] += grid[i][j];
            }
            
        }
        int[][] diff = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int zerosRow = n - onesRowCount[i];
                int zerosCol = m - onesColCount[j];
                diff[i][j] = onesRowCount[i] + onesColCount[j] - zerosRow - zerosCol;
            }
        }

        return diff;
        
    }
}