class Solution {
    public int findNonMinOrMax(int[] nums) {
 if (nums.length <= 2) return -1;
    
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    
    // Find min and max
    for (int num : nums) {
        if (num < min) min = num;
        if (num > max) max = num;
    }
    
    // Find an element that is neither min nor max
    for (int num : nums) {
        if (num != min && num != max) {
            return num;
        }
    }
    
    return -1;
       
    }
}