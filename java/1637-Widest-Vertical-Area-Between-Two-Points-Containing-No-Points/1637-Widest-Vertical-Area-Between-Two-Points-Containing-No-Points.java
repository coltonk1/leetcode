class Solution {
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