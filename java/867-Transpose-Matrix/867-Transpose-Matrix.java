class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] output = new int[matrix[0].length][matrix.length];
        for(int x = 0; x < matrix[0].length; x++){
            for(int y = 0; y < matrix.length; y++){
                output[x][y] = matrix[y][x];
            }
        }
        return output;
    }
}