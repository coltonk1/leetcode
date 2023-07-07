class Solution {
    public String interpret(String command) {
        StringBuilder output = new StringBuilder("");
        for(int i = 0; i < command.length();){
            if(command.charAt(i) == 'G'){
                output.append("G");
                i++;
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                output.append("o");
                i+=2;
            }
            else{
                output.append("al");
                i+=4;
            }
        }
        return output.toString();
    }
}