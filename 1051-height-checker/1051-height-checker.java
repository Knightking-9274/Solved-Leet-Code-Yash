class Solution {
    public int heightChecker(int[] heights) {
        int cnt = 0;
        int[] sorted = Arrays.copyOf(heights, heights.length); //copy the array
        Arrays.sort(sorted); // Sort the copied array
        for (int i = 0; i < sorted.length; i++) {
            if (heights[i] != sorted[i]) {
                cnt++;
            }
        }
        return cnt;
    }
}