import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> d = new ArrayDeque<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                d.add(asteroids[i]);
            } else {
                while (!d.isEmpty() && d.peekLast() > 0 && Math.abs(asteroids[i]) > d.peekLast()) {
                    d.pollLast();
                }
                if (d.isEmpty() || d.peekLast() < 0) {
                    d.add(asteroids[i]);
                } else if (Math.abs(asteroids[i]) == d.peekLast()) {
                    d.pollLast(); // Both asteroids are destroyed
                }
            }
        }

        int[] result = new int[d.size()];
        int index = 0;
        for (int value : d) {
            result[index++] = value;
        }

        return result;
    }
}
