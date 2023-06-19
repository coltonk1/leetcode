class Solution {
    public int compress(char[] chars) {
        List<Character> c = new ArrayList<>();
        int amt = 1;
        for(int i = 1; i < chars.length; i++){
            if(chars[i-1] == chars[i]){
                amt++;
            }
            else{
                c.add(chars[i-1]);
                if(amt != 1){
                    String s = Integer.toString(amt);
                    for(char ch : s.toCharArray()){
                        c.add(ch);
                    }
                }
                amt = 1;
            }
        }
        c.add(chars[chars.length-1]);
        if(amt != 1){
            String s = Integer.toString(amt);
            for(char ch : s.toCharArray()){
                c.add(ch);
            }
        }
        for(int i = 0; i < c.size(); i++){
            chars[i] = c.get(i);
        }
        return c.size();
    }
}