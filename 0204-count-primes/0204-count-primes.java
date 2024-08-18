class Solution {
    public int countPrimes(int n) {
                if (n <= 2) {
            return 0; // There are no primes less than 2
        }

        int cnt = 0;
        boolean[] primeNumbers = new boolean[n];
        Arrays.fill(primeNumbers, true); // Initially, assume all numbers are prime

        for (int i = 2; i * i < n; i++) { // Only iterate up to √n
            if (primeNumbers[i]) { // If i is a prime number
                for (int j = i * i; j < n; j += i) { // Mark all multiples of i as non-prime
                    primeNumbers[j] = false;
                }
            }
        }

        // Count primes less than n
        for (int i = 2; i < n; i++) {
            if (primeNumbers[i]) {
                cnt++;
            }
        }

        return cnt;

    }
}