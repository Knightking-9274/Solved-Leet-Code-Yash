class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k is greater than the length of the array

        // Reverse the entire array
        reverse(nums, 0, n - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining elements
        reverse(nums, k, n - 1);
        
    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap elements at start and end indices
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }

}
/*
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
}*/