class Solution {
    public int chalkReplacer(int[] chalk, int k) {
       // Step 1: Calculate the total chalk usage for one full round
        long totalChalk = 0;
        for (int amount : chalk) {
            totalChalk += amount;
        }

        // Step 2: Reduce k by the total chalk usage using modulo
        k = (int) (k % totalChalk);

        // Step 3: Find the student who will run out of chalk
        for (int i = 0; i < chalk.length; i++) {
            if (chalk[i] > k) {
                return i;
            }
            k -= chalk[i];
        }

        // This return statement will never be reached since the loop will always find the answer
        return -1;
    }
}