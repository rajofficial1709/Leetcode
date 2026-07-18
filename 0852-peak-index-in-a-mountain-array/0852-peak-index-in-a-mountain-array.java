class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int max=arr[0];
        int index=0;
        for(i=0;i<=arr.length-1;i++){
           
            if(arr[i]>max){
                max=arr[i];
                index=i;
                
            }
        }
        return index;
    }
}