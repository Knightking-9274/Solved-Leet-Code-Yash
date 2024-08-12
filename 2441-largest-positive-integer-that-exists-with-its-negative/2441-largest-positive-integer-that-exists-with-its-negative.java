class Solution {
    public int findMaxK(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
        int maxK = -1;

        for (int num : nums) {
            // Check if the opposite number exists
            if (set.contains(-num)) {
                maxK = Math.max(maxK, Math.abs(num));
            }
            // Add the current number to the set
            set.add(num);
        }

        return maxK;
    }
}