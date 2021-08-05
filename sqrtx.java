//https://leetcode.com/problems/sqrtx/
class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int num;
        for(num=1;num<=x/num;num++){
            int t=num*num;
            if(x==t){
                return num;
            }
            if(t>x){
                return num-1;
            }
        }
        return num-1;
    }
}