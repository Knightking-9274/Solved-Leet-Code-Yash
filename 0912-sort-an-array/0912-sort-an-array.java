class Solution {
    //we can use merge sort algortihm or heap sort algorithm to achieve O(nlog(n)) time complexity
    public int[] sortArray(int[] nums) {
        int start = 0, end = nums.length-1;
        heapSort(nums);
        return nums;
    }
   public static void heapSort(int[] nums) {
        int n = nums.length;

        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        // Extract elements from the heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Move the current root to the end
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;

            // Call max heapify on the reduced heap
            heapify(nums, i, 0);
        }
    }

    // To heapify a subtree rooted at node i which is an index in nums[]
    public static void heapify(int[] nums, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2; // right child

        // If the left child is larger than the root
        if (left < n && nums[left] > nums[largest]) {
            largest = left;
        }

        // If the right child is larger than the largest so far
        if (right < n && nums[right] > nums[largest]) {
            largest = right;
        }

        // If the largest is not the root
        if (largest != i) {
            int swap = nums[i];
            nums[i] = nums[largest];
            nums[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(nums, n, largest);
        }
    }
    
}