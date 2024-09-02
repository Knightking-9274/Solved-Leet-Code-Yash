class Solution {
    public int[] decompressRLElist(int[] nums) {
         // Step 1: Calculate the size of the decompressed array
        int size = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            size += nums[2 * i];
        }

        // Step 2: Create the decompressed array
        int[] decompressedList = new int[size];
        int index = 0;

        // Step 3: Populate the decompressed array
        for (int i = 0; i < nums.length / 2; i++) {
            int freq = nums[2 * i];
            int val = nums[2 * i + 1];

            for (int j = 0; j < freq; j++) {
                decompressedList[index++] = val;
            }
        }

        return decompressedList;
    }
}