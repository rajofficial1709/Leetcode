class Solution {
    public int[][] transpose(int[][] matrix) {
        // ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
         int[][] temp=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix[0].length;i++){
            // ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<matrix.length;j++){
                // row.add(matrix[j][i]);
                temp[i][j]=matrix[j][i];
            }
            // ans.add(row);
        }
        return temp;
    }
}