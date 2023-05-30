class Solution {
    public int reverse(int x) {
        boolean negative = false;
        if(x < 0)
            negative = true;

        if(x == Integer.MIN_VALUE)
            return 0;
        x = Math.abs(x);
        StringBuilder num = new StringBuilder(Integer.toString(x));
        num = num.reverse();
        long result = Long.parseLong(num.toString());

        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            return 0;

        return (int)result * (negative ? -1 : 1);

    }
}