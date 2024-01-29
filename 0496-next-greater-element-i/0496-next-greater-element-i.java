class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int size = nums1.length;
        int[] nGE = new int[size];
        
        for (int i = 0; i < size; i++) {
            int j = 0;
            while (nums1[i] != nums2[j]) {
                j++;
            }
            
            if (j == nums2.length - 1) {
                nGE[i] = -1;
            } else {
                for (int k = j; k < nums2.length; k++) {
                    if (nums1[i] < nums2[k]) {
                        nGE[i] = nums2[k];
                        break; // Break out of the loop as soon as the next greater element is found.
                    }
                }
                
                if (nGE[i] == 0) {
                    nGE[i] = -1; // Set to -1 if no next greater element is found.
                }
            }
        }
        return nGE;
    }
}
