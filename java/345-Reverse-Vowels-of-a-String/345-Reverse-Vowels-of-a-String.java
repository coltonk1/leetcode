class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        List<Integer> indexes = new ArrayList<>();
        
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        for(int i = 0; i < c.length; i++){
            for(int a = 0; a < vowels.length; a++){
                if(c[i] == vowels[a]){
                    indexes.add(i);
                    continue;
                }
            }
        }
        char[] newC = c.clone();
        for(int i = 0; i < indexes.size(); i++){
            newC[indexes.get(i)] = c[indexes.get(indexes.size()-i-1)];
        }
        String result = "";
        for(char ch : newC){
            result += ch;
        }
        return result;
    }
}