class Solution {
    public String restoreString(String s, int[] indices) {
        char[] c = s.toCharArray();
        char[] cR = new char[c.length];
        for(int i = 0; i < c.length; i++){
            cR[indices[i]] = c[i];
        }
        
        String result = "";
        for(int i = 0; i < cR.length; i++){
            result+=cR[i];
        }
        return result;
    }
}