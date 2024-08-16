class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int minVal = arrays.get(0).get(0);
        int maxVal = arrays.get(0).get(arrays.get(0).size()-1);
        int maxDistance = 0;
        
        for(int i=1; i<arrays.size(); i++){
            int currentMin = arrays.get(i).get(0);
            int currentMax = arrays.get(i).get(arrays.get(i).size() - 1);
            
            maxDistance = Math.max(maxDistance, Math.abs(currentMax - minVal));
            maxDistance = Math.max(maxDistance, Math.abs(maxVal - currentMin));
            
            // Update global min and max
            maxVal = Math.max(maxVal, currentMax);
            minVal = Math.min(minVal, currentMin);
        }
        
        return maxDistance;
        }
}