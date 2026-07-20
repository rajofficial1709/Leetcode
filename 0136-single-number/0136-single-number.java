class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int low=0,hig=nums.length-1;
        if(nums.length==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[hig]!=nums[hig-1]){
            return nums[hig];
        }
        while(low<=hig){
            int mid=low+(hig-low)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])return nums[mid];
            int f=mid,s=mid;
            if(nums[mid]==nums[mid-1]){
                f=mid-1;

            }
            else{
                s=mid+1;
            }
            int leftcount=f-low;
            if(leftcount%2==0){
                low=s+1;
            }
            else{
                hig=f-1;
            }
        }
        return 774;
    }
}