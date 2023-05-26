class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sn = new StringBuilder("0");
        for(int i = 0; i < n-1; i++){
            sn.append("1" + invert(sn));
        }
        return sn.charAt(k-1);
    }

    public StringBuilder invert(StringBuilder sn){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < sn.length(); i++){
            char c = sn.charAt(i);
            if(c == '1')
                c = '0';
            else
                c = '1';
            sb.append(c);
        }
        return sb.reverse();
    }
}