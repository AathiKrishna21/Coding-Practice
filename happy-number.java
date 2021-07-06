//https://leetcode.com/problems/happy-number/
class Solution {
    public int l=0;
    public boolean isHappy(int n) {
        try{
            int sum=0;
            while(n!=0){
                int t=n%10;
                sum=sum+(t*t);
                n=n/10;
            }
            if(sum==1){
                return true;
            }
            else if(l>15){
                return false;
            }
            else{
                l++;
                return isHappy(sum);
            }
        }
        catch(Exception e){
            return false;
        }
    }
}