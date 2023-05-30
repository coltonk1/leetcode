class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        String result = "";
        //Beginning
        for(int i = 0; i < s.length(); i+=numRows+(numRows-2)){
            result+=s.charAt(i);
        }

        boolean pick = true;
        for(int x = 1; x <= numRows-2; x++){
            pick = true;
            for(int i = x; i < s.length();){
                System.out.println(x + " : " + i);
                result += s.charAt(i);
                if(pick)
                    i += (numRows-2)*2-(x-1)*2;
                else
                    i += 2*x;
                pick = !pick;
            }
        }
        //End
        for(int i = numRows-1; i < s.length(); i+=numRows+(numRows-2)){
            result+=s.charAt(i);
        }
        return result;
    }
}