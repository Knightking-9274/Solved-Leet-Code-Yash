class Solution {
    public int passThePillow(int n, int time) {
         int position = 1; // Start at person 1
        boolean forward = true; // Initially move forward

        for (int i = 0; i < time; i++) {
            if (forward) {
                position++;
                if (position == n) { // Reached the last person, change direction
                    forward = false;
                }
            } else {
                position--;
                if (position == 1) { // Reached the first person, change direction
                    forward = true;
                }
            }
        }

        return position;
    }   
    
}