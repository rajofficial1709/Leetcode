class Solution {
    public int mySqrt(int n) {
        long low=0,hig=n;
        while(low<=hig){
            long mid=(low+hig)/2;
            if(mid*mid==n){
                return (int)mid;
            }
            else if(mid*mid>n){
                hig=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return (int)hig;
    }
}