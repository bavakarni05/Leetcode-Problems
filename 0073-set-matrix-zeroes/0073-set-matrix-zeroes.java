class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> row=new HashSet<>();
        HashSet<Integer> col=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(Integer c:col){
        for(int i=0;i<matrix.length;i++){
            matrix[i][c]=0;
        }
        }
         for(Integer r:row){
        for(int i=0;i<matrix[0].length;i++){
            matrix[r][i]=0;
        }
        }
    }
}