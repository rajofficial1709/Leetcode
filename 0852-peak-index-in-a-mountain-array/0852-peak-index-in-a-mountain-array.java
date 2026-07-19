class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=1,hig=arr.length-1-1;
        while(low<=hig){
            int mid=(low+hig)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                low=mid+1;
            }
            else{
                hig=mid-1;
            }
        }
        return 23672;
    }
}