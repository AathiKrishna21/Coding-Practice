//https://leetcode.com/problems/ugly-number/
class Solution {
    public boolean isUgly(int n) {
        boolean flag=false;
        if(n<1){
            return false;
        }
        while(n%2==0){
            n=n/2;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            while(n%i==0){
                if(i!=3 && i!=5){
                    return false;
                }
                n=n/i;
            }
        }
        if(n>2 && n!=3 && n!=5 ){
            return false;
        }
        return true;
    }
}