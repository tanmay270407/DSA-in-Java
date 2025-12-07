class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] temp=new int[rows][cols];
        int temp2;

        for(int i=0;i<cols;i++){
            temp2=cols-1;
            for(int j=0;j<rows;j++){
                temp[i][j]=matrix[temp2-j][i];
            }
        }  
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = temp[i][j];
            }
        }  
    }
}