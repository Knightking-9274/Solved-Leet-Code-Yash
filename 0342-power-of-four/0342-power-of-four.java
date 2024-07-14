class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        double result = Math.log10(n)/Math.log10(4);
        return Math.abs(result-Math.round(result))<1e-10;
    }
}