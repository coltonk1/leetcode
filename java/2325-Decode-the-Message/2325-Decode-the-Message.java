class Solution {
    public String decodeMessage(String key, String message) {
        List<Character> decode = new ArrayList<>();
        int current = 0;
        for(int i = 0; i < key.length(); i++){
            if(key.charAt(i) != ' ' && key.indexOf(key.charAt(i)) == i){
                decode.add(key.charAt(i));
                current++;
            }
        }


        String result = "";
        for(int i = 0; i < message.length(); i++){
            if(message.charAt(i) == ' '){
                result += " ";
                continue;
            }
            result += (char) (decode.indexOf(message.charAt(i))+97);
        }
        return result;
    }
}