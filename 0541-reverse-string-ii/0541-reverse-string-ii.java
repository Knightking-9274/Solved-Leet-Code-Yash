class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray(); // Convert the string to a character array for easy manipulation
        int n = arr.length;

        for (int i = 0; i < n; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1); // Determine the end of the part to reverse

            // Reverse the first k characters within the current 2k chunk
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(arr);
    }
}