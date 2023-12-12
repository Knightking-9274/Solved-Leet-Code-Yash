class Solution {
    public int mySqrt(int x) {
        double d = Math.sqrt(x);
        
        int y = (int)Math.abs(d);
        
        return y;
        
    }
}