class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);
            if (set.size() > 3) {
                set.pollFirst(); // Remove the smallest element to maintain size 3
            }
        }

        // If we have 3 distinct numbers, return the smallest one in the set (3rd max)
        if (set.size() == 3) {
            return set.first();
        } else {
            // Otherwise, return the largest one (max number)
        }
            return set.last();
    }
}