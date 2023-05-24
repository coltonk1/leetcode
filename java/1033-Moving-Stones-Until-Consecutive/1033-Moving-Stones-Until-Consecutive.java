class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int largest = a;
        int smallest = a;
        if (b > largest)
            largest = b;
        else if (b < smallest)
            smallest = b;
        if (c > largest)
            largest = c;
        else if (c < smallest)
            smallest = c;
        int middle = a;
        if (c != largest && c != smallest)
            middle = c;
        else if (b != largest && b != smallest)
            middle = b;

        int difference = largest - smallest - 2;
        int[] result = new int[2];
        if (difference == 0) {
            result[0] = result[1] = 0;
            return result;
        } else {
            if (middle - smallest <= 2 || largest - middle <= 2)
                result[0] = 1;
            else
                result[0] = 2;
            result[1] = difference;
            return result;
        }

    }
}