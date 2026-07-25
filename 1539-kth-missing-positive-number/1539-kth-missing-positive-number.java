class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0,hig=arr.length-1;
        while(low<=hig){
            int mid=low+(hig-low)/2;
            int correct_value=mid+1;
            int missing=arr[mid]-correct_value;
            if(missing>=k){
                hig=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low+k;
    }
}