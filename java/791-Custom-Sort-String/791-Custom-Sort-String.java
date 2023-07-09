class Solution {
    public String customSortString(String order, String s) {
        StringBuilder output = new StringBuilder("");
        for(int i = 0; i < order.length(); i++){
            while(s.indexOf(order.charAt(i)) >= 0){
                output.append(order.charAt(i));
                s=s.replaceFirst(order.charAt(i)+"", "");
            }
        }
        output.append(s);
        return output.toString();
    }
}