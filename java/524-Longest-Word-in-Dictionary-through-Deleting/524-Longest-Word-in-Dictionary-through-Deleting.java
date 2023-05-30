class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary);
        String result = "";
        for(String dictString : dictionary){
            if(dictString.length() <= result.length()) continue;
            int left = 0;
            boolean valid = true;
            for(int i = 0; i < dictString.length(); i++){
                int index = s.indexOf(dictString.charAt(i), left);
                if(index < 0){
                    valid = false;
                    break;
                }
                left = index+1;
            }
            if(!valid) continue;
            result = dictString;
        }
        return result;
    }
}