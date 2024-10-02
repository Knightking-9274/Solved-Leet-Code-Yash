class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) return new int[0];
        
        // Create a copy of the array and sort it
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        
        // Map to store the rank of each element
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        
        // Assign ranks to the sorted array elements
        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank);
                rank++;
            }
        }
        
        // Replace original array elements with their ranks
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }
        
        return result;
    }
}