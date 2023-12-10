class Solution {
    public int largestAltitude(int[] gain) {
      int maxPos=0, i=0, sum=0;
        for(i=0;i<gain.length;i++){
            sum += gain[i];
            maxPos = Math.max(maxPos,sum);
        }
        return maxPos;
    }
}