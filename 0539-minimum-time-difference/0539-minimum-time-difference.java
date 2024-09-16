class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> minutesList = new ArrayList<>();
        for (String time : timePoints) {
            String[] parts = time.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            // Convert to total minutes
            int totalMinutes = hours * 60 + minutes;
            minutesList.add(totalMinutes);
        }

        Collections.sort(minutesList);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < minutesList.size(); i++) {
            minDiff = Math.min(minDiff, minutesList.get(i) - minutesList.get(i - 1));
        }

        
        int firstTime = minutesList.get(0);
        int lastTime = minutesList.get(minutesList.size() - 1);
        int wrapAroundDiff = (1440 - lastTime) + firstTime;  // 1440 minutes in a day

        return Math.min(minDiff, wrapAroundDiff);
    }
}