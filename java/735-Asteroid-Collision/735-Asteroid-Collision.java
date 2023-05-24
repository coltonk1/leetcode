class Solution {
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
                        asteroidList.remove(i-1);
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