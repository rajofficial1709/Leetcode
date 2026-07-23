class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int low=0,row=arr.length,col=arr[0].length,hig=row*col-1;
        while(low<=hig){
            int mid=low+(hig-low)/2;
            int midrow=mid/col, midcol=mid%col;
            if(arr[midrow][midcol]==target){
                return true;
            }
            else if(arr[midrow][midcol]>target){
                hig=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}