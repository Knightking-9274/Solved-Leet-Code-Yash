class Solution {
    public int longestSubarray(int[] nums) {
        
     int i = 0, j = 0, result = 0, countZeros = 0;

    while (j < nums.length) {
        if (nums[j] == 0) {
            countZeros++;
        }

        while (countZeros > 1) {
            if (nums[i] == 0) {
                countZeros--;
            }
            i++;
        }

        result = Math.max(result, j - i + 1);
        j++;
    }

    return result - 1;
}  
}
    