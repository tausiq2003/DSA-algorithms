class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length - 1;
        for(int i = 0; i < mat.length; i++){
            sum += mat[i][i];
            if (n != 0){
                sum += mat[i][n + i];
            }
            n -= 2;
            

        }
        return sum;
    }
}