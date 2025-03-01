class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix[0].length;
        for(int i=0;i<(n/2+n%2);i++){
            for(int j=0;j<n/2;j++){
                int tmp=matrix[n-1-j][i];
                matrix [n-1-j][i]=matrix[n-1-i][n-j-1];
                matrix[n-1-i][n-j-1]=matrix[j][n-1-i];
                matrix[j][n-1-i]=matrix[i][j];
                matrix[i][j]=tmp;
            }
        }
    }
}