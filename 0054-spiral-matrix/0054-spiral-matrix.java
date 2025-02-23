class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            for(int j=startCol;j<=endCol;j++){
                arr.add(matrix[startRow][j]);
            }
            for(int i=startRow+1;i<=endRow;i++){
                arr.add(matrix[i][endCol]);
            }
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                arr.add(matrix[endRow][j]);
            }
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                arr.add(matrix[i][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return arr;
    }
}