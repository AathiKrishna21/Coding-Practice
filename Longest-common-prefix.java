//https://leetcode.com/problems/longest-common-prefix/
class Solution {
    public String back(String a,String b){
        String c="";
        int t=Math.min(a.length(),b.length());
        for(int i=0;i<t;i++){
            if(a.charAt(i)==b.charAt(i)){
                c=c+a.charAt(i);
            }
            else{
                break;
            }
        }
        return c;
    }
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        for(int i=1;i<strs.length;i++){
            s=back(s,strs[i]);
        }
        return s;
    }
}