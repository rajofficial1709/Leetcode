class Solution {
    public int findPeakElement(int[] nums) {
       int i=0;
       int max=nums[0];
       int index=0;
       for( i=0;i<nums.length;i++){
         if(nums[i]>max){
            max=nums[i];
            index=i;
         }
       }
       return index;
    }
}