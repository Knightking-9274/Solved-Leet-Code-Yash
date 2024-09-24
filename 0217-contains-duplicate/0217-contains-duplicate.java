class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> uniqueNumbers = new HashSet<>();
        
        // Iterate through the array
        for (int num : nums) {
            // If the element is already in the set, we have found a duplicate
            if (!uniqueNumbers.add(num)) {
                return true;
            }
        }
        
        // If no duplicates were found, return false
        return false;
    }
}