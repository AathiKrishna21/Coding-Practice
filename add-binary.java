//https://leetcode.com/problems/add-binary/
class Solution {
    public String addBinary(String a, String b) {
        int n=a.length(),m=b.length(),t=0;
        String x="0".repeat(Math.abs(m-n));
        String s="";
        if(m>n){
            a=x+a;
        }
        else if(m<n){
            b=x+b;
        }
        System.out.println(a+" "+b);
        for(int i=Math.max(n,m)-1;i>=0;i--){
            if(t==0){
                if(a.charAt(i)=='1' && b.charAt(i)=='1'){
                    t=1;
                    s="0"+s;
                }
                else if(a.charAt(i)=='1' || b.charAt(i)=='1'){
                    t=0;
                    s="1"+s;
                }
                else{
                    s="0"+s;
                }
            }
            else{
                t=0;
                if(a.charAt(i)=='1' && b.charAt(i)=='1'){
                    t=1;
                    s="1"+s;
                }
                else if(a.charAt(i)=='1' || b.charAt(i)=='1'){
                    t=1;
                    s="0"+s;
                }
                else{
                    s="1"+s;
                }
                
            }
        }
        if(t==1){
            s=t+s;
        }
        System.out.println(s);

        return s;
    }
}