class Solution {
    public String reformatDate(String date) {
        String[] args = date.split(" ");
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String month = (Arrays.asList(months).indexOf(args[1])+1)+"";
        String day = args[0].substring(0, args[0].length()-2);
        if(day.length() == 1) day = "0" + day;
        if(month.length() == 1) month = "0" + month;
        return args[2]+"-"+month+"-"+day;
    }
}