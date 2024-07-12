class Solution {
    public void rotate(int[] nums, int k) {
         int n = nums.length;
        k = k % n; // In case k is greater than the length of the array

        // Create a temporary array to store the rotated elements
        int[] temp = new int[n];

        // Place each element in its new position
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        // Copy the elements from the temporary array back to the original array
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}