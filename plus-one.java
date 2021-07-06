//https://leetcode.com/problems/plus-one/
class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int flag=1;
        int[] t= new int[n+1];
        for(int i=n-1;i>=0;i--){
            
            digits[i]=digits[i]+flag;
            if(digits[i]>9){
                digits[i]=digits[i]%10;
                t[i+1]=digits[i];
                flag=1;
                if(i==0){
                    t[0]=1;
                    return t;
                }
            }
            else{
                flag=0;
                return digits;
            }
        }
        return digits;
    }
}
