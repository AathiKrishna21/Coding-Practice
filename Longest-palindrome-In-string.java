class Solution {
    public boolean isPali(String s){
        int n=s.length();
        for(int i=0;i<(int)n/2;i++){
            // System.out.println(i);
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        int maxl=1;
        int start=0;
        int st=0,end=0;
        if(isPali(s)){
            return s;
        }
        else{
            end++;
            while(end<n && st<n){
                // System.out.println(s.substring(st,end+1)+" "+isPali(s.substring(st,end+1)));
                if(isPali(s.substring(st,end+1))){
                    if(maxl<end-st+1){
                        maxl=1+end-st;
                        start=st;
                    }
                    
                }
                end++;
                if(end>=n){
                    ++st;
                    end=st+1;
                }
            }
            return s.substring(start,start+maxl);
        }
        // return s;
        
    }
}