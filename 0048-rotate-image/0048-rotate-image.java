class Solution {
    public void rotate(int[][] mat) {
        int n=mat.length;
        int top=0;
        int bottom=n-1;
        while(top<bottom){
            for(int col=0;col<n;col++){
                int temp=mat[top][col];
                mat[top][col]=mat[bottom][col];
                mat[bottom][col]=temp;
            }
            top++;
            bottom--;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
}