class Solution {
    public int maximumCount(int[] nums) {
        int Count_pos=0;
        int Count_neg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                Count_pos +=1;
            }
            else if(nums[i]<0){
                Count_neg +=1;

            }
          
        }
        return Math.max(Count_pos,Count_neg);

    }
}