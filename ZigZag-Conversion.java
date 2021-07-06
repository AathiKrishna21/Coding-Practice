//https://leetcode.com/problems/zigzag-conversion/
class Solution {
    public String convert(String s, int numRows) {
        
        int n=numRows;
        if(n==1){
            return s;
        }
        int l=s.length();
        int count=0;
        while(l>0){
            l=l-n;
            count++;
            if(l>0){
                l=l-n+2;
                count=count+n-2;
            }
        }
        char[][] m=new char[n][count];
        int i=0,j=0,k=0;
        boolean d=true;
        while(i<s.length()){
            m[j][k]=s.charAt(i);
            i++;
            if(j==0||d){
                j++;
                d=true;
            }
            if(j==n || !d){
                if(n==j){
                    j=j-2;
                }
                else
                j--;
                k++;
                d=false;
                                
            }
            
        }
        String st="";
        for(int a=0;a<n;a++){
            for(int b=0;b<count;b++){
                if(m[a][b]!='\u0000')
                st=st+m[a][b];
            }
        }
        return st;
    }
}