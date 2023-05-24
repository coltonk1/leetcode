class Solution {
    public int rearrangeCharacters(String s, String target) {
       List<String> sA = new ArrayList<>(Arrays.asList(s.split("")));
        List<String> tA = new ArrayList<>(Arrays.asList(target.split("")));
        int[] amounts = new int[tA.size()];
        boolean valid = true;
        while (valid) {
            for (int i = 0; i < tA.size() && valid; i++) {
                if (sA.indexOf(tA.get(i)) >= 0) {
                    amounts[i]++;
                    sA.remove(tA.get(i));
                } else {
                    valid = false;
                }
            }
        }
        int min = amounts[0];
        for (int i = 1; i < amounts.length; i++) {
            if (amounts[i] < min)
                min = amounts[i];
        }
        return min;
    }
}