class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // Find the maximum cost in the array
        int max = 0;
        for (int i = 0; i < costs.length; i++) {
            max = Math.max(max, costs[i]);
        }

        // Create a count array to store frequencies of each cost
        int[] countArray = new int[max + 1];
        for (int i = 0; i < costs.length; i++) {
            countArray[costs[i]]++;
        }

        // Now, iterate over the countArray to simulate the counting sort and
        // calculate the maximum number of ice creams that can be bought
        int iceCreams = 0;

        for (int i = 1; i <= max; i++) {
            if (countArray[i] > 0) {
                int affordable = Math.min(countArray[i], coins / i);
                iceCreams += affordable;
                coins -= affordable * i;
                if (coins < i) break;  // No more coins left to buy this or any cheaper ice creams
            }
        }

        return iceCreams;  
       }
}