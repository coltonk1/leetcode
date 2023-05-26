class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sn = new StringBuilder("0");
        for(int i = 0; i < n-1; i++){
            sn.append("1" + invert(sn));
        }
        return sn.charAt(k-1);
    }

    public StringBuilder invert(StringBuilder sn){
        String tmp = sn.toString();
        tmp = tmp.replaceAll("0", "2");
        tmp = tmp.replaceAll("1", "0");
        tmp = tmp.replaceAll("2", "1");
        StringBuilder sb = new StringBuilder(tmp);
        return sb.reverse();
    }
}