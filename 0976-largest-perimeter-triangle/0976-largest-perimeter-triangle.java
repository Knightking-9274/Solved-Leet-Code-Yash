class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;
        int sum = 0;
        for(int i = n;i>=2; i--){
            if(nums[i-2]+nums[i-1]>nums[i]){
                sum+= nums[i-2]+nums[i-1]+nums[i];
                return sum;
            }
        }
        return 0;
    }
}