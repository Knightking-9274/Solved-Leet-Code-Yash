class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       List<Integer> sdn = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                sdn.add(i);
            }
        }

        return sdn;
    }
    private static boolean isSelfDividing(int num) {
        int originalNum = num;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0 || originalNum % digit != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}