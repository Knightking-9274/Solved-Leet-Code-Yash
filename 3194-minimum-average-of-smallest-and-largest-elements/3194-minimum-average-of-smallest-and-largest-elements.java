class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        // Initialize the minimum average to a very large value
        double minAverage = Double.MAX_VALUE;

        // Calculate the average of the smallest and largest elements
        for (int i = 0; i < n / 2; i++) {
            double average = (nums[i] + nums[n - i - 1]) / 2.0;
            // Update minAverage if the current average is smaller
            minAverage = Math.min(minAverage, average);
        }

        return minAverage;
        
    }
}