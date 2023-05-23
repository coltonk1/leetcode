package Completed;

// There are three stones in different positions on the X-axis. You are given three integers a, b, and c, the positions of the stones.

// In one move, you pick up a stone at an endpoint (i.e., either the lowest or highest position stone), and move it to an unoccupied position between those endpoints. Formally, let's say the stones are currently at positions x, y, and z with x < y < z. You pick up the stone at either position x or position z, and move that stone to an integer position k, with x < k < z and k != y.

// The game ends when you cannot make any more moves (i.e., the stones are in three consecutive positions).

// Return an integer array answer of length 2 where:

// answer[0] is the minimum number of moves you can play, and
// answer[1] is the maximum number of moves you can play.

// Medium

public class Question1033 {
    public static void main(String[] args) {
        Solution1033 s = new Solution1033();
        s.numMovesStones(4, 8, 1);
    }
}

class Solution1033 {
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
