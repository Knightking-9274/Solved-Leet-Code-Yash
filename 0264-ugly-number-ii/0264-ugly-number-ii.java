class Solution {
    public int nthUglyNumber(int n) {
        TreeSet<Long> uglyNumbers = new TreeSet<>();
        uglyNumbers.add(1L);

        long currentUgly = 1;
        for (int i = 1; i <= n; i++) {
            currentUgly = uglyNumbers.pollFirst();
            uglyNumbers.add(currentUgly * 2);
            uglyNumbers.add(currentUgly * 3);
            uglyNumbers.add(currentUgly * 5);
        }

        return (int) currentUgly;
            
        }
}