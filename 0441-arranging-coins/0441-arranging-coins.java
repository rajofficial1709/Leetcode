class Solution {
    public int arrangeCoins(int n) {
       int low=1,hig=n,ans=0;
        while(low<=hig){
             int mid=low+(hig-low)/2;
             long coins=(long)mid*(mid+1)/2;
            if(coins<=n){
                ans=mid;
                low=mid+1;
             }
            else{
                hig=mid-1;
            }
        } 
      
       return (int)ans;
    }
}