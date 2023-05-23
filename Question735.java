package Completed;

// We are given an array asteroids of integers representing asteroids in a row.

// For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

// Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

//Medium

import java.util.ArrayList;
import java.util.List;

public class Question735 {
    public static void main(String[] args) {
        Solution735 s = new Solution735();
        int[] asteroids = { 5, 10, -5 };
        int[] result = s.asteroidCollision(asteroids);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}

class Solution735 {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> asteroidList = new ArrayList<>();
        for (int i : asteroids) {
            asteroidList.add(i);
        }

        while (true) {
            boolean valid = false;
            for (int i = 1; i < asteroidList.size() && asteroidList.size() > 1; i++) {
                if (asteroidList.get(i - 1) > 0 && asteroidList.get(i) < 0) {
                    if (Math.abs(asteroidList.get(i - 1)) > Math.abs(asteroidList.get(i))) {
                        asteroidList.remove(i);
                    } else if (Math.abs(asteroidList.get(i - 1)) < Math.abs(asteroidList.get(i))) {
                        asteroidList.remove(i - 1);
                    } else {
                        asteroidList.remove(i);
                        asteroidList.remove(i - 1);
                    }
                    valid = true;
                    break;
                }
            }
            if (!valid)
                break;
        }
        int[] result = new int[asteroidList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = asteroidList.get(i);
        }
        return result;
    }
}