class Solution {
    public boolean search(int[] nums, int target) {
        int low=0,hig=nums.length-1;
        while(low<=hig){
            int mid=low+(hig-low)/2;
            if(nums[mid]==target)return true;
            if(nums[low] == nums[mid] && nums[mid] == nums[hig]){
                      low++;
                      hig--;
                      continue;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && nums[mid]>target) hig=mid-1;
                else low=mid+1;
            }
            else{
                if(nums[mid]<target && nums[hig]>=target) low=mid+1;
                else hig=mid-1;
            }
        }
        return false;
    }
}