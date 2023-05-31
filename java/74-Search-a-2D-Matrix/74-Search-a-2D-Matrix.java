class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int x = 0; x < matrix.length; x++){
            if(Arrays.binarySearch(matrix[x], target) >= 0)
                return true;
        }
        return false;
    }
}