class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            hash.put(target[i], hash.getOrDefault(target[i], 0) + 1);
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) - 1);
        }
        for (int i : hash.keySet()) {
            if (hash.get(i) != 0)
                return false;
        }
        return true;
    }
}