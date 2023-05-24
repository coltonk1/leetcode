class Solution {
    public String largestTimeFromDigits(int[] arr) {
        int maxHour = -1;
        int maxMinute = -1;
        String maxHourString = "-1";
        String maxMinuteString = "-1";

        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr.length; b++) {
                if (a == b)
                    continue;
                int hour = Integer.parseInt(arr[a] + "" + arr[b]);
                if (hour >= 24 || hour < maxHour)
                    continue;
                maxMinute = -1;

                for (int c = 0; c < arr.length; c++) {
                    if (b == c || a == c)
                        continue;
                    for (int d = 0; d < arr.length; d++) {
                        if (d == c || d == b || d == a)
                            continue;
                        int minute = Integer.parseInt(arr[c] + "" + arr[d]);
                        if (minute >= 59 || minute < maxMinute)
                            continue;
                        maxHour = hour;
                        maxMinute = minute;
                        maxHourString = hour + "";
                        maxMinuteString = minute + "";
                    }
                }
            }
        }

        if (maxHourString.equals("-1") || maxMinuteString.equals("-1"))
            return "";

        if (maxHourString.length() == 1)
            maxHourString = "0" + maxHourString;
        if (maxMinuteString.length() == 1)
            maxMinuteString = "0" + maxMinuteString;

        return maxHourString + ":" + maxMinuteString;
    }
}