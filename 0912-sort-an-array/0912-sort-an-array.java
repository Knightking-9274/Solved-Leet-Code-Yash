class Solution {
    //we can use merge sort algortihm or heap sort algorithm to achieve O(nlog(n)) time complexity
    public int[] sortArray(int[] nums) {
        int start = 0, end = nums.length-1;
        mergeSort(nums,start,end);
        return nums;
    }
    public static void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort the first half
            mergeSort(nums, left, mid);
            // Sort the second half
            mergeSort(nums, mid + 1, right);

            // Merge the sorted halves
            merge(nums, left, mid, right);
        }
    }
    public static void merge(int[] nums, int left, int mid, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        System.arraycopy(nums, left, leftArray, 0, n1);
        System.arraycopy(nums, mid + 1, rightArray, 0, n2);

        // Merge the temporary arrays

        // Initial indexes of the first and second subarrays
        int i = 0, j = 0;

        // Initial index of the merged subarray array
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                nums[k] = leftArray[i];
                i++;
            } else {
                nums[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[] if any
        while (i < n1) {
            nums[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[] if any
        while (j < n2) {
            nums[k] = rightArray[j];
            j++;
            k++;
        }
    }
    
}