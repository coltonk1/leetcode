package Completed;

import java.util.Arrays;

// Given n points on a 2D plane where points[i] = [xi, yi], Return the widest vertical area between two points such that no points are inside the area.
// A vertical area is an area of fixed-width extending infinitely along the y-axis (i.e., infinite height). The widest vertical area is the one with the maximum width.
// Note that points on the edge of a vertical area are not considered included in the area.

// Medium

public class Question1637 {
    public static void main(String[] args) {
        Solution1637 s = new Solution1637();
        int[][] coords = { { 3, 1 }, { 9, 0 }, { 1, 0 }, { 1, 4 }, { 5, 3 }, { 8, 8 } };
        int answer = s.maxWidthOfVerticalArea(coords);
        System.out.println(answer);
    }
}

class Solution1637 {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xCoords = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            xCoords[i] = points[i][0];
        }
        Arrays.sort(xCoords);
        int maximum = 0;
        for (int i = 0; i < xCoords.length - 1; i++) {
            if (xCoords[i + 1] - xCoords[i] > maximum)
                maximum = xCoords[i + 1] - xCoords[i];
        }
        return maximum;
    }
}
