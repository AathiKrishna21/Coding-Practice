//https://leetcode.com/problems/wildcard-matching/
class Solution {
    public boolean isMatch(String s, String p) {
        int n=s.length(),m=p.length();
        boolean[][] dp=new boolean[n+1][m+1];
        dp[0][0]=true;
        if(s.equals(p)){
                return true;
            }
        int i=0;
        while(m>0&& m>i && p.charAt(i)=='*'){
            dp[0][i+1]=true;
            i++;
        }
        for(i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(p.charAt(j-1)=='*'&&(dp[i][j-1]||dp[i-1][j]))
                    dp[i][j]=true;
                else if(p.charAt(j-1)=='?'&&dp[i-1][j-1])
                    dp[i][j]=true;
                
                else if((s.charAt(i-1)==p.charAt(j-1))&&dp[i-1][j-1]){
                    dp[i][j]=true;
                }
            }
        }
        return dp[n][m];
        
    }
}