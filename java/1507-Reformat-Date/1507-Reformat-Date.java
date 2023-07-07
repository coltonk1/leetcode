class Solution {
    public String reformatDate(String date) {
        String[] args = date.split(" ");
        Map<String, String> months = new HashMap<String, String>();
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");
        StringBuilder result = new StringBuilder("");
        result.append(args[2]);
        result.append("-");
        result.append(months.get(args[1]));
        result.append("-");
        String day = args[0].substring(0, args[0].length()-2);
        if(day.length() == 1) day = "0" + day;
        result.append(day);
        return args[2]+"-"+months.get(args[1])+"-"+day;
    }
}