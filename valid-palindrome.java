//https://leetcode.com/problems/valid-palindrome/
class Solution {
    public boolean isPalindrome(String s) {
        String t="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)<123 && s.charAt(i)>96) || (s.charAt(i)>47 && s.charAt(i)<58)){
            t=t+s.charAt(i);
            }
        }
        int n=t.length();
        if(n==1){
            return true;
        }
        for(int i=0;i<n/2;i++){
            if(t.charAt(i)!=t.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}