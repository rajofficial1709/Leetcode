class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans=new ArrayList<>();
        int left=0,right=arr[0].length-1;
        int top=0,bottom=arr.length-1;
        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++){
                ans.add(arr[top][j]);
            }
            top++;
            if(top>bottom || left>right) break;
            for(int i=top;i<=bottom;i++){
                ans.add(arr[i][right]);
            }
            right--;
            if(top>bottom || left>right) break;
            for(int j=right;j>=left;j--){
                ans.add(arr[bottom][j]);
            }
            bottom--;
            if(top>bottom || left>right) break;
            for(int i=bottom;i>=top;i--){
                ans.add(arr[i][left]);
            }
            left++;
        }
        return ans;
    }
}