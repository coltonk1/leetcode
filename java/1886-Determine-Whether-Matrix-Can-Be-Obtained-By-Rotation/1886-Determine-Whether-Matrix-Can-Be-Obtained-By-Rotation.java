class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        float f = (mat.length-1)/2f;
        if(same(mat, target)) return true;
        for(int i = 0; i < 3; i++){
            int[][] result = new int[mat.length][mat.length];
            for(int x = 0; x < mat.length; x++){
                for(int y = 0; y < mat[0].length; y++){
                    result[y][(int)(-((float)x-f)+f)] = mat[x][y];
                }
            }
            mat=result.clone();
            if(same(result,target)) return true;
        }
        return false;
    }
    public boolean same(int[][] a, int[][] b){
        for(int x = 0; x < a.length; x++){
            for(int y = 0; y < a.length; y++){
                if(a[x][y] != b[x][y]) return false;
            }
        }
        return true;
    }
}